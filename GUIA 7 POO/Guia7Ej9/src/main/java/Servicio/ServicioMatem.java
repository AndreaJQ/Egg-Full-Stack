
package Servicio;

import Entidades.Matematica;

public class ServicioMatem {

    Matematica m = new Matematica();
    
/*a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor*/
    public void devolverMayor(int n1, int n2){
        if (n1>n2) {
            m.setNumMayor(n1);
            m.setNumMenor(n2);
            System.out.println("El primer numero ingresado ("+n1+") es mayor");
        }else{
           m.setNumMayor(n2);
           m.setNumMenor(n1);
            System.out.println("El segundo numero ingresado ("+n2+") es mayor");
        }
    }
    
    
/*b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número. Previamente se deben redondear ambos valores.*/
    public int calcularPotencia(){
        int potencia;
        potencia = (int) Math.pow(m.getNumMayor(), m.getNumMenor());
        
        return potencia;
        
    }
    
/*c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
    
    public int calculaRaiz(){
        int raiz= (int )Math.sqrt(m.getNumMenor());
        return raiz;
        
    }
}
