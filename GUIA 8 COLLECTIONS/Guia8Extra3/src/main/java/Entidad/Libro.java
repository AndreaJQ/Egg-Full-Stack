/*
Para ello, se debe crear una clase llamada Libro que guarde la información de cada uno de los libros de una Biblioteca.
La clase Libro debe guardar el título del libro, autor, número de ejemplares y número de ejemplares prestados.*/
package Entidad;

public class Libro {
 private String titulo;
 private String autor;
 private Integer ejemplares;
 private Integer prestados;

    public Libro() {
    }

    public Libro(String titulo, String autor, Integer ejemplares, Integer prestados) {
        this.titulo = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getEjemplares() {
        return ejemplares;
    }

    public void setEjemplares(Integer ejemplares) {
        this.ejemplares = ejemplares;
    }

    public Integer getPrestados() {
        return prestados;
    }

    public void setPrestados(Integer prestados) {
        this.prestados = prestados;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
 
 
}
