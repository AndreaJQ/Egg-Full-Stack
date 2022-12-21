/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10extra3;

/**
 *
 * @author andreajalil
 */
public class Campings extends ExtraHoteleros{
    private int maxCarpas;
    private int baños;
    private boolean rest;

    public Campings() {
    }

    public Campings(int maxCarpas, int baños, boolean rest, boolean privado, double metros2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros2, nombre, direccion, localidad, gerente);
        this.maxCarpas = maxCarpas;
        this.baños = baños;
        this.rest = rest;
    }

    public int getMaxCarpas() {
        return maxCarpas;
    }

    public void setMaxCarpas(int maxCarpas) {
        this.maxCarpas = maxCarpas;
    }

    public int getBaños() {
        return baños;
    }

    public void setBaños(int baños) {
        this.baños = baños;
    }

    public boolean isRest() {
        return rest;
    }

    public void setRest(boolean rest) {
        this.rest = rest;
    }

    @Override
    public void crearAlojamiento() {
        super.crearAlojamiento();
        System.out.println("Capacidad Maxima de Carpas?");
        this.maxCarpas = leer.nextInt();
        System.out.println("Cantidad de Baños?");
        this.baños = leer.nextInt();
        System.out.println("Tiene Restorant? S/N");
        char op = leer.next().toUpperCase().charAt(0);
        if (op == 'S') {
            this.rest = true;
        } else if (op == 'N') {
            this.rest = false;
        } else {
            System.out.println("Ingreso una opcion no validad se tomara por defecto que No tiene");
            this.rest = false;
        }
    }
    
      @Override
    public String toString() {
        String rest = "No posee";
        if(this.rest){
            rest = "Si Posee";
        }
        System.out.println(super.toString());
        return "Camping " + this.maxCarpas + " carpas, \n" + this.baños + " baños \n" + rest + " Restaurant";
        
    }

    
}
