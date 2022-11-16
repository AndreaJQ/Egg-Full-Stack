
package Servicio;

import Entidad.Fecha;
import java.util.Date;
import java.util.Scanner;


public class ServFecha {
    
   Fecha D= new Fecha();
   Date FechaActual=new Date();
   public void crearFecha(){
       Scanner leer= new Scanner(System.in).useDelimiter("\n");
       
       
        System.out.println("Ingrese el año:");
        D.setAnio(leer.nextInt());
        System.out.println("Ingrese el mes:");
        D.setMes(leer.nextInt());
        System.out.println("Ingrese el día:");
        D.setDia(leer.nextInt());
       Date fecha1=new Date(D.getAnio(), D.getMes(), D.getDia());
       D.setFecha(fecha1);
       
   }
   public void mostrarFecha(){
       System.out.println("Fecha ingresada.");
       System.out.println(D.getFecha());
       System.out.println("Fecha actual.");
       System.out.println( FechaActual);
   }
   
   public void diferencia(){
       
       int diferencia=(int) (FechaActual.getYear()-D.getFecha().getYear());
       System.out.println("Años de diferencia= " +diferencia);
   }


   
   
}
