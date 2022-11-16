/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EXTRA;

/**
 *
 * @author andreajalil
 */
public class ejercicio20voidInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int tamano=9;
      int[]vec1=new int[tamano];
      
       relleno( vec1,  tamano);
      muestra(vec1, tamano);
     

        System.out.println("-------");

      
    }//cierra main
    
    public static int relleno(int [] vector, int tamano){
      int[]vecReturn= new int[tamano];
        for (int i = 0; i < tamano; i++) {
            vecReturn[i]=(int)(Math.random()*10);
        }
        return vecReturn[tamano];
    }//cierra relleno
    
    public static void muestra(int[]vector, int tamano){
        for (int i = 0; i < tamano; i++) {
            System.out.println(vector[i]);
        }
        
    }//cierra muestra
    
}//cierra class