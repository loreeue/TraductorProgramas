package Traduccion;

public class Asignacion extends Instruccion{
    private String variableIzda;
    private String variableDcha;

    public Asignacion(String variableIzda, String variableDcha) {
        this.variableIzda = variableIzda;
        this.variableDcha = variableDcha;
    }

    public String getVariableIzda() {
        return variableIzda;
    }

    public String getVariableDcha() {
        return variableDcha;
    }

    @Override
    public String toString() {
        return this.getVariableIzda() + " := " + this.getVariableDcha() + ";";
    }
}