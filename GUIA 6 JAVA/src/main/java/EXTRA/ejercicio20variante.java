
package EXTRA;
public class ejercicio20variante {

    public static void main(String[] args) {
       int tamano=9;
        int[]vec1=new int[tamano];
        var relleno = relleno(vec1,  tamano);
        muestra(vec1,  tamano);
    }//cierre de main
    
    public static int relleno(int[]vector, int tam){
        int[]vecReturn=new int[tam];
        for (int i = 0; i < tam; i++) {
            vecReturn[i]=(int)(Math.random()*9+1);
        }   
        return vecReturn[tam];
    } //cierre relleno
    public static void muestra (int[]vector, int tam){
        for (int i = 0; i < tam; i++) {
            System.out.println("| " + vector[i]+" |");
        }
    }
            
    
}//cierre de claa
