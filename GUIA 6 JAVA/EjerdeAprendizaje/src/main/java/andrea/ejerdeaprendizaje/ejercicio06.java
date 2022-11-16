package andrea.ejerdeaprendizaje;


import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *Crear un programa que dado un numero determine si es par o impar.

 * @author andreajalil
 */
public class ejercicio06 {

    
    public static void main(String[] args) {
      Scanner leer=new Scanner (System.in);
      System.out.println("INGRESE UN NUMERO");
      int num=leer.nextInt();
      if(num%2==0){
          System.out.println("el numero es par");
      }else{
          System.out.println("el numero es impar");
      }
    }
    
}
