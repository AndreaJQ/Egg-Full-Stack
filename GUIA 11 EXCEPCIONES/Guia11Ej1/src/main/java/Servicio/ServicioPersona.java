package Servicio;

import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
    Scanner leer=new Scanner (System.in);
    Persona p = new Persona();
    int pesoimc;
    boolean mayor=false;
    
    public Persona crearPersona(){
        
        System.out.println("Ingrese el nombre");
        p.setNombre(leer.next());
        
        System.out.println("Ingrese la edad");
        p.setEdad(leer.nextInt());
        
        do {
            System.out.println("Ingrese el sexo. H, M, O");
        p.setSexo(leer.next());
        if (!p.getSexo().equalsIgnoreCase("H")&& !p.getSexo().equalsIgnoreCase("M") && !p.getSexo().equalsIgnoreCase("O")) {
            System.out.println("Error, Ingrese nuevamente el sexo. H, M, O");
        }
        } while (!p.getSexo().equalsIgnoreCase("H")&& !p.getSexo().equalsIgnoreCase("M") && !p.getSexo().equalsIgnoreCase("O"));
       
        if (!p.getSexo().equalsIgnoreCase("H")&& !p.getSexo().equalsIgnoreCase("M") && !p.getSexo().equalsIgnoreCase("O")) {
            System.out.println("Error, Ingrese nuevamente el sexo. H, M, O");
        }
        
        System.out.println("Ingrese el peso.");
        p.setPeso(leer.nextInt());
        
        System.out.println("Ingrese la altura");
        p.setAltura(leer.nextDouble());
        return p;
    }
    
    public int calcularIMC(){
        double imc= p.getPeso()/(p.getAltura()*p.getAltura());
       
        if (imc>20 && imc<25) {
            pesoimc=0;
           // System.out.println("Está en su peso ideal");
        }else if (imc>25) {
            pesoimc=1;
            //System.out.println("Está por encima de su peso ideal");
        }else if (imc<20) {
            pesoimc=-1;
            //System.out.println("Está por debajo de su peso ideal");
        }
        return pesoimc;
    }
    
    public boolean esMayoDeEdad(){
        boolean mayor =false;
        try {
          if (p.getEdad()>=18) {
            mayor=true;   
        }  
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
     
       return mayor;
    }
}
