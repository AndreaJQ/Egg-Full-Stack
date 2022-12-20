/*
 /*
Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.
Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. 
Se deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los televisores y el de las lavadoras.
Una vez hecho eso, también deberemos mostrar, la suma del precio de todos los Electrodomésticos.
Por ejemplo, si tenemos una lavadora con un precio de 2000 y un televisor de 5000,
el resultado final será de 7000 (2000+5000) para electrodomésticos, 2000 para lavadora y 5000 para televisor.*/

package andrea.guia10ej3;

import java.util.ArrayList;

/**
 *
 * @author andreajalil
 */
public class Guia10Ej3 {

    public static void main(String[] args) {
        ArrayList<Electrodomestico>ListElectr= new ArrayList<>(); //inicio una lista de Electrodomesticos
        int suma=0, precioTv=0 , precioLavadora=0;
        int contTv=0, contLavadora=0;
        
        Televisor t1 = new Televisor(40, true, 1, "NEGRO", 'A', 15);
        Televisor t2 = new Televisor(40, true, 2, "GRIS", 'B', 20);
        Lavadora l1 = new Lavadora(40, 3, "AZUL", 'C', 90);
        Lavadora l2 = new Lavadora(40, 4, "ROJO", 'D', 90);
       
        ListElectr.add(t1);
        ListElectr.add(t2);
        ListElectr.add(l1);
        ListElectr.add(l2);
         
        for (Electrodomestico aux : ListElectr) {
            
            if (aux instanceof Lavadora) { //el aux de acá es solo para lavadora entoces el getprecio será solo de lavadora.
                aux.precioFinal();
                System.out.println("MOSTRANDO INFORMACIÓN LAVADORA");
               ((Lavadora) aux).mostrarInfo();
                System.out.println("-------------");
                contLavadora++;
                  precioLavadora+=aux.getPrecio();
            }else if(aux instanceof Televisor){//el aux de acá es solo para tv entoces el getprecio será solo de tv.
                aux.precioFinal();
                 System.out.println("MOSTRANDO INFORMACIÓN TELEVISOR");
               ((Televisor) aux).mostrarInfo();
                System.out.println("-------------");
                contTv++;
                precioTv+=aux.getPrecio();
            }
             suma += aux.getPrecio(); //sumo los totales de precios
        }
        
         
         
        System.out.println("Hay "+contLavadora+" Lavadoras, con un valor total de $ "+precioLavadora);
        System.out.println("Hay "+contTv+" Televisores, con un valor total de $ "+precioTv);
        System.out.println("------------------------");
        System.out.println("El costo total de los electrodomesticos es de: $ " + suma);
    }
}
