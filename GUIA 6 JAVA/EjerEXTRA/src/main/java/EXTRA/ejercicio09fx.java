
package EXTRA;

/**
 *
 * @author andreajalil
 */
public class ejercicio09fx {


    public static void main(String[] args) {
      int numMayor=50;
      int numMenor=13;
              
    division(numMayor,numMenor);
        
    }
    public static void division(int numMayor, int numMenor){
        int resto;
        int i=-1;
        do {
            resto=numMayor;
            numMayor-=numMenor;
            i++;
        } while (numMenor< resto);
        
        System.out.println("el resto es " + resto);
        System.out.println("el cociente es "+ i);
        
    }
}
