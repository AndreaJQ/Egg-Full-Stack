/*
 De Cine nos interesa conocer la película que se está reproduciendo, la sala con los espectadores y el precio de la entrada.  */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author andreajalil
 */
public class Cine {
    private Pelicula movie;
    private Sala s1;
    private Integer precioEntrada;
    private ArrayList<Espectador> espect;

    public Cine() {
    }

    public Cine(Pelicula movie, Sala s1, Integer precioEntrada, ArrayList<Espectador> espect) {
        this.movie = movie;
        this.s1 = s1;
        this.precioEntrada = precioEntrada;
        this.espect = espect;
    }

   

    public Pelicula getMovie() {
        return movie;
    }

    public void setMovie(Pelicula movie) {
        this.movie = movie;
    }

    public Sala getS1() {
        return s1;
    }

    public void setS1(Sala s1) {
        this.s1 = s1;
    }

    public Integer getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(Integer precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public ArrayList<Espectador> getEspect() {
        return espect;
    }

    public void setEspect(ArrayList<Espectador> espect) {
        this.espect = espect;
    }


   

    @Override
    public String toString() {
        return "Cine{" + "Película=" + movie + ", Sala=" + s1 + ", Precio de Entrada =" + precioEntrada + ", Espectadores=" + espect + '}';
    }
    
    
    
}
