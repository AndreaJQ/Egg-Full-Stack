
package andrea.ejerdeaprendizaje;

import java.util.Random;

/**
 *Realizar un programa que rellene un matriz de 4x4 de valores aleatorios y muestre
 la traspuesta de la matriz. 
 La matriz traspuesta de una matriz A se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).

 * @author andreajalil
 */
public class ejercicio18 {

    public static void main(String[] args) {
        Random aleat= new Random ();
       int matriz[][] = new int[4][4]; // Le ponemos la dimension a la matriz, 
        // un 3 para las filas o otro para las columnas

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = aleat.nextInt(9); // Le asignamos a cada posicion de la matriz
                // en sus filas
            }
        }

        System.out.println("LA MATRIZ A ES:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
        int aux;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                aux= matriz[i][j];
                matriz[i][j]= matriz[j][i];
                matriz[j][i]=aux;
            }
        }
        System.out.println("LA MATRIZ B ES:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
    
}
