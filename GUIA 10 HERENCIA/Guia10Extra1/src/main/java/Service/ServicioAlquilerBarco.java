/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import andrea.guia10extra1.Alquiler;
import andrea.guia10extra1.Barco;
import andrea.guia10extra1.BarcoaMotor;
import andrea.guia10extra1.Velero;
import andrea.guia10extra1.Yate;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServicioAlquilerBarco {
    Scanner sc=new Scanner(System.in).useDelimiter("\n");
    Alquiler rental= new Alquiler();
    
    
    
    public void menu(){
        int op;
        System.out.println("Bienvenido al sistema de Alquiler de Barcos");
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué tipo de barco desea alquilar \n"
                    + "1- Yate.\n"
                    + "2- Velero.\n"
                    + "3- Barco sin motor.\n"
                    + "4- Barco con motor.\n"
                    + "5- Salir");
            op=sc.nextInt();
            switch (op) {
                case 1:
                    Barco y = yate();
                    rental.alquilando();
                    total(y);
                    break;
                case 2:
                    Barco v= velero();
                    rental.alquilando();
                    total(v);
                    break;
                case 3:
                    Barco bsM = barcoSinMotor();
                    rental.alquilando();
                    total(bsM);
                    break;
                case 4:
                    Barco bCM= barcoConMotor();
                    rental.alquilando();
                    total(bCM);
                    break;
                case 5:System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                break;
                default:
                    System.out.println("error... no indicó una opción correcta!");
                    break;
                
            }
          
        } while (op!=5);
      
    }
    
    public void total(Barco b){
        System.out.println("TOTAL POR "
                + ""+ rental.calcularDias(rental.getFechaInicio(),rental.getFechaFin()) + " DÍAS = "
                        + ""+ b.valorModulo()*rental.calcularDias(rental.getFechaInicio(),rental.getFechaFin()));
        System.out.println(""); 
        
    }
    public Barco yate(){
        Yate y=new Yate();
        y.crearBarco();
        y.mostrarInfo();      
        return y;
    }
    
    public Barco velero(){
       Velero v = new Velero();
       v.crearBarco();
       v.mostrarInfo();
      return v;
        
    }
    
    public Barco barcoSinMotor(){
       Barco bsM = new Barco();
       bsM.crearBarco();
       bsM.mostrarInfo();
       return bsM;
      }
    
    public Barco barcoConMotor(){
        BarcoaMotor bCM = new BarcoaMotor();
        bCM.crearBarco();
        bCM.mostrarInfo();
        return bCM;
    }
}
