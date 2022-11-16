
package EXTRA;

/* Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el vector.
 * @author andreajalil
 */
public class ejercicio20 {

    public static void main(String[] args) {
      int tamano=9;
      int[]vec1=new int[tamano];
      
      relleno(vec1, tamano);
      muestra(vec1, tamano);
        System.out.println("-------");
      int []vec2=new int[tamano];
      relleno(vec2, tamano);
      muestra(vec2, tamano);
    }//cierra main
    
    public static void relleno(int[]vector, int tamano){
        for (int i = 0; i < tamano; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }//cierra relleno
    
    public static void muestra(int[]vector, int tamano){
        for (int i = 0; i < tamano; i++) {
            System.out.println(vector[i]);
        }
        
    }//cierra muestra
    
}//cierra class
