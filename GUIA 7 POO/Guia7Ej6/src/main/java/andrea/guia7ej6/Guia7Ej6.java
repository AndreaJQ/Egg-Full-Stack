package andrea.guia7ej6;

import Entidades.Cafetera;
import java.util.Scanner;

public class Guia7Ej6 {

    public static void main(String[] args) {
        Cafetera nespreso = new Cafetera();
        int op;
        Scanner leer= new Scanner(System.in);
        
        do {
            System.out.println("Qué desea realizar:");
            System.out.println("1.Llenar la cafetera.\n 2. Servir taza \n 3. Vaciar Cafetera. \n 4. Agregar café. \n 5. Salir");
            op=leer.nextInt();
            switch (op) {
                case 1:
                    nespreso.llenarCafetera();
                    break;
                    case 2:
                    nespreso.servirTaza();
                    break;
                    case 3:
                    nespreso.vaciarCafetera();
                    break;
                    case 4:
                    nespreso.agregarCafe();
                    break;
                    case 5:
                        System.out.println("Terminando...");
                    break;
                default:
                    System.out.println("Error!");
            }
            
        } while (op!=5);
        
        
        
        
    }
}
