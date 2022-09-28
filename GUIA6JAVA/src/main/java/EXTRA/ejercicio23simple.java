/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EXTRA;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ejercicio23simple {

public static void main(String[] args) {
    Scanner in=new Scanner(System.in);
    String [][]sopa=new String[20][20];  //rellenar con letras.charAt(random.nextInt(size));
    String letras="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random random=new Random();
    int size=letras.length();
   
    String palabra, letra;
    int pi;
    int pj;

        //inicializar la sopa
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                sopa[i][j]=" ";
                //System.out.print("| "+ sopa[i][j]+" |");
            }//imprime
            //System.out.println("");
            //System.out.println("");
            }
            
            for (int i = 0; i < 5; i++) {
            System.out.println("------------");
            System.out.println("Ingresa la palabra " + (i + 1));
            palabra = in.nextLine();
            if (palabra.length() <= 5 && palabra.length() >= 3) {
                pi = random.nextInt(0, 20);
                pj = random.nextInt(0, 15);
                for (int j = 0; j < palabra.length(); j++) {
                    letra = palabra.substring(j, j+1);
                    sopa[pi][pj] = letra;
                    pj++;
                }
            } else {
                System.out.println("La palabra debe ser mínimo de 3 o máximo de 5 caracteres");
                i -= 1;
            }
        }

        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (sopa[i][j].equals(" ")) {
                    sopa[i][j]=String.valueOf(letras.charAt(random.nextInt(size)));
                }
            }
    }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print("| "+ sopa[i][j]+" |");
            }
         System.out.println("");
         System.out.println("");
    }
    }
   
}

