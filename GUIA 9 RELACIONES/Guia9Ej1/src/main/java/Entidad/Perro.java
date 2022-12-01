
package Entidad;

import Enum.Raza;
import Enum.Size;

public class Perro {
    private String nombre;
    private Raza raza;
    private Integer edad;
    private Size tamaño;

    public Perro() {
    }

    public Perro(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Size getTamaño() {
        return tamaño;
    }

    public void setTamaño(Size tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tama\u00f1o=" + tamaño + '}';
    }

  
    
}
