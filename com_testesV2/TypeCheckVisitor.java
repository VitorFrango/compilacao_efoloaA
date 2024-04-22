import gen.MontPyBaseVisitor;
import gen.MontPyParser;
import gen.MontPyLexer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.Map;

public class TypeCheckVisitor extends MontPyBaseVisitor<Void> {
    private Map<String, String> symbolTable = new HashMap<>();

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

    private boolean isTypeCompatible(String declaredType, String valueType) {
        if (declaredType.equals("int") && !valueType.equals("int")) {
            return false;
        }
        if (declaredType.equals("float") && !valueType.equals("float")) {
            return false;
        }
        // Adicione mais regras conforme necessário
        return true;
    }

    @Override
    public Void visitAssignment(MontPyParser.AssignmentContext ctx) {
        System.out.println("Teste caralho");
        String id = ctx.ID().getText();
        if (symbolTable.containsKey(id)) {
            String expectedType = symbolTable.get(id);
            String actualType = getExpressionType(ctx.expression(0)); // Ajuste para chamar corretamente a expressão
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

    private String getExpressionType(MontPyParser.ExpressionContext ctx) {
    // Aprofunda na árvore de expressões para encontrar o TerminalNode relevante
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
        // Se não é um TerminalNode, explora recursivamente os filhos
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
