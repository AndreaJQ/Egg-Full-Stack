/*
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario todos sus datos
y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:
   ver los videos relacionados con este tema, antes de empezar los
 ejercicios, los podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
Pueden encontrar un ejemplo de Colección como Atributo en tu Aula Virtual.
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.
 */

package andrea.guia8ej4;

import Service.ServicePeli;

/**
 *
 * @author andreajalil
 */
public class Guia8Ej4 {

    public static void main(String[] args) {
        ServicePeli sp=new ServicePeli();
        
        sp.crearPelicula();
        sp.mostrarTodas();
        sp.mostrasMayor1hr();
        
        sp.mostrarOrdenDuracMay();
        sp.mostrarOrdenDuracMeno();
        sp.mostrarOrdenTitulo();
        sp.mostrarOrdenDirector();
    }
}
