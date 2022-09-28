
package EjdeAprendizaje;

import java.util.Random;
import java.util.Scanner;


public class ejercicio16 {

    /**
     * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios 
     * y le pida al usuario un numero a buscar en el vector.
     * El programa mostrará donde se encuentra el numero y si se encuentra repetido
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        Random aleat= new Random ();
        System.out.println("Ingrese el tamaño del vector");
        int N = leer.nextInt();
        int vector[] = new int[N];
        int cont=0;
                
        
        for (int i = 0; i < N; i++) {
            vector[i]= aleat.nextInt(9);
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println(" ");
        System.out.println("Ingrese un numera a buscar en el vector");
        int num=leer.nextInt();
        
        for (int i = 0; i < N; i++) {
            if (vector [i]== num) {
                System.out.println("el número " + num + " se encuentra en la posición [ "+i + " ]");
                //System.out.print("[" + i + "]");
                
            //}else{
                //System.out.print(" " + i + " ");
            }
        }
        
    }
    
}
