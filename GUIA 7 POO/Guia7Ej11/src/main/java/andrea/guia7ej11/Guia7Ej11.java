/*
 * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la clase Date.
En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date, para esto vamos
a tener que crear 3 variables, dia, mes y anio que se le pedirán al usuario para poner el constructor del objeto Date.
Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, 
que se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia); Ejemplo fecha actual: Date fechaActual = new Date();
 */

package andrea.guia7ej11;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia7Ej11 {

    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in).useDelimiter("\n");
       
       int anio, mes, dia;
        System.out.println("Ingrese el año:");
        anio=leer.nextInt();
        System.out.println("Ingrese el mes:");
        mes=leer.nextInt();
        System.out.println("Ingrese el día:");
        dia=leer.nextInt();
       
        Date fecha=new Date(anio-1900, mes-1, dia);
        Date fechaActual= new Date();
        
        System.out.println(fecha);
        System.out.println(fechaActual);
        //int diferencia=(int) (fechaActual.getYear()-fecha.getYear());
        System.out.println("Años de diferencia= " +(fechaActual.getYear()-fecha.getYear()));
    }
}
