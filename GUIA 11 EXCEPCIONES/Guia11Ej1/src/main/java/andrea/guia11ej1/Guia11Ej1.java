/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andrea.guia11ej1;

import Servicio.ServicioPersona;

/**
 *
 * @author andreajalil
 */
public class Guia11Ej1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        ServicioPersona persona1= new ServicioPersona();
        ServicioPersona persona2= new ServicioPersona();
        ServicioPersona persona3= new ServicioPersona();
        ServicioPersona persona4= new ServicioPersona();
        int IMC[]=new int[4];
        boolean edad[]= new boolean[4];
        int contimc0=0,contimc1=0,contimcneg=0, contedad=0;
   
        
        System.out.println("DATOS DE 1º PERSONA");
        persona1.crearPersona();
        IMC[0]=persona1.calcularIMC();
        edad[0]= persona1.esMayoDeEdad();
        if (persona1.calcularIMC()==-1) {
             System.out.println("Está por debajo de su peso ideal");
        }else if (persona1.calcularIMC()==0) {
            System.out.println("Está en su peso ideal");
        }else {
              System.out.println("Está por encima de su peso ideal");}
        
        if (persona1.esMayoDeEdad()==true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");}
        
        System.out.println("--------------------");
        System.out.println("DATOS DE 2º PERSONA");
        persona2.crearPersona();
        IMC[1]=persona2.calcularIMC();
        edad[1]= persona2.esMayoDeEdad();
        if (persona2.calcularIMC()==-1) {
             System.out.println("Está por debajo de su peso ideal");
        }else if (persona2.calcularIMC()==0) {
            System.out.println("Está en su peso ideal");
        }else {
              System.out.println("Está por encima de su peso ideal");}
        
        if (persona2.esMayoDeEdad()==true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");}
   
        System.out.println("--------------------");
        System.out.println("DATOS DE 3º PERSONA");
        persona3.crearPersona();
        IMC[2]=persona3.calcularIMC();
        edad[2]= persona3.esMayoDeEdad();
        if (persona3.calcularIMC()==-1) {
             System.out.println("Está por debajo de su peso ideal");
        }else if (persona3.calcularIMC()==0) {
            System.out.println("Está en su peso ideal");
        }else {
              System.out.println("Está por encima de su peso ideal");}
        
        if (persona3.esMayoDeEdad()==true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");}        
        
        System.out.println("--------------------");
        System.out.println("DATOS DE 4º PERSONA");
        persona4.crearPersona();
        IMC[3]=persona4.calcularIMC();
        edad[3]= persona4.esMayoDeEdad();
        if (persona4.calcularIMC()==-1) {
             System.out.println("Está por debajo de su peso ideal");
        }else if (persona4.calcularIMC()==0) {
            System.out.println("Está en su peso ideal");
        }else {
              System.out.println("Está por encima de su peso ideal");}
        
        if (persona4.esMayoDeEdad()==true) {
            System.out.println("Esta persona es mayor de edad");
        }else{
            System.out.println("Esta persona es menor de edad");}   
        
        
        for (int i = 0; i < 4; i++) {
            switch (IMC[i]) {
                case -1:
                    contimcneg++;
                    break;
                case 0:
                    contimc0++;
                    break;
                case 1:
                    contimc1++;
                    break;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            if (edad[i]==true) {
                contedad++;
            }
        }
        System.out.println("--------------------");
        System.out.println("El " + ((contedad*100)/4) + "% son mayores de edad");
        System.out.println("El " + ((contimcneg*100)/4) + "% Estan por debajo de el peso ideal");
        System.out.println("El " + ((contimc0*100)/4) + "% Estan en su peso ideal");
        System.out.println("El " + ((contimc1*100)/4) + "% Estan por encima de el peso ideal");  
        System.out.println("--------------------");
    }
    
}
