/*
 Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos (8 filas por 6 columnas).*/
package Entidad;

public class Sala {
   
       private String[][] butacas = {
        {"8A ", "8B ", "8C ", "8D ", "8E ", "8F "},
        {"7A ", "7B ", "7C ", "7D ", "7E ", "7F "},
        {"6A ", "6B ", "6C ", "6D ", "6E ", "6F "},
        {"5A ", "5B ", "5C ", "5D ", "5E ", "5F "},
        {"4A ", "4B ", "4C ", "4D ", "4E ", "4F "},
        {"3A ", "3B ", "3C ", "3D ", "3E ", "3F "},
        {"2A ", "2B ", "2C ", "2D ", "2E ", "2F "},
        {"1A ", "1B ", "1C ", "1D ", "1E ", "1F "}
    };

    public Sala() {
    }

    public String[][] getButacas() {
        return butacas;
    }

    public void setButacas(String[][] butacas) {
        this.butacas = butacas;
    }

    @Override
    public String toString() {
        return "Sala{" + "butacas=" + butacas + '}';
    }
       
   
    
    
}
