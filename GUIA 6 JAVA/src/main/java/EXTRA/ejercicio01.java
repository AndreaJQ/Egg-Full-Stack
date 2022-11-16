package EXTRA;

import java.util.Scanner;

/**
 * Dado un tiempo en minutos, calcular su equivalente en días y horas. Por
 * ejemplo, si el usuario ingresa 1600 minutos, el sistema debe calcular su
 * equivalente: 1 día, 2 horas.
 *
 * @author andreajalil
 */
public class ejercicio01 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE LOS MINUTOS");
        int mins = leer.nextInt();
        System.out.println(convertDias(mins));
        System.out.println(convertHoras(mins));
    }

    public static double convertDias(double mins) {

        return mins / 1440;
    }

    public static double convertHoras(double mins) {

        return mins / 60;
    }
}
