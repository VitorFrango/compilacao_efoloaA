import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import gen.MontPyLexer;
import gen.MontPyParser;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import gen.MontPyBaseVisitor;

public class TypeCheckVisitor extends MontPyBaseVisitor<Void> {
    private Map<String, String> symbolTable = new HashMap<>();

    public static void main(String[] args) {
        // Verifica se o caminho do arquivo de teste foi fornecido
        if (args.length != 1) {
            System.err.println("Uso: java SimplifiedPrecedenceVisitor <caminho_para_arquivo_de_teste>");
            System.exit(1);
        }

        String inputFile = args[0];

        try {
            TypeCheckVisitor visitor = new TypeCheckVisitor();
            visitor.checkTypesFromFile(inputFile);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void checkTypesFromFile(String inputFile) throws Exception {
        InputStream is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        MontPyLexer lexer = new MontPyLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MontPyParser parser = new MontPyParser(tokens);

        parser.removeErrorListeners();
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol,
                                    int line, int charPositionInLine, String msg, RecognitionException e) {
                System.err.println("Erro de Sintaxe: linha " + line + ":" + charPositionInLine + " em " +
                        offendingSymbol + ": " + msg);
            }
        });

        ParseTree tree = parser.program(); // Realiza o parsing da entrada
        System.out.println(tree.toStringTree(parser)); // Imprime a árvore de parsing

        visit(tree); // Executa a verificação de tipos na árvore de parsing
        System.out.println("Verificação de tipos concluída.");
    }

    @Override
    public Void visitVariable_declaration(MontPyParser.Variable_declarationContext ctx) {
        String type = ctx.type().getText();
        String id = ctx.ID().getText();
        if (ctx.expression() != null) {
            String actualType = getExpressionType(ctx.expression());
            System.out.println("Declarada variável '" + id + "' com tipo '" + type + "', valor atribuído do tipo '" + actualType + "'");
            if (!isTypeCompatible(type, actualType)) {
                System.err.println("Erro de tipo: Não é possível atribuir " + actualType + " a " + type);
            }
        } else {
            System.out.println("Declarada variável '" + id + "' com tipo '" + type + "'");
        }
        symbolTable.put(id, type);
        return visitChildren(ctx);
    }

    @Override
    public Void visitAssignment(MontPyParser.AssignmentContext ctx) {
        String id = ctx.ID().getText();
        if (symbolTable.containsKey(id)) {
            String expectedType = symbolTable.get(id);
            String actualType = getExpressionType(ctx.expression(0));
            if (!actualType.equals(expectedType)) {
                System.err.println("Erro de tipo: Não é possível atribuir " + actualType + " a " + expectedType);
            } else {
                System.out.println("Atribuição correta: " + id + " = " + actualType);
            }
        } else {
            System.err.println("Erro: Variável '" + id + "' não declarada.");
        }
        return visitChildren(ctx);
    }

    private boolean isTypeCompatible(String declaredType, String valueType) {
        if (declaredType.equals("int") && !valueType.equals("int")) {
            return false;
        }
        if (declaredType.equals("float") && !valueType.equals("float")) {
            return false;
        }
        return true;
    }

    private String getExpressionType(MontPyParser.ExpressionContext ctx) {
        // Explora a árvore de expressões para encontrar o tipo relevante
        return extractTypeFromExpression(ctx);
    }

    private String extractTypeFromExpression(ParseTree tree) {
        if (tree instanceof TerminalNode) {
            Token token = ((TerminalNode) tree).getSymbol();
            switch (token.getType()) {
                case MontPyLexer.INT:
                    return "int";
                case MontPyLexer.FLOAT:
                    return "float";
                case MontPyLexer.STRING:
                    return "string";
            }
        } else if (tree.getChildCount() > 0) {
            // Se não for um TerminalNode, explora os filhos recursivamente
            for (int i = 0; i < tree.getChildCount(); i++) {
                String type = extractTypeFromExpression(tree.getChild(i));
                if (!type.equals("unknown")) {
                    return type;
                }
            }
        }
        return "unknown";
    }
}
