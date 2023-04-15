/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import libreria.entidades.Autor;
import libreria.entidades.Controladora;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicio.ServicioMenu;

/**
 *
 * @author andreajalil
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        ServicioMenu sm = new ServicioMenu();
        sm.menu();
        Controladora control = new Controladora();
    }
    
}
