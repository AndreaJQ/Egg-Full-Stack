
package EXTRA;

import java.util.Scanner;

/* Se dispone de un conjunto de N familias,cada una de las cuales tiene una M cantidad de hijos.
Escriba un programa que pida la cantidad de familias y para cada familia la 
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 * @author andreajalil
 */
public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        int edades=0;
        int sumaedades=0;
        int totaledades=0;
        int cantHijos=0;
        int promedio=0;
        int promTotal=0;
        System.out.println("Ingrese la cantidad de familias");
        int cantFam = leer.nextInt();
        
        for (int i = 0; i < cantFam; i++) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + (i+1));
            cantHijos = leer.nextInt();
            sumaedades=0;
            for (int j = 0; j < cantHijos; j++) {
                System.out.println("Ingrese las edad del "+ (j+1) +"º hijo");
                    edades= leer.nextInt(); 
                    sumaedades+= edades;
                    
            }  
     
                promedio=sumaedades/cantHijos;
                System.out.println("Edad promedio de familia " +(i+1)+ " es "+promedio); 
        }
         promTotal+=promedio;
           promTotal= promedio/cantFam;
        System.out.println("Edad promedio entre " + cantFam + " familias es " + promTotal);
    }
    
}
