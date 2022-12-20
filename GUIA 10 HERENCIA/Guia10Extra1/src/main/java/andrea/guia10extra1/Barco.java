/*
 Un Barco se caracteriza por: su matrícula, su eslora en metros y año de fabricación. */
package andrea.guia10extra1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Barco{
    Scanner sc= new Scanner(System.in).useDelimiter("\n");
    protected int matricula;
    protected int eslora;
    protected int añoFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int eslora, int añoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    public double valorModulo(){
        return this.eslora*10;
    } 
    
    public void crearBarco(){
        Random r= new Random();
         System.out.println("Buscando información de matrícula...");
        this.matricula= (int) r.nextInt(100000, 999999);
         System.out.println("Buscando información de fecha de Creación...");
        this.añoFabricacion= (int) r.nextInt(1950, 2020);
        System.out.println("Indique la eslora en metros");
        this.eslora= sc.nextInt();
      
    }
    
 
    public void mostrarInfo(){
        System.out.println("");
        System.out.println("El alquiler del Barco \n"
                + "Matrícula: "+ getMatricula()+"\n"
                        + "año de fabricación: "+ getAñoFabricacion()+"\n"
                                + "de " + getEslora()+" metros de eslora \n"
                                        + "es de " + valorModulo() +" por día.");
    }

}
