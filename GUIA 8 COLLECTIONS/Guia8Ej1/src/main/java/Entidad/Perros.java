
package Entidad;

import java.util.Comparator;

public class Perros {
    private String razaPerros;
    private String razaEliminar;

    public Perros() {
    }

    public Perros(String razaPerros, String razaEliminar) {
        this.razaPerros = razaPerros;
        this.razaEliminar = razaEliminar;
    }

    public String getRazaEliminar() {
        return razaEliminar;
    }

    public void setRazaEliminar(String razaEliminar) {
        this.razaEliminar = razaEliminar;
    }

    
    public String getRazaPerros() {
        return razaPerros;
    }

    public void setRazaPerros(String razaPerros) {
        this.razaPerros = razaPerros;
    }
    
public static Comparator<Perros> compareRaceAlphabetically=(Perros p1, Perros p2) -> p1.getRazaPerros().compareTo(p2.getRazaPerros());

    @Override
    public String toString() {
        return "Perros{" + "razaPerros=" + razaPerros + '}';
    }

    
}
    