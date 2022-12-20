/*
Un alquiler se calcula multiplicando el número de días de ocupación 
(calculado con la fecha de alquiler y devolución), por un valor módulo de cada barco 
(obtenido simplemente multiplicando por 10 los metros de eslora).
En los barcos de tipo especial el módulo de cada barco se calcula sacando el módulo normal 
y sumándole el atributo particular de cada barco. En los veleros se suma el número de mástiles,
en los barcos a motor se le suma la potencia en CV y en los yates se suma la potencia en CV y el número de camarotes.
Utilizando la herencia de forma apropiada, deberemos programar en Java, las clases
y los métodos necesarios que permitan al usuario elegir el barco que quiera alquilar y mostrarle el precio final de su alquiler.*/


package andrea.guia10extra1;

/**
 *
 * @author andreajalil
 */
public class Velero extends Barco{
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + this.mastiles;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Cúantos mástiles desea?");
        this.mastiles=sc.nextInt();
       
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El alquiler del Velero \n"
                + "Matrícula: "+ getMatricula()+"\n"
                        + "año de fabricación: "+ getAñoFabricacion()+"\n"
                                + "de " + getEslora()+" metros de eslora \n"
                                        + "y "+ getMastiles()+" mástiles \n"
                                        + "es de " + valorModulo() +" por día.");
    }
    
    
    
}
