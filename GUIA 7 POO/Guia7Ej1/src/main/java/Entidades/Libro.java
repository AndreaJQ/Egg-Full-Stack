/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas.
 */
package Entidades;

public class Libro {
    
    //atributos
    public Integer ISBN;
    public String Titulo;
    public String Autor;
    public int nroPags;
    
    //constructor vacio

    public Libro() {
    }
    //constructor con todos los atributos

    public Libro(Integer ISBN, String Titulo, String Autor, int nroPags) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.nroPags = nroPags;
    }

    public Libro(String Titulo) {
        this.Titulo = Titulo;
    }

    public Libro(Integer ISBN, String Titulo) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
    }
    

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(Integer ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getNroPags() {
        return nroPags;
    }

    public void setNroPags(int nroPags) {
        this.nroPags = nroPags;
    }

//    @Override
//    public String toString() {
//        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + '}';
//    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo=" + Titulo + '}';
    }

    
    
    
    
    
    
    
}
