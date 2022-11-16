
package andrea.ejerdeaprendizaje;

import java.util.Scanner;

/**
 *Recorrer un vector de N enteros contabilizando cuántos números son de 1dígito,
 * cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 * @author andreajalil
 */
public class ejercicio17 {

  
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
        int N=leer.nextInt();
        int [] vector =new int [N];
        int d1=0;
        int d2=0;
        int d3=0;
        int d4=0;
        int d5=0;
  
        for (int i = 0; i < N; i++) {
            System.out.println("INGRESE EL NUMERO PARA LA POSICIÓN [ "+i+" ]");
            vector[i]= leer.nextInt();
        }
        
        //for (int i = 0; i < N; i++) {
          //  String digitos = Integer.toString(vector[i]);
            //System.out.println(digitos);
        //}
       
        System.out.println( " ");
        for (int i = 0; i < N; i++) {
            if (Integer.toString(vector[i]).length()==1) {
                System.out.println( vector[i] + " contine 1 dígito");
                d1++;
            }else if (Integer.toString(vector[i]).length()==2) {
                System.out.println( vector[i] + " contine 2 dígitos");
                d2++;
            }else if (Integer.toString(vector[i]).length()==3) {
                System.out.println( vector[i] + " contine 3 dígitos");
                d3++;
            }else if (Integer.toString(vector[i]).length()==4) {
                System.out.println( vector[i] + " contine 4 dígitos");
                d4++;
            }else if (Integer.toString(vector[i]).length()==5) {
                System.out.println( vector[i] + " contine 5 dígitos");
                d5++;
            }
            
            //System.out.println(" [ " + vector[i] + " ] ");
        }
        System.out.println( " ");
        System.out.println( d1 + " numeros continen 1 dígito");
        System.out.println( d2 + " numeros continen 2 dígitos");
        System.out.println( d3 + " numeros continen 3 dígitos");
        System.out.println( d4 + " numeros continen 4 dígitos");
        System.out.println( d5 + " numeros continen 5 dígitos");
    }
    
}
