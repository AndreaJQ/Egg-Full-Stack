
package Entidades;

/**
 Crea una clase en Java donde declares una variable de tipo array de Strings que contenga los doce meses del año
 , en minúsculas.
 * A continuación, declara una variable mesSecreto de tipo String,
 y hazla igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. 
 * El programa debe pedir al usuario que adivine el mes secreto.
 * Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a 
 * intentar adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:

 */
public class Meses {
    
    private String[]meses= {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    private String mesSecreto;

    public Meses() {
        //this.mesSecreto= meses[6];
    }

    public String[] getMeses() {
        return meses;
    }

    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

   

    
    
}
