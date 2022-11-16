package Entidad;


import java.util.ArrayList;


public class Alumnos {
    private String nombreAl;
    private ArrayList<Integer> notas;

    public Alumnos() {
        notas=new ArrayList();
    }

    public Alumnos(String nombreAl, ArrayList<Integer> notas) {
        this.nombreAl = nombreAl;
        this.notas = notas;
    }

    public String getNombreAl() {
        return nombreAl;
    }

    public void setNombreAl(String nombreAl) {
        this.nombreAl = nombreAl;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombreAl=" + nombreAl + ", notas=" + notas + '}';
    }

    
}