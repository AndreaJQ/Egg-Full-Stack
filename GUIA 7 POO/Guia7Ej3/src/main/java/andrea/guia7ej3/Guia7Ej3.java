
package andrea.guia7ej3;

import Entidades.Operacion;
import Servicio.OperacionServicio;

public class Guia7Ej3 {

    public static void main(String[] args) {
        OperacionServicio svc= new OperacionServicio();
        Operacion op= svc.creaOperacion();
        System.out.println("La suma es: "+svc.sumar(op));
        System.out.println("La resta es: "+svc.restar(op));
        if (svc.multiplicar(op)==0) {
            System.out.println("Error. Multiplicación por 0");
        }else System.out.println("La multiplicación es: "+svc.multiplicar(op));
        
        if (svc.dividir(op)==-1) {
            System.out.println("Error. Estas dividiendo por 0.");
        }else System.out.println("La división es: "+svc.dividir(op));
    }
}
 