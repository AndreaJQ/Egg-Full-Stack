/*
Realizar un sistema de consulta que le permite al usuario consultar
por diferentes criterios:
• todos los alojamientos. 
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante 
• todos las residencias que tienen descuento.*/
package Service;

import andrea.guia10extra3.Alojamiento;
import andrea.guia10extra3.Campings;
import andrea.guia10extra3.Hotel;
import andrea.guia10extra3.Residencia;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author andreajalil
 */
public class ServiceAlojamiento {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    
    public void menu (ArrayList<Alojamiento> alojamiento){
        int op = 0;
        do {
            System.out.println(" \n ______  ALOJAMIENTOS  ______");
            System.out.println("| 1. Todos los Alojamientos  |");
            System.out.println("| 2. Hoteles por precio      |");
            System.out.println("| 3. Campings c/restaurants  |");
            System.out.println("| 4. Residencias c/descuento |");
            System.out.println("| 5. Salir                   |");
            System.out.println(" ----------------------------");
            System.out.println("\nSelecciona una opcion");
            op = leer.nextInt();

            switch (op) {
                case 1:
                    mostrarTodo(alojamiento);
                    break;
                case 2:
                    hotelesPorPrecio(alojamiento);
                    break;
                case 3:
                    campingConResto(alojamiento);
                    break;
                case 4:
                    residenciaConDesc(alojamiento);
                    break;
                case 5:
                    System.out.println("Saliendo del sistema... \nGracias por usar nuestro servicio.");
                    break;
                default:
                    System.out.println("Ingreso una opcion no valida");
            }

        } while (op != 5);
        
    }
    
    public void mostrarTodo(ArrayList<Alojamiento> lista){
        lista.forEach(aux->{
            System.out.println(aux.toString());
        });
    }
    
    public void hotelesPorPrecio(ArrayList<Alojamiento> lista){
     ArrayList<Alojamiento>auxList = new ArrayList<>();
     lista.stream().filter(aux->(aux instanceof Hotel)).forEachOrdered(aux->{
         auxList.add(aux);
     });
     
     ArrayList<Hotel> hotels=new ArrayList(auxList);
        Collections.sort(hotels, porPrecio);//comparator
        
        hotels.forEach(aux->{
            System.out.println(aux.toString());
        }); 
    }
    
    public void campingConResto(ArrayList<Alojamiento> lista){
        for (Alojamiento aux : lista) {
            if (aux instanceof Campings) {
                if (((Campings) aux).isRest()) {
                    System.out.println(aux);
                }
            }
        }
    }
    public void residenciaConDesc(ArrayList<Alojamiento> lista){
        for (Alojamiento aux : lista) {
            if (aux instanceof Residencia) {
                if (((Residencia) aux).isDescuento()) {
                    System.out.println(aux);
                }
                
            }
        }
    }
    
    
    //comparator
    public static Comparator<Hotel> porPrecio = new Comparator<Hotel>(){
    @Override
        public int compare(Hotel h1, Hotel h2) {
            return h2.PrecioHabitacion().compareTo(h1.PrecioHabitacion());
        }
    };
}
