
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, 
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y 
los ingresa en los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos. 
 */
public class ServicioPuntos {
    Puntos p=new Puntos();
    Scanner leer=new Scanner(System.in);
    
    public void crearPuntos(){
        System.out.println("Ingrese 2 coordenadas.\n"
                + "X1\n"
        +"Y1");
        p.setPuntox1(leer.nextInt());
        p.setPuntoy1(leer.nextInt());
        System.out.println("Ingrese la 2da coordenada.\n"
                + "X2\n"
        +"Y2");
        p.setPuntox2(leer.nextInt());
        p.setPuntoy2(leer.nextInt());
    }

    
    public void calcularDistancia(){
        double distancia;
        distancia=Math.sqrt(Math.pow(p.getPuntox2()-p.getPuntox1(),2)+Math.pow(p.getPuntoy2()-p.getPuntoy1(),2));
        
        System.out.println("La distancia entre el P1 y el P2 es: "+distancia);
        
    }
}
