/*
Por último, en el main vamos a crear un ArrayList de tipo Edificio. El ArrayList 
debe contener dos polideportivos y dos edificios de oficinas. Luego,
recorrer este array y ejecutar los métodos calcularSuperficie y calcularVolumen en cada Edificio.
Se deberá mostrar la superficie y el volumen de cada edificio.
Además de esto, para la clase Polideportivo nos interesa saber cuántos polideportivos 
son techados y cuantos abiertos. Y para la clase EdificioDeOficinas deberemos llamar al 
método cantPersonas() y mostrar los resultados de cada edificio de oficinas.*/

package andrea.guia10extra2;

import java.util.ArrayList;

public class Guia10Extra2 {

    public static void main(String[] args) {
      
        ArrayList<Edificio> listEdificios=new ArrayList<>();
        EdificiodeOficinas EdA=new EdificiodeOficinas("A", 10, 3, 2, 8, 6, 30);
        EdificiodeOficinas EdB=new EdificiodeOficinas("B", 4, 3, 2, 8, 6, 30);
        
        listEdificios.add(new Polideportivo("A", true, 100, 4 , 60));
        listEdificios.add(new Polideportivo("B", true, 50, 3 , 40));
        listEdificios.add(EdA);
        listEdificios.add(EdB);
        
        int cont=0;
        int cantEdif=0;
        int cantPoli=0;
        
        for (Edificio aux : listEdificios) {
            
            if (aux instanceof EdificiodeOficinas) {
                cantEdif++;
                 System.out.println(" ");
                System.out.println("EDIFICIO " + ((EdificiodeOficinas) aux).getNombre());
             
                System.out.print("SUPERFICIE -> " );
                System.out.println(aux.calcularSuperficie() + " mts2");
                System.out.print("VOLUMEN -> ");
                System.out.println(aux.calcularVolumen()+ " mts3");
                
                ((EdificiodeOficinas) aux).cantPersonas();
            }
            
            if (aux instanceof Polideportivo) {
                cantPoli++;
                System.out.println(" ");
                System.out.println("POLIDEPORTIVO " + ((Polideportivo) aux).getNombre());
               
                System.out.print("SUPERFICIE -> ");
                System.out.println(aux.calcularSuperficie()+ " mts2");
                System.out.print("VOLUMEN -> ");
                System.out.println(aux.calcularVolumen()+ " mts2");
                System.out.println(((Polideportivo) aux).Techado());
                if (((Polideportivo) aux).isIntalacionTecho()) {
                    cont++;
                }
            }
        }
        System.out.println("");
        System.out.println("La cantidad de Polideportivos es: " + cantPoli);
        System.out.println("de los cuales " + cont + " son techados, y " + (cantPoli-cont) + " no son techados");
        System.out.println("");
        System.out.println("La cantidad de Edificios de oficinas es: " + cantEdif);
    }
}
