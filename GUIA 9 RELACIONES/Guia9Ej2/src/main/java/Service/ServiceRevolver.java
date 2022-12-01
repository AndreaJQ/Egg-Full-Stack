/*
Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual 
(posición del tambor que se dispara, puede que esté el agua o no) y posición agua 
(la posición del tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
Los valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
*/
package Service;

import Entidades.Revolver;
import java.util.Random;

public class ServiceRevolver {
    Revolver gun=new Revolver();
   /*
    • llenarRevolver(): le pone los valores de posición actual y de posición del agua. 
Los valores deben ser aleatorios.
    */
    
    public Revolver llenarRevolver(Revolver gun){
        Random num = new Random();
        gun.setPosicionActual(num.nextInt(7));
        gun.setPosicionAgua(num.nextInt(7));
        return gun;
    }
    
    public boolean mojar(Revolver gun){
        return gun.getPosicionActual()==gun.getPosicionAgua();
    }
    
    public void siguienteChorro(Revolver gun){
        gun.setPosicionActual(gun.getPosicionActual());
        if (gun.getPosicionActual()>6) {
            gun.setPosicionActual(0);
        }
    }
    
    public void mostrar(){
        System.out.println(gun.toString());
    }
}
