/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libreria.servicio;

import java.util.Scanner;
import libreria.entidades.Controladora;

/**
 *
 * @author andreajalil
 */
public class ServicioMenu {
    Controladora control = new Controladora();
    ServicioLibro sml = new ServicioLibro();
    ServicioAutor sma = new ServicioAutor();
    ServicioCliente smc = new ServicioCliente();
    ServicioPrestamo smp = new ServicioPrestamo();
    ServicioEditorial sme = new ServicioEditorial();
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public void menu(){
         System.out.println("Bienvenodo al sistema de Libreria ");
        int opcion = 20;
        do {
            do {
             System.out.println("Ingrese la operacion a realizar:\n1. Libro \n2. Autor\n3. Editorial"
                     + "\n4. Cliente\n5. Prestamo \n0. Salir"); 
            try {
                opcion = 20; // se reinicia con una opcion diferente a una valida
                opcion=Integer.parseInt(scan.next());
                break;
                }catch(Exception ex) {
                    System.out.println("Error, ingrese un numero ");
            }               
        } while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4 && opcion!=5 && opcion!=0 );
        
            switch(opcion)
            {
                case 1:    
                    sml.menuLibro();
                    break;
                case 2:  
                    sma.menuAutor();
                    break;
                case 3: 
                   sme.menuEditorial();
                    break;
                case 4:
                    smc.menuCliente();
                    break;
                case 5:
                    smp.menuPrestamo();
                    break;
                case 0:
                break;
            }
        } while (opcion != 0);   
    }
}
