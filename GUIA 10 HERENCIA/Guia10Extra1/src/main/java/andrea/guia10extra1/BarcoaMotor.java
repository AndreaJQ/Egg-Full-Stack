/*
 Sin embargo, se pretende diferenciar la información de algunos tipos de barcos especiales:
• Número de mástiles para veleros.
• Potencia en CV para barcos a motor.
• Potencia en CV y número de camarotes para yates de lujo.*/
package andrea.guia10extra1;

/**
 *
 * @author andreajalil
 */
public class BarcoaMotor extends Barco{
    protected int CV;

    public BarcoaMotor() {
    }

    public BarcoaMotor(int CV, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo()+this.CV;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Cuantos CV?");
        this.CV=sc.nextInt();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("El alquiler del Barco a motor \n"
                + "Matrícula: "+ getMatricula()+"\n"
                        + "año de fabricación: "+ getAñoFabricacion()+"\n"
                                + "de " + getEslora()+" metros de eslora \n"
                                        + "y "+ getCV() +"CV de potencia \n"
                                        + "es de " + valorModulo() +" por día.");
    }
    
    
    
    
    
}
