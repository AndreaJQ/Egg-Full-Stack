
package EjdeAprendizaje;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;

/**
 *Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas. 
 * Crear un programa que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no.
 * El programa deberá comprobar que los números introducidos son correctos, 
 * es decir, están entre el 1 y el 9.
 * @author andreajalil
 */
public class ejercicio20 {


    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DE LA MATRIZ");
        int n=leer.nextInt();
        int matriz [][]=new int[n][n];
        int sumafilas[]=new int[n];
        int sumacolumnas[]=new int[n];
        int d1=0;
        int d2=0;
        boolean magica=false;
                
        
        for (int i = 0; i < n; i++) {//inicializar vectores
            sumacolumnas[i]=0;
            sumafilas[i]=0;

        }
        
        for (int i = 0; i < n; i++) { //rellenar matriz validando los numeros
            for (int j = 0; j < n; j++) {
                do {
                    System.out.println("Ingrese el valor de la posición [ "+i+" ] [ "+j+" ]");
                 matriz[i][j]=leer.nextInt();
                } while (matriz[i][j]>9);     
                 sumafilas[i] += matriz[i][j];
                sumacolumnas[i]+=  matriz[j][i];
                if (i==j) {
                    d1+=matriz[i][j];
                }
                if ((i+j)==n-1) {
                    d2+=matriz[i][j];
                }//comprobacion
                if (sumafilas[i]==sumacolumnas[i]&& d1==d2 &&sumafilas[i]==d1) {
                    magica=true;
                }
            }          
        }
        
        for (int i = 0; i < n; i++) { //escribir matriz
            for (int j = 0; j < n; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println("");
        }
        //escribir valores
            System.out.println("La diagonal 1 suma= "+d1);
            System.out.println("La diagonal 2 suma= "+d2);
        for (int i = 0; i < n; i++) {
            System.out.println("La fila: " + (i+1) + " suma= "+sumafilas[i]);
        }
        //for (int i = 0; i < n; i++) {
          //   System.out.println("La columna: " + (i+1) + " suma= "+sumacolumnas[i]);
        //}
        //2System.out.println(ArraystoString(sumacolumnas));
       
        if (magica) {//boolean para escribir si es o no mágica
            System.out.println("La matriz cuadrada es MÁGICA");
        }
        else
            System.out.println("La matriz NO ES MÁGICA");
    }

   
}
