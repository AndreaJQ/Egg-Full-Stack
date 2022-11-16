
package Servicio;

import Entidad.Nif;
import java.util.Scanner;

public class ServicioNif {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Nif n1 = new Nif();
    
    public Nif crearNif(){
        
        
        System.out.println("DNI:");
        n1.setDNI(leer.nextLong());
        String []vector= {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E",};
        
        double resp=n1.getDNI()%23;
        int resp2=(int)resp;
        System.out.println(resp2);
        n1.setNif(vector[resp2]);
        return n1;
    }
    
    public void mostrar(){
        System.out.println(n1.getDNI() + " " + n1.getNif());
        
    }
}
