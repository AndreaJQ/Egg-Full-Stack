package EXTRA;
/**
 *Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números
 * del 0-0- 0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E. Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
 * @author andreajalil
 */
public class ejercicio12 {

    public static void main(String[] args) {

           int[]contador=new int[999];
           String [] contadorcadena = new String[999];
           
           for (int i = 0; i < 999; i++) {
               contador[i]= i;
           }
           
           for (int j = 0; j < 999; j++) {//convierto el vector a cadena
            contadorcadena[j]= Integer.toString(contador[j]);
           }

           for (int j = 0; j < 999; j++) {//remplazo caracter en cadena con .REPLACE
               if (contadorcadena[j].length()==1) { //AGREGO 0(CERO) si tiene 1 digito o 2 digitos
                   System.out.println("00"+ contadorcadena[j].replace("3","E"));
                }else if (contadorcadena[j].length()==2) {
                   System.out.println("0"+ contadorcadena[j].replace("3","E"));
               }else
                    System.out.println(contadorcadena[j].replace("3","E"));
           }
           
           
           String saludo="HOLA MUNDO";
           System.out.println(saludo.replace("O", "Q"));
    }
    
}
