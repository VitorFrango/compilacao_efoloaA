import org.antlr.v4.runtime.*;

public class MontPyLexerTest {
    public static void main(String[] args) throws Exception {
        // Create a CharStream that reads from standard input
        CharStream input = CharStreams.fromFileName(args[0]);

        // Create a lexer that feeds off of input CharStream
        MontPyLexer lexer = new MontPyLexer(input);

        // Create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Begin tokenizing
        Token token;
        while ((token = lexer.nextToken()).getType() != Token.EOF) {
            System.out.println(token);
        }
    }
}