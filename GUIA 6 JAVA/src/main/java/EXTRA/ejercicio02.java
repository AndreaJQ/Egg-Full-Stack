
package EXTRA;

/**
 Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada una.
 * A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C 
 * tome el valor de A, A tome el valor de D y D tome el valor de B.
 * Mostrar los valores iniciales y los valores finales de cada variable. 
 * Utilizar sólo una variable auxiliar.
 *  B8 C3
 * C3   A5
 * A5    D1
 * D1    B8
 * @author andreajalil
 */
public class ejercicio02 {

    public static void main(String[] args) {
        int A, B, C, D, aux;
        A=5;
        B=8;
        C=3;
        D=1;
        aux=0;
        System.out.println("A=" + A);
        System.out.println("B=" + B);
        System.out.println("C=" + C);
        System.out.println("D=" + D);
        aux=B;
        B=C;
        C=A;
        A=D;
        D=aux;
       
        System.out.println( A);
        System.out.println( B);
        System.out.println( C);
        System.out.println( D);
                
    }
    
}
