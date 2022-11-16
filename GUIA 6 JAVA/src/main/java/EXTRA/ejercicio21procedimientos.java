package EXTRA;
import java.util.Random;
public class ejercicio21procedimientos {
public static void main(String[] args) {
       int [][] tablaEgg = new int [10][5];
       double[][]tablaProm= new double[10][5];
       double [] sumaProm=new double [10];
        inicializarTabla(tablaEgg);
        rellenarNotas(tablaEgg);
        escribirNotas(tablaEgg);
         System.out.println(" ");
         pasaraDouble(tablaEgg,tablaProm);
         promedios(tablaProm,tablaEgg);
         vectorProm(sumaProm,tablaProm);
         escribirProm(tablaProm, sumaProm);
         System.out.println(" ");
         aproDesap(sumaProm);
 
    }//cierra main
public static void inicializarTabla (int [][]cuadro){
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                cuadro[i][j]= 0;}}
}

public static void rellenarNotas(int [][]cuadro){
    Random random =new Random();
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
            cuadro[i][j]=(int)random.nextDouble(1, 10);}}
}
public static void escribirNotas(int[][]cuadro){
    System.out.println("NOTAS DE ALUMNOS");
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("| "+ cuadro[i][j]+" |");}
             System.out.println(" ");}
}
public static void pasaraDouble(int[][]cuadro, double[][]cuadroP){
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                cuadroP[i][j]=(double)cuadro[i][j];}}
}

public static void promedios(double[][]cuadroP, int[][]cuadro){
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (j==0) {
                    cuadroP[i][j]= (double)Math.round((cuadro[i][j]*0.1)*100d)/100;
                }else if (j==1) {
                    cuadroP[i][j]= (double)Math.round((cuadro[i][j]*0.15)*100d)/100;
                }else if (j==2) {
                    cuadroP[i][j]= (double)Math.round((cuadro[i][j]*0.25)*100d)/100;
                }else if (j==3) {
                    cuadroP[i][j]= (double)Math.round((cuadro[i][j]*0.5)*100d)/100;
                }}}
}
public static void vectorProm(double[]vectorP, double[][]cuadro){
    for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                vectorP[i]+=cuadro[i][j];}}
}
        
public static void escribirProm(double[][]cuadro, double[]vectorP){
    System.out.println("PROMEDIO ALUMNOS");
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==4) {
                    System.out.println(vectorP[i]);
                }else
                System.out.print("| "+ cuadro[i][j]+" |");}
             System.out.println(" ");}
          
}
 public static void aproDesap(double[]vectorP){
     int contApr=0;
          int contDesap=0;
          for (int i = 0; i < 10; i++) {
              if (vectorP[i]>7) {
                  contApr++;
              }else
                  contDesap++;}
          
          System.out.println("LA CANTIDAD DE ALUMNOS APROBADOS ES= "+contApr);
          System.out.println("LA CANTIDAD DE ALUMNOS DESPROBADOS ES= "+contDesap);
 }       

}//cierra class
