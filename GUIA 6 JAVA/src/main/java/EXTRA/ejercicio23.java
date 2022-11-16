package EXTRA;

import java.util.Random;
import java.util.Scanner;

/*Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, 
a medida que el usuario las va ingresando, construya una “sopa de letras para niños”
de tamaño de 20 x 20 caracteres. 
Las palabras se ubicarán todas en orden horizontal en una fila que será seleccionada de manera aleatoria.
Una vez concluida la ubicación de las palabras, rellene los espacios no utilizados 
con un número aleatorio del 0 al 9. Finalmente imprima por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan 
las siguientes funciones de Java substring(), Length() y Math.random().
- hacer una matriz de char 20x20
- ingresar 5 palabras tipo String
- ponerlas en vector char 1x5
        
 */
public class ejercicio23 {

    public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    char [][]sopa=new char[20][20];
    String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String palabra="";
    char []palabraArray=new char[20];
    Random random=new Random();
    int size=letras.length();

        //inicializar la sopa
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]=' ';
                //System.out.print("| "+ sopa[i][j]+" |");
            }//imprime
            //System.out.println("");
            //System.out.println("");
            }
            for (int i = 0; i < 20; i++) {
            palabraArray[i]= letras.charAt(random.nextInt(size));
        }
            for (int i = 0; i < 20; i++) {
                System.out.print("| " +palabraArray[i]+" |");
        }
            
            System.out.println("");
           for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese una palabra");
            palabra=in.next();
            palabra.getChars(0, 5, palabraArray, 0);
            }

        System.out.println("--");
        System.out.println("En qué fila desea imprimir la palabra");
                int valor=in.nextInt();
       for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (i==valor) {
                    System.out.print("| " +palabraArray[j]+" |");
                }else{
                  System.out.print("| "+ sopa[i][j]+" |");  
                }
            }
            System.out.println("");
            System.out.println("");
        }
    }
   
}
