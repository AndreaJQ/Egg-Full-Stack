/*
 Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, 
y un constructor con todos los atributos pasados por parámetro y un constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y luego informar 
mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas.
 */

package andrea.guia7ej1;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Guia7Ej1 {

    public static void main(String[] args) {
        
      /*  ArrayList<Libro>books=new ArrayList();
        Libro l1=new Libro(6342456,"Lord of the Rings");
        Libro l2=new Libro(2452662,"Narnia");
        Libro l3=new Libro(3245255,"Alice in wonderland");
        books.add(l1);
        books.add(l2);
        books.add(l3);
        System.out.println("TOSTRING NO MUESTRA UN CODIGO IMPRIMIENDO CON FOREACH");
        for (Libro book : books) {
            System.out.println(book.getTitulo());//ELIJO IMPRIMIR SOLO EL TÍTULO USANDO GETTER
        }
        System.out.println(books);
        books.sort(compTitulo);
        for (Libro book : books) {
            System.out.println(book.getISBN()+" "+book.Titulo);//ELIJO IMPRIMIR SOLO EL TÍTULO USANDO GETTER
        }
    }
    public static Comparator<Libro> compTitulo=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.Titulo.compareTo(o2.Titulo);
        }
        
    };
    public static Comparator<Libro> compISBN=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.ISBN.compareTo(o2.ISBN);
        }
        
    };*/
    
/*TreeSet<Libro>books=new TreeSet(compISBN);//se pasa el coparator al inicializar el Set.
        Libro l1=new Libro(6342456,"Lord of the Rings");
        Libro l2=new Libro(2452662,"Narnia");
        Libro l3=new Libro(3245255,"Alice in wonderland");
        books.add(l1);
        books.add(l2);
        books.add(l3);
        System.out.println("TOSTRING NO MUESTRA UN CODIGO IMPRIMIENDO CON FOREACH");
        for (Libro book : books) {
            System.out.println(book.getTitulo());//ELIJO IMPRIMIR SOLO EL TÍTULO USANDO GETTER
        }
        System.out.println(books);
        
        for (Libro book : books) {
            System.out.println(book.getISBN()+" "+book.Titulo);//ELIJO IMPRIMIR SOLO EL TÍTULO USANDO GETTER
        }
    }
    public static Comparator<Libro> compTitulo=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.Titulo.compareTo(o2.Titulo);
        }
        
    };
    public static Comparator<Libro> compISBN=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.ISBN.compareTo(o2.ISBN);
        }
        
    };*/
    HashMap<Integer, Libro>books=new HashMap();
        Libro l1=new Libro("Lord of the Rings");
        Libro l2=new Libro("Narnia");
        Libro l3=new Libro("Alice in wonderland");
        books.put(6342456, l1);
        books.put(2452662,l2);
        books.put(3245255,l3);
        System.out.println("TOSTRING NO MUESTRA UN CODIGO IMPRIMIENDO CON FOREACH");
        for (Map.Entry<Integer, Libro> entry : books.entrySet()) {
            Object key = entry.getKey();
            Object val = entry.getValue();
            System.out.println(key + " " + val);
        }
            
        ArrayList<Libro> nombres=new ArrayList(books.values());
        nombres.sort(compTitulo);
        for (Libro nombre : nombres) {
            System.out.println(nombre.Titulo);
        }
      
    }
       
       
    public static Comparator<Libro> compTitulo=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.Titulo.compareTo(o2.Titulo);
        }
        
    };
    public static Comparator<Libro> compISBN=new Comparator<Libro>(){
        @Override
        public int compare(Libro o1, Libro o2) {
            return o1.ISBN.compareTo(o2.ISBN);
        }
        
    };
}
