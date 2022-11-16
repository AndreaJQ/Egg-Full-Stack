package andrea.guia7ej4;

import Entidades.Rectangulo;
import Servicio.ServicioRectangulo;

public class Guia7Ej4 {

    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rect= sr.CrearRectangulo();
        System.out.println("La superficie es: " + sr.Superficie(rect));
        System.out.println("El perimetro es: "+ sr.Perimetro(rect));
        
        sr.dibujo(rect);
        
    }
}
