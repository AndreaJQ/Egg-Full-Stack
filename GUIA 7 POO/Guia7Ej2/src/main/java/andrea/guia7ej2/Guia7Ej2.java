
package andrea.guia7ej2;

import Entidades.Circunferencia;
import java.util.Scanner;

public class Guia7Ej2 {

    public static void main(String[] args) {
        Circunferencia circulo= crearCircumferencia();
        System.out.println("El area es " + circulo.area());
        System.out.println("El perimetro es " + circulo.perimetro());
        
    }
    
   
    public static Circunferencia crearCircumferencia(){
        Scanner leer=new Scanner(System.in);
        Circunferencia circulo= new Circunferencia();
        System.out.println("Radio del círculo");  
        circulo.setRadio(leer.nextDouble());
        return circulo;
        
        
    }
}
