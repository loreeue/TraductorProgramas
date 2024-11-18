import java.io.*;
import NotificacionErrores.EstrategiaError;
import NotificacionErrores.SubrayadoErrores;
import org.antlr.v4.runtime.*;

public class ClasePrincipal {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            String fileOutput = "salida.pas";
            printWriter = new PrintWriter(new FileWriter(fileOutput));
            String fileName = args[0];
            if (fileName.startsWith("src/")) {
                fileName = fileName.substring(4);
            }
            if (fileName.endsWith(".c")) {
                fileName = fileName.substring(0, fileName.length() - 2);
            }

            CharStream input = CharStreams.fromFileName(args[0]);
            GramaticaLexer analex = new GramaticaLexer(input);
            CommonTokenStream tokens = new CommonTokenStream(analex);
            GramaticaParser anasint = new GramaticaParser(tokens);
            anasint.removeErrorListeners();
            anasint.addErrorListener(new SubrayadoErrores());
            anasint.setErrorHandler(new EstrategiaError());
            anasint.setFileName(fileName);
            anasint.setPrintWriter(printWriter);
            anasint.axioma();
        } catch (org.antlr.v4.runtime.RecognitionException e) {
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
            System.err.println("RUN " + e.getMessage());
        } finally {
            if (printWriter != null) {
                printWriter.close();
            }
        }
    }
}