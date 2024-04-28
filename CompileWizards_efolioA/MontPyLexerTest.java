import org.antlr.v4.runtime.*;

public class MontPyLexerTest {
    public static void main(String[] args) {
        // Verifica se o caminho do arquivo foi fornecido
        if (args.length != 1) {
            System.err.println("Uso: java MontPyLexerTest <caminho_para_arquivo>");
            System.exit(1);
        }

        // Lê o caminho do arquivo a partir dos argumentos
        String filePath = args[0];

        try {
            // Cria um stream de caracteres a partir do arquivo
            CharStream input = CharStreams.fromFileName(filePath);
            // Inicializa o lexer com o stream de entrada
            MontPyLexer lexer = new MontPyLexer(input);

            Token token;
            do {
                // Lê o próximo token
                token = lexer.nextToken();
                // Obtém o nome do token
                String tokenName = MontPyLexer.VOCABULARY.getDisplayName(token.getType());
                // Obtém o texto do token
                String tokenText = token.getText();

                // Se o fim do arquivo for alcançado, interrompe o loop
                if (token.getType() == Token.EOF) {
                    break;
                }

                // Verifica se há erros de token
                if (token.getType() == MontPyLexer.ERROR) {
                    System.err.printf("Erro: Token inesperado '%s'\n", tokenText);
                    throw new RuntimeException("Token inesperado encontrado");
                }

                // Exibe o token e o texto associado
                System.out.printf("Token: %s, Texto: \"%s\"\n", tokenName, tokenText);

                // Caso especial para tokens do tipo STRING
                if (token.getType() == MontPyLexer.STRING) {
                    System.out.printf("String encontrada: \"%s\"\n", tokenText);
                }
                // Caso especial para tokens do tipo DIGIT
                else if (token.getType() == MontPyLexer.DIGIT) {
                    System.out.printf("Número encontrado: %s\n", tokenText);
                }

            } while (token.getType() != Token.EOF);
        } catch (Exception e) {
            // Imprime erros relacionados à análise do arquivo
            System.err.println("Erro ao analisar o arquivo: " + e.getMessage());
            System.exit(1);
        }
    }
}
