/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener 
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas 
y la cantidad jugadas máximas que 
puede realizar el usuario. Definir los siguientes métodos con los parámetros que sean necesarios:
 */
package Entidades;

public class Ahorcado {
    private String []palabra;
    private String []palabraAux;
    private int cantEncontradas;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraAux, int cantEncontradas, int cantJugadas) {
        this.palabra = palabra;
        this.palabraAux = palabraAux;
        this.cantEncontradas = cantEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraAux() {
        return palabraAux;
    }

    public void setPalabraAux(String[] palabraAux) {
        this.palabraAux = palabraAux;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
    
    
}
