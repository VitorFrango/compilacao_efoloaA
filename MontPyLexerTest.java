import org.antlr.v4.runtime.*;

public class MontPyLexerTest {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java MontPyLexerTest <caminho_para_arquivo>");
            System.exit(1);
        }

        String filePath = args[0];

        try {
            // Criando um analisador léxico para o conteúdo do arquivo
            CharStream input = CharStreams.fromFileName(filePath);
            MontPyLexer lexer = new MontPyLexer(input);

            // Iterando sobre os tokens gerados
            Token token;
            do {
                token = lexer.nextToken();
                String tokenName = MontPyLexer.VOCABULARY.getDisplayName(token.getType());
                String tokenText = token.getText();
                if (token.getType() != Token.EOF) {
                    System.out.printf("Token: %s, Texto: \"%s\"\n", tokenName, tokenText);
                }
            } while (token.getType() != Token.EOF);
        } catch (Exception e) {
            System.err.println("Erro ao analisar o arquivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
