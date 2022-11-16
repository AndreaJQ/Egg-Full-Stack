package andrea.guia7ej9;

import Entidades.Matematica;
import Servicio.ServicioMatem;

/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un constructor vacío,
parametrizado y get y set. 
En el main se creará el objeto y se usará el Math.random para generar los dos números y se guardaran en el objeto con su respectivos set. 
Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase elevado al menor número.
Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
*/
public class Guia7Ej9 {

    public static void main(String[] args) {
        ServicioMatem sm=new ServicioMatem();
        Matematica m=new Matematica();
        double n1 = Math.random()*10+1;
        double n2 = Math.random()*10+1;
        
        m.setNum1((int)n1);
        m.setNum2((int)n2);
        System.out.println(m.getNum1());
        System.out.println(m.getNum2());
        sm.devolverMayor(m.getNum1(), m.getNum2());
        System.out.println("la potencia del mayor numero elevado al menor numero es "+ sm.calcularPotencia());
        System.out.println("la raiz cuadrada del menor numero es "+sm.calculaRaiz());
        
        
        
        
    }
}
