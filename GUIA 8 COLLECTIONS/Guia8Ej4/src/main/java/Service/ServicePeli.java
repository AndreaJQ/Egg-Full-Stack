/*
 En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos
y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
   ver los videos relacionados con este tema, antes de empezar los
 ejercicios, los podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
Pueden encontrar un ejemplo de Colección como Atributo en tu Aula Virtual.
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ServicePeli {
    private ArrayList<Pelicula> peliLista;
    private Scanner leer;
    
    
    public ServicePeli(){
        this.peliLista = new ArrayList<>(); // Creo el espacio en memoria del LISTA
        this.leer = new Scanner(System.in).useDelimiter("\n");// Cuando se invoca la clase, habilita el flujo de datos
        
    }
    
    public void crearPelicula(){
        String rta="";
        do {
            //ingresar datos
            System.out.println("-----INGRESO DE DATOS DE PELICULA------");
            System.out.println("Ingrese nombre del título");
            String peli=leer.next();
            System.out.println("Ingrese el director.");
            String dire=leer.next();
            System.out.println("Ingrese la duración en minutos.");
            Integer durac=leer.nextInt();
            peliLista.add(new Pelicula(peli, dire, durac));
            
            System.out.println("¿Quiere agregar otra pelicula?");//preguntar si sigue el bucle
            rta=leer.next();
        } while (rta.equalsIgnoreCase("si"));
    }
    
    public void mostrarTodas(){
        System.out.println("---------::::Peliculas Ingresadas::::----------");
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
                  System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                  System.out.println("----------------");
    }
    }
    
    public void mostrasMayor1hr(){
        System.out.println("---------::::Peliculas de más de 1 hora::::----------");
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
             if (next.getHoras()>60) {
                 System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                 System.out.println("----------------");
             }
        }
     }

    public static Comparator<Pelicula> ordenaDuracMayor=(Pelicula o1, Pelicula o2) -> o2.getHoras().compareTo(o1.getHoras());
    public static Comparator<Pelicula> ordenaMenorDurac=(Pelicula o1, Pelicula o2) -> o1.getHoras().compareTo(o2.getHoras());
    public static Comparator<Pelicula> ordenarTitulo=(Pelicula o1, Pelicula o2) -> o1.getTitulo().compareTo(o2.getTitulo());
    public static Comparator<Pelicula> ordenaDirector=(Pelicula o1, Pelicula o2) -> o1.getDirector().compareTo(o2.getDirector());
     
       public void mostrarOrdenDuracMay(){
         System.out.println("---------::::Peliculas de Mayor a Menor Duración::::----------");
        Collections.sort(peliLista,ordenaDuracMayor);
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
                  System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                  System.out.println("----------------");
    }
    }
           public void mostrarOrdenDuracMeno(){
         System.out.println("---------::::Peliculas de Menor a Mayor Duración::::----------");
        Collections.sort(peliLista,ordenaMenorDurac);
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
                  System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                  System.out.println("----------------");
    }
    }
       
    public void mostrarOrdenTitulo(){
         System.out.println("---------::::Peliculas por Título::::----------");
        Collections.sort(peliLista, ordenarTitulo);
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
                  System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                  System.out.println("----------------");
    }
    }
    public void mostrarOrdenDirector(){
         System.out.println("---------::::Peliculas por Director::::----------");
        Collections.sort(peliLista,ordenaDirector);
        Iterator<Pelicula> it= peliLista.iterator();
        while (it.hasNext()) {
            Pelicula next = it.next();
                  System.out.println("Titulo: "+next.getTitulo()+ "\n"
                         +  "Director: "+ next.getDirector()+" \n"
                                 + "Duración: "+next.getHoras());
                  System.out.println("----------------");
    }
    }
}
