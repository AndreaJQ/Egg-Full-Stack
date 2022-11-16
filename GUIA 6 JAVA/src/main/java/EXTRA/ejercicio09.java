
package EXTRA;

/*
Simular la división usando solamente restas. 
Dados dos números enteros mayores que uno, realizar un algoritmo que calcule el
cociente y el residuo usando sólo restas. 
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37
37 – 13 = 24
24 – 13 = 11
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
public class ejercicio09 {

    public static void main(String[] args) {

        int numMayor=100;
        int numMenor=13;
        int resto;
        int i=-1;
        
        do {
            
            resto= numMayor;
            numMayor -= numMenor;
            i++;
        } while (numMenor<resto);
        
        System.out.println("El residuo es " + resto + "\n");
         System.out.println("y el cociente es "+i);     
    }
    
}
