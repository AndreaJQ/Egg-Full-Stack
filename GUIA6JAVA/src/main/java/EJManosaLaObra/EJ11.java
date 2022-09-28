/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package EJManosaLaObra;


import java.util.Scanner;//cmd shif i

/**
 *Escribir un programa que procese una secuencia de caracteres ingresada por teclado 
 * y terminada en punto, y luego codifique la palabra o frase ingresada de la siguiente manera:
 * cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres 
 * (incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou 
@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne 
* la codificación correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 * @author andreajalil
 */
public class EJ11 {


    public static void main(String[] args) {
     
        Scanner leer=new Scanner (System.in);
       
        String frase;
        int largoFrase;
  

        do {
        System.out.println("INGRESE UNA FRASE TERMINADA EN PUNTO");
        frase=leer.nextLine();
        largoFrase= frase.length();
        System.out.println(largoFrase);
        System.out.println(frase.substring(largoFrase-1, largoFrase));
        } while (!".".equals(frase.substring(largoFrase-1, largoFrase)));
 
        System.out.println(codificacion(frase));
   
    }
    public static String codificacion (String frase){
       String letra= "";
       String caracter="";
        for (int i = 0; i < frase.length(); i++) {
            caracter=frase.substring(i,i+1);
            switch (caracter.toLowerCase()) {
            case "a":
                caracter="@";
                break;
            case "e":
                caracter="#";
                 break;
            case "i":
                caracter="$";
                 break;
            case "o":
                caracter="%";
             break;
            case "u":
                caracter="*";
             break;
            }
            letra=letra+caracter;
            
        }
    
      
        return letra;
}

 

    
    
}
