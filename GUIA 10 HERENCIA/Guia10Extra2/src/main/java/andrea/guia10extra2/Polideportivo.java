/*
• Clase Polideportivo con su nombre y tipo de instalación que puede ser Techado o Abierto,
esta clase implementará los dos métodos abstractos y los atributos del padre.
• Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas 
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio,
el usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), 
que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList 
debe contener dos polideportivos y dos edificios de oficinas. Luego,
recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio.
Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos 
son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al 
método cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/
package andrea.guia10extra2;

/**
 *
 * @author andreajalil
 */
public class Polideportivo extends Edificio{
    private String nombre;
    private boolean intalacionTecho;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean intalacionTecho, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.intalacionTecho = intalacionTecho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isIntalacionTecho() {
        return intalacionTecho;
    }

    public void setIntalacionTecho(boolean intalacionTecho) {
        this.intalacionTecho = intalacionTecho;
    }

     
    @Override
    public double calcularSuperficie() {
         return super.ancho * super.largo;
       }

    @Override
    public double calcularVolumen() {
         return super.ancho * super.largo * super.alto;
         }

    public String Techado(){
         String techado = "TECHADO";
        if (intalacionTecho==false) {
            techado= "AIRE LIBRE";
        }
        return "Intalacion de tipo: " + techado;
    }
//    @Override
//    public String toString() {
//        String techado = "TECHADO";
//        if (intalacionTecho==false) {
//            techado= "AIRE LIBRE";
//        }
//        return "Polideportivo " + nombre + ", Intalacion de tipo: " + techado;
//    }
    
    
}
