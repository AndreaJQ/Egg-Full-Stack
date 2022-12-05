/*
Luego, de las películas nos interesa saber el título, duración, edad mínima y director. */
package Entidad;

/**
 *
 * @author andreajalil
 */
public class Pelicula {
    private String titulo;
    private Integer duracionMin;
    private Integer edadMinima;
    private String director;

    public Pelicula() {
    }

    public Pelicula(String titulo, Integer duracionMin, Integer edadMinima, String director) {
        this.titulo = titulo;
        this.duracionMin = duracionMin;
        this.edadMinima = edadMinima;
        this.director = director;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(Integer duracionMin) {
        this.duracionMin = duracionMin;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracionMin=" + duracionMin + ", edadMinima=" + edadMinima + ", director=" + director + '}';
    }

}
