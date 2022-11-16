/*

8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud.
En el main se creará el objeto y se le pedirá al usuario que ingrese una frase que puede ser una palabra
o varias palabras separadas por un espacio en blanco y 
a través de los métodos set, se guardará la frase y la longitud de manera automática según la longitud de la frase ingresada.
Deberá además implementar los siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.
*/
package andrea.guia7ej8;

import Entidades.Cadena;
import java.util.Scanner;

public class Guia7Ej8 {

    public static void main(String[] args) {
     Cadena frase = new Cadena();
     Cadena frase2=new Cadena();
     Cadena frase3=new Cadena();
     Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese una frase.");
        frase.setFrase(leer.nextLine());
        frase.setLargo(frase.getFrase().length());
        
        System.out.println("----------------------");
        
        frase.mostrarVocales();
        System.out.println("----------------------");
        frase.invertirFrese();
        System.out.println("----------------------");
        System.out.println("Ingrese una letra.");
        frase.setLetra(leer.nextLine());
        System.out.println("----------------------");
        frase.vecesRepetido();
        System.out.println("----------------------");
        System.out.println("Ingrese una nueva frase.");
        frase2.setFrase(leer.nextLine());
        frase2.setLargo(frase2.getFrase().length());
        System.out.println("----------------------");
        frase.compararLongitud(frase.getFrase(), frase2.getFrase());
        System.out.println("----------------------");
        System.out.println("Ingrese una nueva frase para concatenar.");
        frase3.setFrase(leer.nextLine());
        frase.unirFrases(frase.getFrase(),frase3.getFrase());
        System.out.println("----------------------");
        System.out.println("Elija una letra para ser reemplazada.");
        frase.setLetra(leer.next());
        System.out.println("Elija la letra que quiere colocar.");
        frase.setLetra2(leer.next());
        System.out.println("----------------------");
        frase.reemplazar(frase.getLetra(), frase.getLetra2());
        System.out.println("----------------------");
        System.out.println("Ingrese una letra que quiera encontrar.");
        frase.setLetra(leer.next());
        frase.contiene(frase.getLetra());
        System.out.println("----------------------");
        System.out.println(frase.contiene(frase.getLetra()));
    }


}
