
package tienda.dominio.producto;

import java.util.List;
import tienda.persistencia.ProductoDAO;


/** * *En este paquete se almacenarán aquellas clases que llevarán adelante lógica del negocio. 
 * En general se crea un servicio para administrar cada una de las entidades y
 * algunos servicios para manejar operaciones muy específicas como las estadísticas.
Realizar un menú en Java a través del cual se permita elegir qué consulta se desea realizar.
Las consultas a realizar sobre la BD son las siguientes:
a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.
 * @author andreajalil
 */
public class ProductoService {
   //INSTANCIAR EL DAO CORRESPONDIENTE Y EL CONSTRUCTOR.
   private ProductoDAO pDAO;
   
   public ProductoService(){
       this.pDAO=new ProductoDAO();
   }
    
   
   //f) Ingresar un producto a la base de datos.
   //CREAR NUEVO PRODUCTO
   public void crearProducto(Integer codigo, String nombre, Double precio, Integer codigo_fab) throws Exception{//tiene que ser INTEGER
       try {
           if (codigo == null || codigo<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO");
           }
           if (nombre == null || nombre.trim().isEmpty()) {
               throw new Exception("DEBE INGRESAR UN NOMBRE");
           }
           if (precio == null || precio<0) {
               throw new Exception("DEBE INGRESAR EL PRECIO");
           }
           if (codigo_fab == null || codigo_fab<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO DE FABRICANTE");
           }
           
            if (!pDAO.verificarFabricante(codigo_fab)) {
             throw new Exception("NO EXISTE EL FABRICANTE");
           }
           
           Producto p = new Producto();
           p.setCodigo(codigo);
           p.setNombre(nombre);
           p.setPrecio(precio);
           p.setCodigo_Fabricante(codigo_fab);
       
           pDAO.guardarProducto(p);
       } catch (Exception e) {
            throw e;
       }
      
   }
   
   
  // h) Editar un producto con datos a elección. -> POR CÓDIGO
   //MODIFICAR
   public void ModificarProducto(Integer codigo, String nombre, Double precio, Integer codigo_fab) throws Exception{//tiene que ser INTEGER
       try {
           if (codigo == null || codigo<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO");
           }
           if (nombre == null || nombre.trim().isEmpty()) {
               throw new Exception("DEBE INGRESAR UN NOMBRE");
           }
           if (precio == null || precio<0) {
               throw new Exception("DEBE INGRESAR EL PRECIO");
           }
           if (codigo_fab == null || codigo_fab<0) {
               throw new Exception("DEBE INGRESAR UN CODIGO DE FABRICANTE");
           }
           
            if (!pDAO.verificarFabricante(codigo_fab)) {
             throw new Exception("NO EXISTE EL FABRICANTE");
           }
           
           Producto p = pDAO.buscarProductoporCodigo(codigo);
           
           if (p==null) {
              throw new Exception("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
           }
           
          
           p.setNombre(nombre);
           p.setPrecio(precio);
           p.setCodigo_Fabricante(codigo_fab);
       
           pDAO.modificarProducto(p);
       } catch (Exception e) {
            throw e;
       }
 
   }
   
   
   //ELIMINA
    public void eliminarProducto(Integer cod) throws Exception {
        try{
            if (cod == null || cod < 0){
                throw new Exception("DEBE INGRESAR UN CODIGO");
            }

            Producto p = pDAO.buscarProductoporCodigo(cod);

            if (p == null){
                throw new Exception("EL CODIGO INGRESADO NO ESTÁ ASOCIADO A NINGÚN PRODUCTO");
            }

            pDAO.eliminarProducto(cod);
            
        }catch (Exception e){
            throw e;
                    }
    }
    
    //BUSCAR PRODUCTOS POR NOMBRE
    public void BuscarPorNombre(String nombre) throws Exception{
        try {
          List<Producto> products=pDAO.buscarProductoporNombre(nombre);
            if (products.isEmpty()) {
                throw new Exception("PRODUCTO INEXISTENTE");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-8s%-35s%-10s%-5s\n", "CODIGO", "NOMBRE", "PRECIO $", "CODIGO FABRICANTE");
                products.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
                
            }
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
    
    //MOSTRAR PRODUCTOS
    
    public void mostrarProductos() throws Exception{
        try {
            List<Producto> productos=pDAO.listarProductos();
            
            if (productos.isEmpty()) {
                throw new Exception("NO EXISTEN PRODUCTOS LISTADOS");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-8s%-35s%-10s%-5s\n", "CODIGO", "NOMBRE", "PRECIO $", "CODIGO FABRICANTE");
                productos.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
            
           
            
        } catch (Exception e) {
            throw e;
        }
        
        
    }
            
   //a) Lista el nombre de todos los productos que hay en la tabla producto.
    public void mostrarPorNombre() throws Exception{
        try {
            List<Producto> productosporNombre= pDAO.listarProductosporNombre();
            if (productosporNombre.isEmpty()) {
                throw new Exception("NO EXISTEN PRODUCTOS LISTADOS");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-8s%-35s%-10s%-5s\n", "CODIGO", "NOMBRE", "PRECIO $", "CODIGO FABRICANTE");
                productosporNombre.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
         
    
   // b) Lista los nombres y los precios de todos los productos de la tabla producto.
   public void nombreyPrecio() throws Exception{
        try {
            List<Producto> productosporNombreyPrecio= pDAO.nombreyPrecio();
            if (productosporNombreyPrecio.isEmpty()) {
                throw new Exception("NO EXISTEN PRODUCTOS LISTADOS");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-35s%-10s\n",  "NOMBRE", "PRECIO $");
                productosporNombreyPrecio.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
   
   //c) Listar aquellos productos que su precio esté entre 120 y 202.
   public void rangoPrecio() throws Exception{
        try {
            List<Producto> productosporRangoPrecio= pDAO.rangoPrecio();
            if (productosporRangoPrecio.isEmpty()) {
                throw new Exception("NO EXISTEN PRODUCTOS LISTADOS");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-35s%-10s\n",  "NOMBRE", "PRECIO $");
                productosporRangoPrecio.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
   
   //e) Listar el nombre y el precio del producto más barato.
   
   public void masBarato() throws Exception{
        try {
            List<Producto> productosmasBarato= pDAO.masBarato();
            if (productosmasBarato.isEmpty()) {
                throw new Exception("NO EXISTEN PRODUCTOS LISTADOS");
            }else{
                System.out.println("--------------- L I S T A        P R O D U C T O S -------------------");
                System.out.printf("%-35s%-10s\n",  "NOMBRE", "PRECIO $");
                productosmasBarato.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
}
