/*
Por último, del espectador, nos interesa saber su nombre, edad y el dinero que tiene disponible.*/
package Entidad;

/**
 *
 * @author andreajalil
 */
public class Espectador {
    private String nombre;
    private Integer edad;
    private Double dineroDisponible;

    public Espectador() {
    }

    public Espectador(String nombre, Integer edad, Double dineroDisponible) {
        this.nombre = nombre;
        this.edad = edad;
        this.dineroDisponible = dineroDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getDineroDisponible() {
        return dineroDisponible;
    }

    public void setDineroDisponible(Double dineroDisponible) {
        this.dineroDisponible = dineroDisponible;
    }

    @Override
    public String toString() {
        return "Nombre=" + nombre + "\n"
                + ", edad " + edad + "\n"
                +", dinero $" + dineroDisponible + "\n"
                + "";
    }

    
}
