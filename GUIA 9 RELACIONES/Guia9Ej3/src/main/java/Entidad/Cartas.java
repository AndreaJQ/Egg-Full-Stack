/*
 Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un 
número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas).
Esta clase debe contener un método toString() que retorne el número de carta y el palo. */
package Entidad;

/**
 *
 * @author andreajalil
 */
public class Cartas {
    private Integer num;
    private EnumPalo palo;

    public Cartas() {
    }

    public Cartas(Integer num, EnumPalo palo) {
        this.num = num;
        this.palo = palo;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public EnumPalo getPalo() {
        return palo;
    }

    public void setPalo(EnumPalo palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Cartas{" + "Nro=" + num + ", Palo=" + palo + '}';
    }
    
    
    
    
}
