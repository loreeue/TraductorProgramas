package NotificacionErrores;

import org.antlr.v4.runtime.*;

public class SubrayadoErrores extends BaseErrorListener {
    public void syntaxError(Recognizer<?, ?> reconocedor, Object simbolo, int linea,
                            int posChar, String mensaje, RecognitionException e) {
        System.err.println("Línea " + linea + ":" + posChar + " " + mensaje);
        subrayarError(reconocedor,(Token)simbolo, linea, posChar);
    }
    protected void subrayarError(Recognizer reconocedor, Token token, int linea, int posChar) {
        CommonTokenStream tokens = (CommonTokenStream)reconocedor.getInputStream();
        String input = tokens.getTokenSource().getInputStream().toString();
        String[] lineas = input.split("\n");
        String lineaError = lineas[linea - 1];
        System.err.println(lineaError);
        for (int i = 0; i < posChar; i++) System.err.print(" ");
        int start = token.getStartIndex();
        int stop = token.getStopIndex();
        if (start >= 0 && stop >= 0) {
            for (int i = start; i <= stop; i++) System.err.print("^");
        }
        System.err.println();
    }
}