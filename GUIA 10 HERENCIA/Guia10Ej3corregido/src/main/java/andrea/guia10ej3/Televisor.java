/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package andrea.guia10ej3;

/**
 *
 * @author andreajalil
 */
public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, String color, char letraConsumo, int peso) {
        super(precio, color, letraConsumo, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    
    public void crearTelevisor (){
       
       System.out.println("----CREANDO TELEVISOR----");
       super.crearElectrodomestico();
       System.out.println("¿Cuántas pulgadas tiene?");
       this.resolucion=leer.nextInt();
        System.out.println("¿Tine sintonizador? (S/N)");
        String sinto=leer.next();
        if (sinto.equalsIgnoreCase("s")) {
             this.sintonizador=true;
        }
       precioFinal();
       mostrarInfo();
   }
   /*
    Si el televisor tiene una resolución mayor de 40 pulgadas, 
se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500.
    */
  @Override
    public void precioFinal() {
        super.precioFinal();
        if (sintonizador) {
           this.precio+=500;
       }
         if (this.resolucion>=40) {
           this.precio= this.precio*1.30;
          
       }
    }
   public void mostrarInfo(){
        System.out.println("El consumo energetico es: '"+this.letraConsumo+"'\n"
                + "El color es: '"+ this.color +"' \n"
                        + "el peso es "+this.peso+"\n"
                                + "la resolución es: "+this.resolucion+"\n"
                                        + "sintonizador: " +this.sintonizador +"\n"
        + "El precio final será: $"+this.precio );
   }
   
    
    
      
}
