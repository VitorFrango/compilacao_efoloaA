import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.ParseCancellationException;

public class MontPyLexerTest {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Uso: java MontPyLexerTest <caminho_para_arquivo>");
            System.exit(1);
        }

        String filePath = args[0];

        try {
            CharStream input = CharStreams.fromFileName(filePath);
            MontPyLexer lexer = new MontPyLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            MontPyParser parser = new MontPyParser(tokens);

            lexer.removeErrorListeners();
            parser.removeErrorListeners();

            lexer.addErrorListener(ThrowingErrorListener.INSTANCE);
            parser.addErrorListener(ThrowingErrorListener.INSTANCE);

            parser.program();  // Supondo que 'program' é o ponto de entrada da sua gramática

        } catch (ParseCancellationException e) {
            System.err.println("Erro de análise: " + e.getMessage());
            System.exit(1);
        } catch (Exception e) {
            System.err.println("Erro ao processar o arquivo: " + e.getMessage());
            System.exit(1);
        }
    }

    static class ThrowingErrorListener extends BaseErrorListener {

        public static final ThrowingErrorListener INSTANCE = new ThrowingErrorListener();

        @Override
        public void syntaxError(Recognizer<?, ?> recognizer,
                                Object offendingSymbol,
                                int line,
                                int charPositionInLine,
                                String msg,
                                RecognitionException e)
        {
            String error = "Linha " + line + ":" + charPositionInLine + " " + msg;
            throw new ParseCancellationException(error);
        }
    }
}
