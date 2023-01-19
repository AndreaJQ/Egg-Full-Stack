/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).*/

package andrea.guia11ej2;

public class Guia11Ej2 {

    public static void main(String[] args) {
        
        int[] array=new int[3];
        
        try {
            for (int i = 0; i < 5; i++) {
           array[i] = (int) Math.random()*50+1;
        }
        } catch (Exception e) {
            System.out.println("Error");
            System.out.println(e.getMessage());
        } 
        finally{
            System.out.println("saliendo");
        }
        
    }
}
