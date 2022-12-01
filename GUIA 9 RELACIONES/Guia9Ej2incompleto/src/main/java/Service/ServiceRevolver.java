
package Service;

import Entidades.Revolver;

public class ServiceRevolver { //le pone los valores de posición actual y de posición del agua. 
    private Revolver r =new Revolver();
    
    public Revolver llenarRevolver( ) {
        r.setPosicionActual((int) (Math.random() * 6 + 1)); //Estas dos posiciones, se generarán aleatoriamente.
        r.setPosicionAgua((int) (Math.random() * 6 + 1));//numeros aleatorios de 0 al 6, excluido el 6, al sumar 1 el randon seria de 1 a 6
    return r;
    }
    
    public boolean mojar(Revolver r){ //devuelve true si la posición del agua coincide con la posición actual
        return r.getPosicionAgua()==r.getPosicionActual();
    }

    public void siguienteChorro(Revolver r) {
        r.setPosicionActual(r.getPosicionActual());
        if (r.getPosicionActual()>6) {
            r.setPosicionActual(r.getPosicionActual()+1);
        }

    }
    public void mostrar(){
        System.out.println(r.toString());
    }
    
}
