
package EXTRA;

import java.util.Scanner;

/**
 Leer la altura de N personas y determinar el promedio de estaturas que se 
 encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.

 * @author andreajalil
 */
public class ejercicio06 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        
        String salir;
        int cont=0; 
        int cont2=0;
        double altura1=0;
        double altura2=0;
        do {
            System.out.println("INGRESE LA ALTURA");
            double altura=leer.nextDouble();
            if (altura>=1.6) {
                cont++;
                altura1 = altura1 + altura;
            }
            
            cont2++;
            altura2= altura2+ altura;
            System.out.println("DESEA CONTINUAR (s/n)");
            salir=leer.next();
        } while (salir.equals("s"));
        
        System.out.println(cont +"/"+cont2);
        System.out.println("""
                           el promedio de estaturas que
                           se encuentran por debajo de 1.60 = """ + (altura1/cont));
        System.out.println("");
        System.out.println("el promedio total de estaturas es = " + (altura2/cont2));
    }
    
}
