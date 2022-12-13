/*
El sistema de votación de Egg tiene una clase llamada Alumno con los siguientes atributos:
nombre completo, DNI y cantidad de votos. Además, crearemos una clase Simulador 
que va a tener los métodos para manejar los alumnos y sus votaciones. */
package Entidades;

public class Alumnos {
    private String nombre;
    private String apellido;
    private String DNI;
    private int cantVotos;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, String DNI, int cantVotos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.DNI = DNI;
        this.cantVotos = cantVotos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public int getCantVotos() {
        return cantVotos;
    }

    public void setCantVotosI(int cantVotos) {
        this.cantVotos = cantVotos;
    }
    
//     public void sumarVotos() {
//        this.cantVotos++ ;
//    }

    @Override
    public String toString() {
        return "Alumnos" + "Nombre: " + nombre + "\n"
                + "Apellido:" + apellido + "\n"
                + "DNI:" + DNI + "\n"
                + "cantidad de Votos: " + cantVotos+"\n";
    }
    
    
}
