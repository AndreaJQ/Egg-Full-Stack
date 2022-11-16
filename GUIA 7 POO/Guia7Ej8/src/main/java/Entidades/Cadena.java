
/*8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de String) y su longitud.*/
package Entidades;

public class Cadena {
    private String frase;
    private int largo; 
    private String letra;
    private String letra2;
    
    public Cadena() {
    }

    public Cadena(String frase, int largo, String letra,String letra2) {
        this.frase = frase;
        this.largo = largo;
        this.letra = letra;
        this.letra2= letra;
    }


    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getLetra2() {
        return letra2;
    }

    public void setLetra2(String letra2) {
        this.letra2 = letra2;
    }
 
    /*a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.*/
    public void mostrarVocales(){
        int cont=0;
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i+1).contains("a")||frase.substring(i, i+1).contains("e")||frase.substring(i, i+1).contains("i")||frase.substring(i, i+1).contains("o")||frase.substring(i, i+1).contains("u")){
                cont++;
            }
            if (frase.substring(i, i+1).contains("A")||frase.substring(i, i+1).contains("E")||frase.substring(i, i+1).contains("I")||frase.substring(i, i+1).contains("O")||frase.substring(i, i+1).contains("U")){
                cont++;
            }
        }
        System.out.println("Contiene "+cont + " vocales");
    }
    
    /*b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".*/
    public void invertirFrese(){
        char[]invertir=frase.toCharArray();
        for (int i = frase.length()-1; i >= 0; i--) {
            System.out.print(""+invertir[i]);
        }
        System.out.println("");
    }
    
    /*
    c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
 Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces. */
    public void vecesRepetido (){
       int cont=0;
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i+1).equalsIgnoreCase(getLetra())){
                cont++;
            }
        }
        System.out.println("Contiene la letra '"+ letra+ "' " +cont + " veces");
    }
    
    /* e) Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.*/
    
    public void compararLongitud(String frase, String frase2){
        if (frase.length()>frase2.length()) {
            System.out.println("La primera frase '"+frase+ "' contine más caracteres que la segunda frase '"+ frase2 +"'");
       }else{
            System.out.println("La segunda frase '"+frase2+ "' contine más caracteres que la segunda frase '"+ frase2+"'" );
        }
    }
    
    /*f) Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.*/
    public void unirFrases(String frase, String frase3){
        System.out.println("La frase unida es: \n"
                + frase +" " + frase3);
    }

    /*g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se encuentren en la frase,
    por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.*/
    public void reemplazar(String letra, String letra2){
        for (int i = 0; i < largo; i++) {
            if (frase.substring(i, i+1).contains(letra)) {
                frase=frase.replace(letra, letra2);   
            }
        }
        System.out.println(frase);
    }
    
    /*h) Método contiene(String letra), deberá comprobar si la frase contiene una
    letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
    public boolean contiene(String letra){
        boolean contains=false;
        if (frase.contains(letra)) {
            contains=true;
        }
        return contains;
    }
}

