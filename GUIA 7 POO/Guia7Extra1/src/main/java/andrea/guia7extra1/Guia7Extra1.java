/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́ definir además dos constructores: uno 
vacío que inicializa el titulo y el autor a cadenas vacías y otro que reciba como parámetros el titulo y el autor de la canción.
Se deberán además definir los métodos getters y setters correspondientes.
*/
package andrea.guia7extra1;

import Service.CancionServicio;

public class Guia7Extra1 {

    public static void main(String[] args) {
        CancionServicio cs=new CancionServicio();
        
        cs.crearCancion();
        System.out.println("--------------------");
        cs.mostrarCancion();
        
    }
}
