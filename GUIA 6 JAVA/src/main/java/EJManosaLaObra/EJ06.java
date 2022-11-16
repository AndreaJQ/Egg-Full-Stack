/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJManosaLaObra;

import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class EJ06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese dos numeros");
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        if (num1>25 && num2 > 25){
            System.out.println("Ambos son mayor a 25");
        }else{
            System.out.println("Ambos numeros son menores de 25");
            
            if(num1>25 && num2<25){
                System.out.println("el primer numero es mayor a 25");
            }else{
                if (num1<25 && num2>25){
                System.out.println("el segundo numero es mayor a 25");
                }
        }
        
    }
            
}  
}
        
    
    
    

