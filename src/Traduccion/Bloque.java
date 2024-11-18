package Traduccion;

import java.util.ArrayList;
import java.util.List;

public class Bloque {
    private List<Declaracion> declaraciones;
    private List<Instruccion> instrucciones;
    private int identacion;

    public Bloque(List<Declaracion> declaraciones, List<Instruccion> instrucciones, int identacion) {
        this.declaraciones = sortDeclaraciones(declaraciones);
        this.instrucciones = instrucciones;
        this.identacion = identacion;
    }

    public List<Declaracion> getDeclaraciones() {
        return declaraciones;
    }

    public List<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    public int getIdentacion() {
        return identacion;
    }

    private List<Declaracion> sortDeclaraciones(List<Declaracion> declaraciones) {
        List<Declaracion> dec = new ArrayList<>();
        Declaracion declaracion;
        String act_type;
        String name;
        int i;
        if (!declaraciones.isEmpty()) {
            act_type = declaraciones.get(0).getTipo(); //obtener el primero con get(0)
            name = declaraciones.get(0).getNombre();
            for (i = 1; i < declaraciones.size(); i++) {
                if (declaraciones.get(i).getTipo().equals(act_type)) {
                    name += ", " + declaraciones.get(i).getNombre();
                } else {
                    declaracion = new Declaracion(act_type, name);
                    dec.add(declaracion);
                    act_type = declaraciones.get(i).getTipo();
                    name = declaraciones.get(i).getNombre();
                }
            }
            declaracion = new Declaracion(act_type, name);
            dec.add(declaracion);
        }
        return dec;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String tabBloque = "";
        for (int i = 0; i < this.getIdentacion(); i++) {
            tabBloque += "\t";
        }
        String tabFuera = "";
        for (int i = 0; i < this.getIdentacion() - 1; i++) {
            tabFuera += "\t";
        }

        if (this.getDeclaraciones() != null && !this.getDeclaraciones().isEmpty()) {
            builder.append(tabFuera).append("var\n");
            for (Declaracion declaracion : this.getDeclaraciones()) {
                builder.append(tabBloque).append(declaracion.toString()).append("\n");
            }
        }
        if (this.getInstrucciones() != null && !this.getInstrucciones().isEmpty()) {
            builder.append(tabFuera).append("begin\n");
            for (Instruccion instruccion : this.getInstrucciones()) {
                builder.append(tabBloque).append(instruccion.toString()).append("\n");
            }
            builder.append(tabFuera).append("end");
        }
        return builder.toString();
    }
}