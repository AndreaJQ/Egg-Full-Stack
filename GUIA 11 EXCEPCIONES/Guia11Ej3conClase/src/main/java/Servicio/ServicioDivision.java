/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import andrea.guia11ej3conclase.DivisionNumeros;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServicioDivision {
    DivisionNumeros division = new DivisionNumeros();
       
         public void dividir(){
        Scanner leer = new Scanner(System.in);
        double result=0;
        
        System.out.println("ingrese el 1er numero");
        String n1=leer.next();
        System.out.println("ingrese el 2do numero");
        String n2=leer.next();
        
        
        division.setNum1(Integer.parseInt(n1));
        division.setNum2(Integer.parseInt(n2));
       
        result= division.getNum1()/division.getNum2();
           System.out.println(result);
//        try {
//             result= division.getNum1()/division.getNum2();
//           System.out.println(result);
//          
//        } catch (NumberFormatException e) {
//            System.out.println("Excepcion de parseInt");
//            System.out.println(e.toString());
//           
//        } catch (ArithmeticException e) {
//            System.out.println("Excepcion division por CERO");
//            System.out.println(e.toString());
//             
//        } catch (InputMismatchException e) {
//            System.out.println("Excepcion de Ingreso");
//            System.out.println(e.toString());
//         
//        } finally {
//
//            System.out.println("TERMINO");
//            
//        }
    
    
    }
    
}
