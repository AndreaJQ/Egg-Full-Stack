package EXTRA;

public class ejercicio12variante {

    public static void main(String[] args) {
        
       //int vector[] = new int[1000];
       String vectorA[] = new String[1000];

        for(int i = 0; i < 1000; i++){
            vectorA[i] = Integer.toString(i).replace("3", "E");}

        for(int i = 0; i < 1000; i++){
             if (vectorA[i].length()==1) {
                 System.out.println("00"+vectorA[i]);
            }else if (vectorA[i].length()==2) {
                System.out.println("0"+vectorA[i]);
            }else
                System.out.println(vectorA[i]);
        }
    }
}