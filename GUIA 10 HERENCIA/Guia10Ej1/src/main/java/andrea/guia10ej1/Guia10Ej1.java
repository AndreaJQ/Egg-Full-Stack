/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andrea.guia10ej1;

/**
 *
 * @author andreajalil
 */
public class Guia10Ej1 {

    public static void main(String[] args) {
    //Declaración del objeto Perro
    Animal perro1 = new Perro("Stich", "Carnivoro", 15, "Doberman");
    perro1.Alimentarse();

    //Declaración de otro objeto Perro
    Animal perro2 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
    perro2.Alimentarse();

    //Declaración del objeto Gato
    Animal gatol = new Gato("Pelusa", "Galletas", 15, "Siamés");
    gatol.Alimentarse();

    //Declaración del objeto Caballo
    Animal caballol = new Caballo("Spark", "Pasto", 25, "Fino");
    caballol.Alimentarse();
    }
}
