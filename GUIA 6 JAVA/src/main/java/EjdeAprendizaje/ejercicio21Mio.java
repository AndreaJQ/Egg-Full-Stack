package EjdeAprendizaje;

import java.util.Random;

/* Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y 
la matriz P de 3x3, se solicita escribir un programa en el cual se compruebe 
si la matriz P está contenida dentro de la matriz M. Para ello se debe 
verificar si entre todas las submatrices de 3x3 que se pueden formar en la 
matriz M, desplazándose por filas o columnas, existe al menos una 
que coincida con la matriz P. En ese caso, el programa debe indicar la fila 
y la columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
 * @author andreajalil
 */
public class ejercicio21Mio {

    public static void main(String[] args) {
        Random random = new Random();
        int [][]matrizM=new int[10][10];
        int[][]matrizP =new int [3][3];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizM[i][j]= random.nextInt(2)+1;
                System.out.print("[ "+matrizM[i][j]+" ]" );
            }
            System.out.println("");
        }
         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizP[i][j]=random.nextInt(2)+1;
                System.out.print("[ "+matrizP[i][j]+" ]" );
            }
            System.out.println("");
        }
        
        boolean encontro = false;
        int fila = -1;
        int columna = -1;
        for (int i = 0; i < matrizM.length - 2; i++) {
            for (int j = 0; j < matrizM[0].length - 2; j++) {
                if (!encontro) {
                    if (matrizM[i][j] == matrizP[0][0]) {
                        int imatrizP, jmatrizP;
                        imatrizP = 0;
                        //encontre
                        encontro = true;
                        fila = i;
                        columna = j;
                        for (int k = i; k < i + matrizP.length; k++) {
                            jmatrizP = 0;
                            for (int l = j; l < j + matrizP.length; l++) {
                                //comparo con cada elemento de p, si alguno es distinto, no encontro la subm
                                if (matrizM[k][l] != matrizP[imatrizP][jmatrizP]) {
                                    encontro = false;
                                    fila = -1;
                                    columna = -1;
                                }
                                jmatrizP++;
                            }
                            imatrizP++;
                        }
                    }
                }
            }
        }
        if (encontro) {
            System.out.println("La matriz fue encontrada en la posicion: [" + fila + "," + columna + "]");
        } else {
            System.out.println("La matriz no fue encontrada.");
        }
    }//cierra main
    
}//cierra class
