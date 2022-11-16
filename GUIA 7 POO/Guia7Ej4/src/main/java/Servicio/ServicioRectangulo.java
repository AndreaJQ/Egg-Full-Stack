
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {
    
    public Rectangulo CrearRectangulo(){
        Scanner leer = new Scanner(System.in);
        Rectangulo rect=new Rectangulo();
        System.out.println("Ingrese el valor de la BASE: ");
        rect.setBase(leer.nextInt());
        System.out.println("Ingrese el valor de la ALTURA: ");
        rect.setAltura(leer.nextInt());
        return rect;
    }
    
    public int Superficie(Rectangulo rect){
          return rect.getAltura()*rect.getBase();
    }
    
    
    public int Perimetro (Rectangulo rect){
        return (rect.getBase()*rect.getAltura())*2;
    }
    
    public void dibujo (Rectangulo rect){
        for (int i = 0; i < rect.getBase(); i++) {
            for (int j = 0; j < rect.getAltura(); j++) {
                if ((i==0) || (i==rect.getBase()-1) || (j==0) || (j==rect.getAltura()-1) ) {
                    System.out.print(" * ");
                }else
                    System.out.print("   ");
                
            }
            System.out.println("");
          
        }
        
        
    }
}
