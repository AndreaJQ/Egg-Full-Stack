/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Meses;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServicioMeses {
          Meses m = new Meses();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String mes;
        boolean mesIngresado = false;
        
        public void crearMesSecreto(){
        m.setMesSecreto(m.getMeses()[6]);
        }

        public void adivinarMes(){
             do {
            System.out.println("Adivine el mes secreto.");
            mes = leer.next();
            if (mes.equalsIgnoreCase(m.getMesSecreto())) {
                mesIngresado = true;
                System.out.println("Has acertado!");
            } else {
                System.out.println("Intenta de nuevo");
            }
        } while (mesIngresado == false);
        }
      
        
 }

