
package andrea.ejerdeaprendizaje;

import java.util.Scanner;

/**
 *Realice un programa que compruebe si una matriz dada es anti simétrica. 
 * Se dice que una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta,
 * pero cambiada de signo. Es decir, A es anti simétrica si A = -AT. 
 * La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 * @author andreajalil
 */
public class ejercicio19 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
       int matriz[][] = new int[3][3]; // Le ponemos la dimension a la matriz, 
       int matrizAt[][] = new int[3][3];
       boolean log[][]=new boolean [3][3];
       int cont=0;
               
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("INGRESE EL VALOR PARA [" +i + "] [ " + j + " ]");
                matriz[i][j] = leer.nextInt(); // Le asignamos a cada posicion de la matriz
                // en sus filas
            }
        }
         System.out.println(" ");

        System.out.println("LA MATRIZ A ES:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAt[i][j]= matriz[j][i];

            }
        }
         System.out.println(" ");
        System.out.println("LA MATRIZ B ES:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Usamos la i y j para pasar por todos los elementos y mostrarlos
                // Mostrando la matriz por sus filas
                System.out.print("[" + matrizAt[i][j] + "]");
            }
            System.out.println(" ");
        }
         System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matriz[i][j] + matrizAt[i][j]==0) {
                    log[i][j]=true;
                }
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (log[i][j] == true) {
                    cont++;
                }
            }
            
        }
        if (cont==9) {
             System.out.println(" LA MATRIZ ES ANTISIMETRICA");
            
        }else
             System.out.println(" LA MATRIZ NO ES ANTISIMETRICA");
        
    }
    
}
