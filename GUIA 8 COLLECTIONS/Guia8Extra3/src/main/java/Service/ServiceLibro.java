package Service;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServiceLibro {
    private HashSet<Libro> listaLibro;
    private Scanner sc;

    public ServiceLibro(){
        this.listaLibro=new HashSet<>();
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
    
     public void menu(){
        System.out.println("Bienvenido al sistema de Biblioteca de Andrea");
        int op;
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué desea realizar:\n"
                    + "1- Ingresar libro.\n"
                    + "2- Cargar un Préstamo.\n"
                    + "3- Cargar una Devolución.\n"
                    + "4- Mostrar lista de libros.\n"
                    + "5- Salir");
            op=sc.nextInt();
            switch (op) {
                case 1 -> crearLibro();
                case 2 -> cargarPrestamo();
                case 3 -> cargarDevolucion();
                case 4 -> mostrarLibros();
                case 5 -> System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                default -> System.out.println("error... no indicó una opción correcta!");
            }
        } while (op!=5);
    }
     
     public Libro agregarLibro(){
         System.out.println("......INGRESO DE INFORMACIÓN......");
            System.out.println("LIBRO:");
            String title=sc.next().toUpperCase();
            System.out.println("AUTOR:");
            String author=sc.next().toUpperCase();
            System.out.println("EJEMPLARES:");
            int stock=sc.nextInt();
            System.out.println("PRESATADOS:");
            int lent=sc.nextInt();
         return new Libro(title, author, stock, lent);
     }
     
     public void crearLibro(){
         //pedido por usuario
         String rta;
        do {
            listaLibro.add(agregarLibro());//para agregar llamar a otro metodo
            System.out.println("¿Quiere agregar otro libro?(S/N)");
            rta=sc.next();
        } while (!rta.equalsIgnoreCase("n"));
     }
     
     public void mostrarLibros(){
     System.out.println("......INFORMACIÓN......");
        Iterator<Libro> it=listaLibro.iterator();//recorrer con iterator o escribir con foreach
        while (it.hasNext()) {
            Libro book = it.next();
            System.out.println("NOMBRE: " + book.getTitulo().toUpperCase()+"\n"
            + "AUTOR: "+book.getAutor().toUpperCase()+"\n"
            +"EJEMPLARES DISPONIBLES: "+ book.getEjemplares()+"\n"
                    + "PRESTADOS: " + book.getPrestados());
            System.out.println(".......................");
        }
         
     }
     
    /**
     * Método prestamo(): El usuario ingresa el titulo del libro que quiere prestar y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto Libro al método. El método se incrementa de a uno, 
como un carrito de compras, el atributo ejemplares prestados, del libro que ingresó el usuario. 
Esto sucederá cada vez que se realice un préstamo del libro. 
No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. 
Devuelve true si se ha podido realizar la operación y false en caso contrario.
     */
     public void cargarPrestamo(){
         boolean encontrado=false;
         System.out.println("------------------------------------");
         System.out.println("Ingrese el libro que quiere tomar prestado");
         String prestado=sc.next();
         Iterator<Libro> it = listaLibro.iterator();
         while (it.hasNext()) {
             Libro next = it.next();
             if (next.getTitulo().equalsIgnoreCase(prestado)) {
                 encontrado=true;
                 if ((next.getEjemplares().equals(0))) {
                 System.out.println("No hay más ejemplares disponibles");
                 encontrado=false;
                     break;
                 
         }
         if (encontrado) {
             System.out.println("El título se encuentra disponible.");
             System.out.println("¿Quiere tomarlo prestado?(S/N)");
             String op=sc.next();
             if (op.equalsIgnoreCase("s")) {
                 next.setPrestados(next.getPrestados()+1);
                 next.setEjemplares(next.getEjemplares()-1);
             }
             }
         }else{
             System.out.println("No se encontró el título");
         }
         
     }
         System.out.println("volviendo... ... ...");
     }
     
     /**
      * •Método devolucion(): El usuario ingresa el titulo del libro que quiere devolver y se lo busca en el conjunto.
Si está en el conjunto, se llama con ese objeto al método. El método decrementa de a uno, como un carrito de compras,
el atributo ejemplares prestados, del libro seleccionado por el usuario. Esto sucederá cada vez que se produzca 
la devolución de un libro.
No se podrán devolver libros donde que no tengan ejemplares prestados.
Devuelve true si se ha podido realizar la operación y false en caso contrario.
      */
     public void cargarDevolucion(){
              boolean encontrado=false;
         System.out.println("------------------------------------");
         System.out.println("Ingrese el libro que quiere devolver");
         String prestado=sc.next();
         Iterator<Libro> it = listaLibro.iterator();
         while (it.hasNext()) {
             Libro next = it.next();
             if (next.getTitulo().equalsIgnoreCase(prestado)) {
                 next.setPrestados(next.getPrestados()-1);
                 next.setEjemplares(next.getEjemplares()+1);
                 encontrado=true;
         }
         }
         if (encontrado) {
             System.out.println("Muchas gracias.");
             System.out.println("Devolución cargada");
    
         }else{
             System.out.println("No corresponde a un título de la biblioteca");
         }
         System.out.println("volviendo... ... ...");
     } 
}
