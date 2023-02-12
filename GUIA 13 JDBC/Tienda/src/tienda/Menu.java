
package tienda;

import java.util.InputMismatchException;
import java.util.Scanner;
import tienda.dominio.fabricante.FabricanteService;
import tienda.dominio.producto.ProductoService;

/**
 *
 * @author andreajalil
 */
public class Menu {
    private final Scanner leer;
    private final FabricanteService fs;
    private final ProductoService ps;
//BUENAS PRACTICAS
    public Menu() {
        // ISO-8859-1 PERMITE USAR CARACTERES ESPECIALES
        leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        fs = new FabricanteService();
        ps = new ProductoService();
    }
    
    public void menuPrincipal() throws Exception {
        int opcion = 0;
        
        do {
            try {
                System.out.println("\n _ M E N U      P R I N C I P A L _ ");
                System.out.println("| 1.- Mostrar Fabricantes          |");
                System.out.println("| 2.- Administracion de Fabricantes|");
                System.out.println("| 3.- Mostrar Productos            |");
                System.out.println("| 4.- Administracion de Productos  |");
                System.out.println("| 5.- Salir                        |");
                System.out.println("|__ __ __ __ __ __ __ __ __ __ __ _|");
        
            opcion = leer.nextInt();
                                
                switch (opcion) {
                    case 1:
                        fs.mostrarFabricante();
                        break;
                    case 2:
                        menuFabricante();
                        break;
                    case 3:
                        ps.mostrarProductos();
                        break;
                    case 4:
                        menuProducto();
                        break;
                    case 5:
                        System.out.println("SALIENDO...  ...  ...");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
            } catch (Exception e) {
                throw e;
            }
        } while (opcion != 5);

    }

    public void menuFabricante() throws Exception {
        int op = 0;
        
        do {
            try {
        System.out.println("\n _ MENU      FABRICANTES _");
        System.out.println("| 1.- Nuevo Fabricante     |");
        System.out.println("| 2.- Modificar Fabricante |");
        System.out.println("| 3.- Borrar Fabricante    |");
        System.out.println("| 4.- Listar Fabricante    |");
        System.out.println("| 5.- Volver               |");
        System.out.println("|__ __ __ __ __ __ __ __ __|");
        op = leer.nextInt();
        switch (op) {
                    case 1:crearFabricante();
                        break;
                    case 2:modificarFabricante();
                        break;
                    case 3:eliminarFabricante();
                        break;
                    case 4:fs.mostrarFabricante();
                        break;
                    case 5:
                        System.out.println("- VOLVIENDO AL MENU PRINCIPAL -");
                }
            } catch (InputMismatchException e) {
                System.out.println("NO SE ADMITEN CARACTERES");
                leer.next();
            }
        } while (op != 5);
    }

    public void menuProducto() throws Exception {
        int op = 0;
        do {
            try {
        System.out.println("\n_     MENU    PRODUCTOS   _");
        System.out.println("| 1.- Nuevo Producto        |");
        System.out.println("| 2.- Modificar Producto    |");
        System.out.println("| 3.- Borrar un Producto    |");
        System.out.println("| 4.- Buscar p/Nombre       |");
        System.out.println("| 5.- Mostrar mas Barato    |");
        System.out.println("| 6.- Listar por nombre/$   |");
        System.out.println("| 7.- Precio entre $120/202 |");
        System.out.println("| 8.- Listar productos      |");
        System.out.println("| 9.- Volver                |");
        System.out.println("|__ __ __ __ __ __ __ __ __ |");
        op = leer.nextInt();
        switch (op) {
                    case 1:crearProducto();
                        break;
                    case 2:modificarProducto();
                        break;
                    case 3:eliminarProducto();
                        break;
                    case 4:buscaPorNombre();
                        break;
                    case 5:ps.masBarato();
                        break;    
                    case 6: ps.mostrarPorNombre();
                        break;    
                    case 7:ps.rangoPrecio();
                        break;    
                    case 8:ps.mostrarProductos();
                        break;
                    case 9:
                        System.out.println("- VOLVIENDO AL MENU PRINCIPAL -");
                }
            } catch (InputMismatchException e) {
                throw e;
            }
        } while (op != 9);
    }
    
    //----------------FABRICACNTE--------------------
    
    //CREAR FABRICANTE
    public void crearFabricante() throws Exception{
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            fs.crearFabricante(codigo, nombre);
        } catch (Exception e) {
           throw e;
        }
    }
    
    //MODIFICAR FABRICANTE
    public void modificarFabricante() throws Exception{
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            fs.modificarFabricante(codigo, nombre);
            } catch (Exception e) {
           throw e;
            }
    }
    
    //ELIMINAR FABRICANTE
    public void eliminarFabricante() throws Exception{
        try {
            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int codigo = leer.nextInt();

            fs.eliminarFabricante(codigo);
            } catch (Exception e) {
           throw e;
            }
    }
    // //LISTAR FABRICANTE -> EN EL FABRICANTESERVICE
    public void listarFabricante() throws Exception{
        fs.mostrarFabricante();
    }
    
    //----------------PRODUCTO--------------------
    
    //CREAR PRODUCTO
    public void crearProducto() throws Exception {
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();
                                    
            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int codigo_fab = leer.nextInt();

            ps.crearProducto(codigo, nombre, precio, codigo_fab);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //MODIFICAR PRODUCTO
    public void modificarProducto() throws Exception{
        try {
            System.out.println("INGRESE CODIGO: ");
            int codigo = leer.nextInt();

            System.out.println("INGRESE NOMBRE: ");
            String nombre = leer.next();

            System.out.println("INGRESE PRECIO: ");
            double precio = leer.nextDouble();

            System.out.println("INGRESE CODIGO DE FABRICANTE: ");
            int cod_fab = leer.nextInt();

            ps.ModificarProducto(codigo, nombre, precio, cod_fab);
        } catch (Exception e) {
            throw e;
        }
    }
    //ELIMINAR PRODUCTO
    public void eliminarProducto() throws Exception {
        try {
            System.out.println("INGRESE CODIGO DE PRODUCTO: ");
            int codigo = leer.nextInt();
            ps.eliminarProducto(codigo);
        } catch (Exception e) {
            throw e;
        }
    }
    
    //LISTAR PRODUCTOS -> EN EL PRODUCTOSERVICE
    public  void listarProductos() throws Exception{
        ps.mostrarProductos();
    }
    
    //BUSCAR POR NOMBRE
    public void buscaPorNombre() throws Exception{
        try {
            System.out.println("INGRESE EL NOMBRE DEL PRODUCTO A BUSCAR: ");
            String nombre = leer.next();
            ps.BuscarPorNombre(nombre);
        } catch (Exception e) {
            throw e;
        }
        
    }
    
}
