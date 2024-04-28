import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class MontPyParserTest {
    public static void main(String[] args) {
        // Verifica se foi fornecido exatamente um argumento com o caminho do arquivo
        if (args.length != 1) {
            System.err.println("Uso: java MontPyParserTest <caminho_para_arquivo>");
            System.exit(1);
        }

        // Atribui o caminho do arquivo à variável filePath
        String filePath = args[0];

        try {
            // Cria um stream de caracteres a partir do arquivo especificado
            CharStream input = CharStreams.fromFileName(filePath);
            // Inicializa o lexer com o stream de entrada
            MontPyLexer lexer = new MontPyLexer(input);
            // Cria um stream de tokens a partir do lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            // Inicializa o parser com o stream de tokens
            MontPyParser parser = new MontPyParser(tokens);

            // Inicia o processo de parsing a partir da regra inicial 'program'
            ParseTree tree = parser.program();

            // Cria um walker de árvores para percorrer a árvore de parsing
            ParseTreeWalker walker = new ParseTreeWalker();
            // Cria um listener que será aplicado durante a caminhada pela árvore
            SimpleExpressionListener listener = new SimpleExpressionListener();
            // Percorre a árvore de parsing e aplica o listener
            walker.walk(listener, tree);

        } catch (Exception e) {
            // Trata exceções mostrando o erro e terminando o programa
            System.err.println("Erro ao analisar o arquivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
