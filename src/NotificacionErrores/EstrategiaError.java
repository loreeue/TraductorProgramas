package NotificacionErrores;

import org.antlr.v4.runtime.*;
import java.util.HashSet;
import java.util.Set;

public class EstrategiaError extends DefaultErrorStrategy {
    @Override
    public void reportNoViableAlternative(Parser parser, NoViableAltException e) throws RecognitionException {
        String msg = "No hay alternativa viable para la entrada '" + e.getOffendingToken().getText() + "'";
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportFailedPredicate(Parser parser, FailedPredicateException e) throws RecognitionException {
        String msg = "La expresión no cumplió con la condición requerida: " + e.getPredicate();
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportInputMismatch(Parser parser, InputMismatchException e) throws RecognitionException {
        String msg = "Se esperaba " + expectedTokens(parser) + " en lugar de '" + e.getOffendingToken().getText() + "'";
        parser.notifyErrorListeners(e.getOffendingToken(), msg, e);
    }

    @Override
    public void reportMissingToken(Parser parser) throws RecognitionException {
        Token token = parser.getCurrentToken();
        String msg = "Falta el token '" + expectedTokens(parser) + "' y se reconoce '" + token.getText() + "'";
        parser.notifyErrorListeners(token, msg, null);
    }

    @Override
    public void reportUnwantedToken(Parser parser) throws RecognitionException {
        Token token = parser.getCurrentToken();
        String msg = "Token no esperado '" + token.getText() + "', se esperaba " + expectedTokens(parser);
        parser.notifyErrorListeners(token, msg, null);
    }

    private Set<String> expectedTokens(Parser parser){
        Set<String> expectedTokens = new HashSet<>();
        for(int i :parser.getExpectedTokens().toSet())
            expectedTokens.add(parser.getVocabulary().getDisplayName(i));
        return expectedTokens;
    }
}