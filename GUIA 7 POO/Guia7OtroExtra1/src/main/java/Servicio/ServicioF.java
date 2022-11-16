/*
 Ejercicio1
Crear una clase llamada fracción que contenga 4 atributos (denominador y numerador de cada fracción).
Crear la clase servicio que contenga métodos para sumar, restar, multiplicar y dividir fracciones.
Mostrar por pantalla un menú de opciones para que el usuario decida que ver.

 */
package Servicio;

import Entidad.Fraccion;
import java.util.Scanner;

public class ServicioF {
    
    Fraccion F = new Fraccion();
    Scanner leer =new Scanner(System.in).useDelimiter("\n");
    
    
    public void ingresoNros(){
        System.out.println("INGRESE LA PRIMERA FRACCIÓN");
        System.out.print("NUMERADOR-> ");
        F.setF1Num(leer.nextInt());
        System.out.print("DENOMINADOR-> ");
        F.setF1Denom(leer.nextInt());
        System.out.println("INGRESE LA SEGUNDA FRACCIÓN");
         System.out.print("NUMERADOR-> ");
        F.setF2Num(leer.nextInt());
        System.out.print("DENOMINADOR-> ");
        F.setF2Denom(leer.nextInt());
        System.out.println("--------------------");
        System.out.println("Fracción 1-> "+ F.getF1Num()+"/"+ F.getF1Denom());
        System.out.println("Fracción 2-> "+F.getF2Num()+"/"+ F.getF2Denom());
        
    }
    
    public void opciones(){
        int op;
        do {
            System.out.println("-------------------------");
            System.out.println("Elija la opción que desea realizar \n"
                + "1 - Suma \n"
                + "2 - Resta \n"
                + "3 - Multiplicación \n"
                + "4 - División \n"
                + "0 - Salir \n"
                    + "-------------------------");
            
        op=leer.nextInt();
        switch (op) {
            case 1:
                sumar();
                break;
                case 2:
                restar();
                break;
                case 3:
                multiplicar();
                break;
                case 4:
                dividir();
                break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
            default:
                System.out.println("Error... no es una opción");
                break;
        }
        } while (op!=0);
        
        
    }
    
    public void sumar(){
        int sumaNum;
        int sumaDenom;
        if (F.getF1Denom()!=F.getF2Denom()) {
            sumaNum=(F.getF1Denom()*F.getF2Num())+(F.getF1Num()*F.getF2Denom());
            sumaDenom=F.getF1Denom()*F.getF2Denom();
        }else{
            sumaNum=F.getF1Num()+F.getF2Num();
            sumaDenom=F.getF1Denom();
        }
  
        System.out.println("La suma es:"
                + sumaNum+"/"+sumaDenom);
    }
    
    public void restar(){
        int restaNum;
        int restaDenom;
        
        if (F.getF1Denom()!=F.getF2Denom()) {
            restaNum=((F.getF1Num()*F.getF2Denom()-F.getF1Denom()*F.getF2Num()));
            restaDenom=F.getF1Denom()*F.getF2Denom();
        }else{
            restaNum=F.getF2Num()-F.getF1Num();
            restaDenom=F.getF1Denom();
        }
            System.out.println("La resta es:"
                + restaNum+"/"+restaDenom);
        
       
}
        
  
    
    public void multiplicar(){
        int multNum=F.getF1Num()*F.getF2Num();
        int multDenom=F.getF1Denom()*F.getF2Denom();
        int cont=0;
        if (multNum>multDenom) {
            for (int i = 2; i < multDenom; i++) {
                if (multNum%i==0 && multDenom%i==0) {
                    cont++;
                }
            }
        }
        System.out.println("La multiplicación es: "
        +multNum+"/"+multDenom);
    }

    
    public void dividir(){
        int divNum;
        int divDenom;
        
        divNum=F.getF1Num()*F.getF2Denom();
        divDenom=F.getF1Denom()*F.getF2Num();
        
        System.out.println("La division es: "
        + divNum+"/"+divDenom);
        
    }
    
}

