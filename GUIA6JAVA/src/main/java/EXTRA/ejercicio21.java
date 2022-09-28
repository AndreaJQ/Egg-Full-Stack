package EXTRA;

import java.util.Random;

/*Los profesores del curso de programación de Egg necesitan llevar un registro 
de las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de 
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 
4 notas, 2 por trabajos prácticos evaluativos y 2 por parciales. 
Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10% 
Segundo trabajo práctico evaluativo 15% 
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo.
Al final del programa los profesores necesitan obtener por pantalla 
la cantidad de aprobados y desaprobados,
teniendo en cuenta que solo aprueban los alumnos con promedio mayor o igual al 7 de sus notas del curso.
 * @author andreajalil
 */
public class ejercicio21 {

    public static void main(String[] args) {
        Random random =new Random();
       int [][] tablaEgg = new int [10][5];
       double[][]tablaProm= new double[10][5];
       double [] sumaProm=new double [10];
       
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                tablaEgg[i][j]= 0;}}
        
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
            tablaEgg[i][j]=(int)random.nextDouble(1, 10);}}
         
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                tablaProm[i][j]=(double)tablaEgg[i][j];}}
         
         System.out.println("NOTAS DE ALUMNOS");
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("| "+ tablaEgg[i][j]+" |");}
             System.out.println(" ");}
       
         System.out.println(" ");
         
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 4; j++) {
                if (j==0) {
                    tablaProm[i][j]= (double)Math.round((tablaEgg[i][j]*0.1)*100d)/100;
                }else if (j==1) {
                    tablaProm[i][j]= (double)Math.round((tablaEgg[i][j]*0.15)*100d)/100;
                }else if (j==2) {
                    tablaProm[i][j]= (double)Math.round((tablaEgg[i][j]*0.25)*100d)/100;
                }else if (j==3) {
                    tablaProm[i][j]= (double)Math.round((tablaEgg[i][j]*0.5)*100d)/100;
                }}}
        
         for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                sumaProm[i]+=tablaProm[i][j];}}
         System.out.println("PROMEDIO ALUMNOS");
          for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==4) {
                    System.out.println(sumaProm[i]);
                }else
                System.out.print("| "+ tablaProm[i][j]+" |");}
             System.out.println(" ");}
          
          int contApr=0;
          int contDesap=0;
          for (int i = 0; i < 10; i++) {
              if (sumaProm[i]>7) {
                  contApr++;
              }else
                  contDesap++;}
          
          System.out.println("LA CANTIDAD DE ALUMNOS APROBADOS ES= "+contApr);
          System.out.println("LA CANTIDAD DE ALUMNOS DESPROBADOS ES= "+contDesap);
    }//cierra main
}//cierra class
