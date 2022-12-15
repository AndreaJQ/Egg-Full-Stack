/*
 Crear una superclase llamada Electrodoméstico con los siguientes atributos:
precio, color, consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro. Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es, 
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son blanco, 
negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en minúsculas.
Este método se invocará al crear el objeto y no será visible.
   ver los videos relacionados con este tema, antes de empezar los
 ejercicios, los podrás encontrar en tu aula virtual o en nuestro canal de YouTube.
 
• Metodo crearElectrodomestico(): le pide la información al usuario y llena el electrodoméstico,
también llama los métodos para comprobar el color y el consumo. Al precio se le da un valor base de $1000.
• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del precio. 
Esta es la lista de precios:
    LETRA PRECIO A $1000 B $800 C $600 D $500 E $300 F $100
PESO
Entre 1 y 19 kg $100
Entre 20 y 49 kg $500 Entre 50 y 79 kg $800 Mayor que 80 kg $1000
PRECIO*/
package andrea.guia10ej2;

import java.util.Scanner;

public class Electrodomestico {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    protected double precio=1000;
    protected String color;
    protected char letraConsumo;
    protected int peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char letraConsumo, int peso) {
        this.precio = precio;
        this.color = comprobarColor(color);
        this.letraConsumo = comprobarConsumoEnergetico(letraConsumo);
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getLetraConsumo() {
        return letraConsumo;
    }

    public void setLetraConsumo(char letraConsumo) {
        this.letraConsumo = letraConsumo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precio=" + precio + ", color=" + color + ", letraConsumo=" + letraConsumo + ", peso=" + peso + '}';
    }
    
    private char comprobarConsumoEnergetico(char letra){
          switch (letra) {
            case 'A':
                break;
            case 'B':
                break;
            case 'C':
                break;
            case 'D':
                break;
            case 'E':
                break;
            case 'F':
                break;
            default:
                letra = 'F';
        }
        return letra;
    }
    
    private String comprobarColor(String color){
        switch (color) {
            case "BLANCO":
                color = "Blanco";
                break;
            case "NEGRO":
                color = "Negro";
                break;
            case "GRIS":
                color = "Gris";
                break;
            case "AZUL":
                color = "Azul";
                break;
            case "ROJO":
                color = "Rojo";
                break;
            default:
                color = "Blanco";
        }
        return color;
        
    }
    
    public void crearElectrodomestico(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el Color");
        String vColor = leer.next().toUpperCase();
        this.color = comprobarColor(vColor);
        System.out.println("Ingrese el Consumo (A,B,C,D o F)");
        char letra = leer.next().toUpperCase().charAt(0);
        this.letraConsumo = comprobarConsumoEnergetico(letra);
        System.out.println("Cuanto Pesa?");
        this.peso = (int) leer.nextDouble();
        precioFinal();

    }
    
    public void precioFinal() {
               
        switch (this.letraConsumo) {
            case 'A':
                this.precio += 1000;
                break;
            case 'B':
                this.precio += 800;
                break;
            case 'C':
                this.precio += 600;
                break;
            case 'D':
                this.precio += 500;
                break;
            case 'E':
               this.precio += 300;
                break;
            case 'F':
                this.precio += 100;
                break;
            default:
                this.precio = 0;
        }

        if (this.peso > 80) {
            this.precio += 1000;
        } else if (this.peso >= 50) {
            this.precio += 800;
        } else if (this.peso >= 20) {
            this.precio += 500;
        } else {
            this.precio += 100;
        }
                
    }

}
