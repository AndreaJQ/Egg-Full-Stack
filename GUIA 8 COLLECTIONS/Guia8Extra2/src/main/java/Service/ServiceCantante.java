/**
Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas.
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 
* objetos de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de 
* cada cantante y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario
de agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que
el usuario elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios.
 * */
package Service;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServiceCantante {
    private ArrayList<CantanteFamoso> listSinger;
    private Scanner sc;
    
    public ServiceCantante(){
        this.listSinger=new ArrayList<>();
        this.sc=new Scanner(System.in).useDelimiter("\n");
        //Agregar los 5 a la lista

    }
    
    public void generarCantante(){
        listSinger.add(new CantanteFamoso("Robbie Williams", "Angels"));
        listSinger.add(new CantanteFamoso("Pink Floyd", "The Wall"));
        listSinger.add(new CantanteFamoso("Coldplay", "X&Y"));
        listSinger.add(new CantanteFamoso("Michael Jackson", "Thriller"));
        listSinger.add(new CantanteFamoso("Pink Floyd", "The Dark Side of the Moon"));
        
    }
    
    public void menu(){
        int op;
        generarCantante();

        do {//menu de opciones
            System.out.println(":::::CANTANTES FAMOSOS:::::");
            System.out.println(":.........................:");
            System.out.println(":1. Ingresar Cantante     :");
            System.out.println(":2. Mostrar Información   :");
            System.out.println(":3. Eliminar Cantante     :");
            System.out.println(":4. Salir                 :");
            System.out.println(":.........................:");
            op=sc.nextInt();
            switch (op) {
                case 1 -> crearLista();
                case 2 -> mostrarInfo();
                case 3 -> eliminarCantante();
                case 4 -> System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                default -> System.out.println("error... no indicó una opción correcta!");
            }
        } while (op!=4);
    }
    
    public void mostrarInfo(){
        System.out.println("......INFORMACIÓN......");
        Iterator<CantanteFamoso> it=listSinger.iterator();//recorrer con iterator o escribir con foreach
        while (it.hasNext()) {
            CantanteFamoso cf = it.next();
            System.out.println("NOMBRE: " + cf.getNombre().toUpperCase()+"\n"
            + "DISCO: "+cf.getDiscoMasVentas().toUpperCase());
            System.out.println(".......................");
        }
    }
    
    public CantanteFamoso agregarCantante(){
           
            System.out.println("......INGRESO DE INFORMACIÓN......");
            System.out.println("CANTANTE:");
            String singer=sc.next().toUpperCase();
            System.out.println("DISCO MAS VENDIDO:");
            String disco=sc.next().toUpperCase();
          
        return new CantanteFamoso(singer, disco);
    }
    
    
    public void crearLista(){
        String rta;
        do {
            listSinger.add(agregarCantante());//para agregar llamar a otro metodo
            System.out.println("¿Quiere agregar otro cantante?(S/N)");
            rta=sc.next();
        } while (!rta.equalsIgnoreCase("n"));
    }
    
    public void eliminarCantante(){
        boolean flag;
        System.out.println("......ELIMINAR INFORMACIÓN......");
        System.out.println("Ingrese el cantante a borrar.");
        String eliminar=sc.next().toUpperCase();
        for (int i = 0; i < listSinger.size(); i++) {
            if (listSinger.get(i).getNombre().equalsIgnoreCase(eliminar)) {
                listSinger.remove(i);
            }
        }

//        }//validar si se encontró o no
        if (flag=false) {
            System.out.println("No se encontró el cantante/disco buscado: "+ eliminar);
        }else{
            System.out.println("Se borró de la lista a '"+eliminar+"'"); 
        }
    }
}
