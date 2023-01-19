/*
Una compañía de promociones turísticas desea mantener información sobre la infraestructura de
alojamiento para turistas, de forma tal que los clientes puedan planear sus vacaciones de acuerdo con sus posibilidades.
Los alojamientos se identifican por un nombre, una dirección, una localidad y un gerente encargado del lugar.
La compañía trabaja con dos tipos de alojamientos: Hoteles y Alojamientos Extrahoteleros.
Los Hoteles tienen como atributos: Cantidad de Habitaciones, Número de Camas, Cantidad de Pisos, Precio de Habitaciones.
Y estos pueden ser de cuatro o cinco estrellas. Las características de las distintas categorías son las siguientes:
• Hotel **** 
Cantidad de Habitaciones,
Número de camas, 
Cantidad de Pisos, 
Gimnasio, 
Nombre del Restaurante, 
Capacidad del Restaurante, 
Precio de las Habitaciones.
• Hotel ***** Cantidad de Habitaciones, Número de camas, 
Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, 
Capacidad del Restaurante,
Cantidad Salones de Conferencia, 
Cantidad de Suites, 
Cantidad de Limosinas, 
Precio de las Habitaciones.
Los gimnasios pueden ser clasificados por la empresa como de tipo “A” o de tipo “B”, 
de acuerdo a las prestaciones observadas. Las limosinas están disponibles para cualquier cliente,
pero sujeto a disponibilidad, por lo que cuanto más limosinas tenga el hotel, más caro será.
El precio de una habitación debe calcularse de acuerdo con la siguiente fórmula: 
PrecioHabitación = $50 + ($1 x capacidad del hotel) + (valor agregado por restaurante) + (valor agregado por gimnasio) + (valor agregado por limosinas).
Donde:
Valor agregado por el restaurante:
• $10 si la capacidad del restaurante es de menos de 30 personas.
• $30 si está entre 30 y 50 personas.
• $50 si es mayor de 50. Valor agregado por el gimnasio:
• $50 si el tipo del gimnasio es A.
• $30 si el tipo del gimnasio es B.
Valor agregado por las limosinas:
• $15 por la cantidad de limosinas del hotel.
 16
En contraste, los Alojamientos Extra hoteleros proveen servicios diferentes a los de los hoteles,
estando más orientados a la vida al aire libre y al turista de bajos recursos. 
Por cada Alojamiento Extrahotelero se indica si es privado o no, así como la cantidad de metros cuadrados que ocupa. 
Existen dos tipos de alojamientos extrahoteleros: los Camping y las Residencias.
Para los Camping se indica la capacidad máxima de carpas, la cantidad de baños disponibles 
y si posee o no un restaurante dentro de las instalaciones. 
Para las residencias se indica la cantidad de habitaciones, si se hacen o no descuentos a los gremios
y si posee o no campo deportivo. Realizar un programa en el que se representen todas las relaciones descriptas.
Realizar un sistema de consulta que le permite al usuario consultar por diferentes criterios:
• todos los alojamientos.
• todos los hoteles de más caro a más barato.
• todos los campings con restaurante
• todos las residencias que tienen descuento. */

package andrea.guia10extra3;

import Service.ServiceAlojamiento;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class Guia10Extra3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Alojamiento> lista=new ArrayList<>();
        
        Hotel4estrellas A1 = new Hotel4estrellas(GymEnum.A, "Lisandros", 100, 15 , 40, 3, 2000d, "Los Arcos", "Lamadrid 70", "San Martín de los Andes", "Jorge Man");
        lista.add(A1);
        
        Hotel4estrellas A2 = new Hotel4estrellas(GymEnum.B, "Meson", 80, 10 , 30, 2, 1500d, "Estelares", "Larrea 170", "Lago Hermoso", "Maria Sales");
        lista.add(A2);
        
        Hotel5estrellas A3 = new Hotel5estrellas(2, 4, 3, GymEnum.A, "Bistro", 200, 15,50 , 4, 5000d, "Catalina's Park", "Soldati 590", "San Miguel de Tucumán", "José Trejo");
        lista.add(A3);
        
        Hotel5estrellas A4 = new Hotel5estrellas(1, 2, 1, GymEnum.B, "Il Postino", 150, 15,40 , 3, 3800d, "Carlos V", "25 de Mayo 320", "San Miguel de Tucumán", "Lourdes Zamora");
        lista.add(A4);
        
        
        Campings A5 = new Campings(10, 2, true, true, 120, "Soñada", "direccion 600", "El Mollar", "Antonio");
        lista.add(A5);
        
        Campings A6 = new Campings(15, 3, false, true, 200, "Descanso", "direccion 120", "El Mollar", "Marcos");
        lista.add(A6);
        
        Residencia A7 = new Residencia(10, true, true, true, 160,"Relax", "direccion 80", "Tafi del Valle", "Juan");
        lista.add(A7);
        
        Residencia A8 = new Residencia(8, false, false, false, 130,"HuasiMaman", "direccion 10", "Tafi del Valle", "Lorena");
        lista.add(A8);
        
        ServiceAlojamiento sA=new ServiceAlojamiento();
        sA.menu(lista);
        
    }
    
}
