/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia11ej3conclase;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class DivisionNumeros {
    private Integer num1;
    private Integer num2;

    public DivisionNumeros() {
    }

    
    public DivisionNumeros(Integer num1, Integer num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    
    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }
    
//    public void dividir(){
//        Scanner leer = new Scanner(System.in);
//        double result=0;
//        
//        System.out.println("ingrese el 1er numero");
//        String n1=leer.next();
//        System.out.println("ingrese el 3do numero");
//        String n2=leer.next();
//        
//        
//        setNum1(Integer.parseInt(n1));
//        setNum2(Integer.parseInt(n2));
//        result= getNum1()/getNum2();
//           System.out.println(result);
//        
//        try {
//            result= getNum1()/getNum2();
//            System.out.println(result);
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