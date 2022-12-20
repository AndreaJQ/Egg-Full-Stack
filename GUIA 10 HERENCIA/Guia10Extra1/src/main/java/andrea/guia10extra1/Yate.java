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
public class Yate extends Barco{
    protected int camotes;
    protected int CV;

    public Yate() {
    }

    public Yate(int camotes, int CV, int matricula, int eslora, int añoFabricacion) {
        super(matricula, eslora, añoFabricacion);
        this.camotes = camotes;
        this.CV = CV;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }


    public int getCamotes() {
        return camotes;
    }

    public void setCamotes(int camotes) {
        this.camotes = camotes;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo()+this.CV+this.camotes;
    }

    @Override
    public void crearBarco() {
        super.crearBarco();
        System.out.println("Cúantos camarotes desea?");
        this.camotes=sc.nextInt();
        System.out.println("Cuantos CV?");
        this.CV=sc.nextInt();
    }

    @Override
    public void mostrarInfo() {
        System.out.println("");
        System.out.println("El precio del YATE de " + getCamotes() + " camarotes,\n"
        + "Matricula: " + getMatricula()+ "\n"
                + "Año de fabicación:" + getAñoFabricacion()+"\n"
                 +"de "+ getEslora() +" metros de eslora\n"
                + "y " + getCV()+ " CV de potencia \n"
                + "es de " + valorModulo() +" el amarre por día\n");
    }
  
}
