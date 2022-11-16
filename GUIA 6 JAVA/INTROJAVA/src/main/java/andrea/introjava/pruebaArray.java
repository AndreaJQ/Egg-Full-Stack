/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package andrea.introjava;

/**
 *
 * @author andreajalil
 */
public class pruebaArray {

    public static void main(String[] args) {
        String palabra="hola";
        char array[]=new char[5];
                palabra.getChars(0, 3, array, 0);
                
                System.out.println(array[0]);
    }
    
}
