/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6 columnas).*/
package Entidad;

import java.util.HashMap;

public class Sala {
   
    private HashMap<Integer, String>asientos;

    public Sala(HashMap<Integer, String> asientos) {
        this.asientos = asientos;
    }
    
    
}
