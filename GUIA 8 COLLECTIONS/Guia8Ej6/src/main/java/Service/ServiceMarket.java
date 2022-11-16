
package Service;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


/**
 *Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar Hashmap).
El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas
 * @author andreajalil
 */
public class ServiceMarket {
    private HashMap<String, Double>listaProd;
    private Scanner sc;
    Producto p =new Producto();
    String name;
    Double price;
    
    public ServiceMarket(){
        this.listaProd=new HashMap();
        this.sc =new Scanner(System.in).useDelimiter("\n");
        
    }
    
    public void menu(){
        int op;
        System.out.println("Bienvenido al sistema de Supermercados Vea.");
        do {
            System.out.println("------------:::MENU:::------------");
            System.out.println("Qué desea realizar:\n"
                    + "1- Ingresar producto.\n"
                    + "2- Modificar un precio.\n"
                    + "3- Eliminar un producto.\n"
                    + "4- Mostrar lista de productos.\n"
                    + "5- Salir");
            op=sc.nextInt();
            switch (op) {
                case 1 -> ingresoProducto();
                case 2 -> modifPrecio();
                case 3 -> eliminarProd();
                case 4 -> mostrarLista();
                case 5 -> System.out.println("Saliendo...  ... ...\n"
                            + "Gracias por usar nuestro sistema.");
                default -> System.out.println("error... no indicó una opción correcta!");
            }
        } while (op!=5);
    }
    
    public void ingresoProducto(){
        String rta;
        System.out.println("------------:::INGRESO DE PRODUCTOS:::------------");
        do {
            System.out.println("Ingrese el nombre del producto.");
            p.setNombreProd(sc.next().toUpperCase());//seteo nombre
            System.out.println("Ingrese el precio del producto.");
            p.setPrecio(sc.nextDouble());
            agregarProducto(p.getNombreProd(), p.getPrecio());//medoto para agregar los productos
            System.out.println("-----------------------");
            System.out.println("¿Desea seguir agregando productos?");
            rta=sc.next();
        } while (rta.equalsIgnoreCase("s"));
        System.out.println("................");
    }
    
    public void agregarProducto(String name, Double price){
        listaProd.put(p.getNombreProd(), p.getPrecio());
        
    }
    public void modifPrecio(){
        System.out.println("------------:::LISTA DE PRODUCTOS:::------------");
        System.out.println("Ingrese el producto que desea modificar precio.");
        String name=sc.next().toUpperCase();
        if (listaProd.containsKey(name)) {
            System.out.println("Ingrese el precio.");
            price=sc.nextDouble();
            listaProd.replace(name, price);
        }
        System.out.println("................");
    }
    
    public void eliminarProd(){
        System.out.println("------------:::ELIMINAR PRODUCTO:::------------");
        System.out.println("Ingrese el producto que desea eliminar.");
        String borrarP=sc.next().toUpperCase();
        listaProd.remove(borrarP);
        System.out.println("................");
    }
    public void mostrarLista(){
        System.out.println("------------:::LISTA DE PRODUCTOS:::------------");
        for (Map.Entry<String, Double> entry : listaProd.entrySet()) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key +" $ "+ value);
        }
        System.out.println("................");
        ordenPrecio();
        ordenNombre();
    }
    
    
    public void ordenPrecio(){
        System.out.println("------------:::LISTA DE PRODUCTOS POR PRECIO:::------------");
        listaProd.entrySet().stream().sorted(Map.Entry.comparingByValue())/// ORDENAR POR VALOR
        .forEach(entry->System.out.println(""+entry.getKey()+" $ " + entry.getValue()));
        System.out.println("................");
    }
    public void ordenNombre(){
        System.out.println("------------:::LISTA DE PRODUCTOS POR NOMBRE:::------------");
        listaProd.entrySet().stream().sorted(Map.Entry.comparingByKey())//ORDENAR POR NOMBRE
                .forEach(entry->System.out.println(""+entry.getKey()+" $ " + entry.getValue()));
        System.out.println("................");
    }
} 

