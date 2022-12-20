/*
Se debe crear también una subclase llamada Televisor con los siguientes atributos: resolución (en pulgadas)
y sintonizador TDT (booleano), además de los atributos heredados.
Los constructores que se implementarán serán:
• Un constructor vacío.
• Un constructor con la resolución, sintonizador TDT y el resto de los atributos heredados.
Recuerda que debes llamar al constructor de la clase padre.
Los métodos que se implementara serán:
• Método get y set de los atributos resolución y sintonizador TDT.
• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase padre,
lo utilizamos para llenar los atributos heredados del padre y después llenamos los atributos del televisor.
• Método precioFinal(): este método será heredado y se le sumará la siguiente funcionalidad.
Si el televisor tiene una resolución mayor de 40 pulgadas, 
se incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará $500. 
Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
Finalmente, en el main debemos realizar lo siguiente:
Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar el precio final de los dos electrodomésticos.
*/
package andrea.guia10ej2;

public class Televisor extends Electrodomestico{
    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(boolean sintonizador, double precio, String color, char letraConsumo, int peso) {
        super(precio, color, letraConsumo, peso);
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
