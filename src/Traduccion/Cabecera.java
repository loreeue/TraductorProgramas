package Traduccion;

import java.util.ArrayList;
import java.util.List;

public class Cabecera {
    private String tipo; //function o procedure
    private String nombre;
    private List<Variable> parametros;

    public Cabecera(String tipo, String nombre, List<Variable> parametros) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.parametros = sortParametros(parametros);
    }

    public String getNombre() {
        return nombre;
    }

    public List<Variable> getParametros() {
        return parametros;
    }

    public String getTipo() {
        return tipo;
    }

    private List<Variable> sortParametros(List<Variable> parametros){
        List<Variable> params = new ArrayList<>();
        Variable variable;
        String act_type;
        String name;
        int i;
        if (!parametros.isEmpty()){
            act_type = parametros.get(0).getTipo(); //obtener el primero con get(0)
            name = parametros.get(0).getNombre();
            for (i = 1; i < parametros.size(); i++){
                if (parametros.get(i).getTipo().equals(act_type)){
                    name += ", " + parametros.get(i).getNombre();
                } else {
                    variable = new Variable(name, act_type);
                    params.add(variable);
                    act_type = parametros.get(i).getTipo();
                    name = parametros.get(i).getNombre();
                }
            }
            variable = new Variable(name, act_type);
            params.add(variable);
        }
        return params;
    }
    @Override
    public String toString() {
        String listaParametros = "";
        if (this.getParametros() != null && !this.getParametros().isEmpty()) {
            listaParametros = "(";
            for (Variable var : this.getParametros()) {
                listaParametros += var.toString();
                int size = this.getParametros().size();
                if (this.getParametros().get(size-1) != var)
                    listaParametros += ", ";
            }
            listaParametros += ")";
        }

        if ("void".equals(this.getTipo())) {
            return "procedure " + this.getNombre() + listaParametros +";";
        }
        else {
            return "function " + this.getNombre() + listaParametros + ": " + this.getTipo() + ";";
        }
    }
}