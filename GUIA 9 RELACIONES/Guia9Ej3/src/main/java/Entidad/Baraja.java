/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author andreajalil
 */
public class Baraja {
    private ArrayList<Cartas> cartasList;

    public Baraja() {
        this.cartasList = new ArrayList<>();
        for (int j = 1; j < 13; j++)
            {
                if (j != 8 && j != 9)
                {//AGREGO UNA CARTA DE CADA PALO POR VUELTA
                    this.cartasList.add(new Cartas(j, EnumPalo.BASTOS));
                    this.cartasList.add(new Cartas(j, EnumPalo.COPA));
                    this.cartasList.add(new Cartas(j, EnumPalo.ESPADAS));
                    this.cartasList.add(new Cartas(j, EnumPalo.ORO));
                }
            }
        
    }

    public ArrayList<Cartas> getCartasList() {
        return cartasList;
    }

    public void setCartasList(ArrayList<Cartas> cartasList) {
        this.cartasList = cartasList;
    }

    @Override
    public String toString() {
        return "Baraja{" + "cartasList=" + cartasList + '}';
    }
    
    
    
}
