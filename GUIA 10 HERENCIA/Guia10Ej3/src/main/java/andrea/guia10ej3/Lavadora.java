/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10ej3;

/**
 *
 * @author andreajalil
 */
public class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora() {
    }

    public Lavadora(int carga, double precio, String color, char letraConsumo, int peso) {
        super(precio, color, letraConsumo, peso);
        this.carga = carga;
    }

   

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
   
   
   public void crearLavadora (){
       
       System.out.println("----CREANDO LAVADORA----");
       super.crearElectrodomestico();
       System.out.println("¿Qué carga tiene la lavadora?");
       this.carga=leer.nextInt();
       precioFinalLavadora();
       mostrarInfo();
   }
   
   public void precioFinalLavadora(){
       if (this.carga>=30) {
           this.precio+=500;
       }
       
   }
   public void mostrarInfo(){
        System.out.println("El consumo energetico es: '"+this.letraConsumo+"'\n"
                + "El color es: '"+ this.color +"' \n"
                        + "el peso es "+this.peso+"\n"
                                + "y el nivel de carga es: "+this.carga +"\n"
        + "El precio final será: $"+this.precio );
   }
}
