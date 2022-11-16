/*
 1 - Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y después 
se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide salir, 
se mostrará todos los perros guardados en el ArrayList.
2 - Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará 
la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y 
se mostrará la lista ordenada.

 */

package andrea.guia8ej1;

import Entidad.Perros;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia8Ej1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in).useDelimiter("\n");
        Perros p=new Perros();
        ArrayList<Perros> razaP=new ArrayList();//creamos lista de tipo Perros
        String rta="";
        
        do {
            Perros p1=new Perros();
            System.out.println("Ingrese una raza de perro.");
            p1.setRazaPerros(sc.nextLine());
            razaP.add(p1);
           
            System.out.println("¿Quiere ingresar otra raza? -> Si \n"
                    + "(Si desea salir presione cualquier tecla.)");
            rta=sc.nextLine();
        } while (rta.equalsIgnoreCase("si"));
        
        
        System.out.println("Las razas ingresadas son:");
        for (Perros perros : razaP) {
            System.out.println(perros.getRazaPerros());
        }
        
        System.out.println("------------------------");
        System.out.println("Ingrese una raza a eliminar");
        p.setRazaEliminar(sc.nextLine());
        
        Iterator<Perros> it= razaP.iterator();//inicializar iterator
        boolean removed=true;
        while (it.hasNext()) {//iterator it(next) si está. usar el GET después equals.
            if (it.next().getRazaPerros().equalsIgnoreCase(p.getRazaEliminar())){
                it.remove();//eliminar elemento que coincida
                removed=false;
            }
        }
        if (removed) {
            System.out.println("No se encontró la raza para eliminar.");
        }
        razaP.sort(Perros.compareRaceAlphabetically);//Arraylist.sort(Entidad.comparatorCreado)
        System.out.println("---------------------");
        System.out.println("Las razas que quedan son:");//mostrar
        for (Perros perros : razaP) {
            System.out.println(perros.getRazaPerros().toUpperCase());
        }
    }

}
