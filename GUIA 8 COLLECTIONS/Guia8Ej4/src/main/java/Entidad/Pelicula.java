/*
Un cine necesita implementar un sistema en el que se puedan cargar peliculas. 
Para esto, tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo que se pide a continuación:
 */
package Entidad;

import java.util.Comparator;

public class Pelicula {
    private String titulo;
    private String director;
    private Integer horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Integer horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getHoras() {
        return horas;
    }

    public void setHoras(Integer horas) {
        this.horas = horas;
    }

   
    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horas=" + horas + '}';
    }
    
    
}
