
package Service;

import Entidad.Perro;
import Enum.Raza;
import Enum.Size;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServiceAdopcion {
    
    Scanner leer;
  
    public ServiceAdopcion() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
      
    }
    
    public void llenaPerro(Perro p) {
        System.out.println("Escriba la raza para adoptar de las disponibles");
        for (Raza aux : Raza.values()) {
            System.out.println(aux.name());// Muestro la raza y le pido al usuario que elija una
        }
        System.out.println("");//solo para un salto de linea
        String razaElegida = leer.next();
        
        for (Raza aux : Raza.values()) {//recorre otra vez el enum raza y compara con lo ingresado por el usuario
            if (aux.toString().equalsIgnoreCase(razaElegida)) {
                p.setRaza(aux); //seteo la raza elegida
            }
        }
        System.out.println("-----------");
        
        System.out.println("Escriba el tamaño del perro");
        for (Size object : Size.values()) {//Muestro el enum Tamanio y le pido al usuario que elija
            System.out.println(object.name());
        }
        System.out.println("");
        String sizeElegido = leer.next();

        for (Size aux : Size.values()) {
            if (aux.toString().equalsIgnoreCase(sizeElegido)) {
                p.setTamaño(aux);//seteo el tamaño elegido
            }
        }
    }
    
}
