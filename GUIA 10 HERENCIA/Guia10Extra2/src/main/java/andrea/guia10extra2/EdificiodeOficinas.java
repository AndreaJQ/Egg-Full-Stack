/*
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
public class EdificiodeOficinas extends Edificio{
    private String nombre;
    private int nroOficinas;
    private int personasXOficina;
    private int pisos;

    public EdificiodeOficinas() {
    }

    public EdificiodeOficinas(String nombre, int nroOficinas, int personasXOficina, int pisos, double ancho, double alto, double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.nroOficinas = nroOficinas;
        this.personasXOficina = personasXOficina;
        this.pisos = pisos;
    }



    public int getNroOficinas() {
        return nroOficinas;
    }

    public void setNroOficinas(int nroOficinas) {
        this.nroOficinas = nroOficinas;
    }

    public int getPersonasXOficina() {
        return personasXOficina;
    }

    public void setPersonasXOficina(int personasXOficina) {
        this.personasXOficina = personasXOficina;
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public double calcularSuperficie() {
         return super.ancho * super.largo;
       }

    @Override
    public double calcularVolumen() {
         return super.ancho * super.largo * super.alto;
         }
    
       /*
    De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio,
el usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), 
que muestre cuantas personas entrarían en un piso y cuantas en todo el edificio.
    */
    public void cantPersonas(){
        System.out.println("Cantidad de Personas por PISO es -> " + this.personasXOficina * this.nroOficinas);
        System.out.println("Cantidad de Personas en TODO el EDIFICIO es -> " + this.personasXOficina * this.nroOficinas * this.pisos);
    }

    @Override
    public String toString() {
        return "Edificio de Oficinas con " + nroOficinas + ", y " + pisos + " pisos ";
    }
    

}
