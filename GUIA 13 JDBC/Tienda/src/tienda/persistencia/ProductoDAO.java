/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tienda.persistencia;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import tienda.dominio.producto.Producto;

/**
 *
 * @author andreajalil
 */
public class ProductoDAO extends DAO{
    
    public void guardarProducto (Producto p) throws Exception{
        try {
            if (p==null) {
                throw new Exception("Producto inválido");
            }
            
            //sentencia sql de inserción INSERT INTO `tienda`.`producto` (`codigo`, `nombre`) VALUES ('10', 'HP');
        
            String sql= "INSERT INTO tienda.producto(codigo, nombre, precio, codigo_fabricante)"
                    +"VALUES('"+p.getCodigo()
                    +"' , '" + p.getNombre()
                    +"' , '"+p.getPrecio()
                    +"' , '"+p.getCodigo_Fabricante()+"' );";
            
            System.out.println(sql);
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
        
        
        
    }
    
    public void modificarProducto(Producto p) throws Exception{
        
        try {
            if (p==null) {
                throw new Exception("Indique el producto que quiere modificar");
            }
            // SENTENCIA SQL DE MODIFICACIÓN
            /*
            UPDATE producto SET codigo = '51', 
            nombre = 'algo', 
            precio = '25.50', 
            codigo_fabricante = '2' 
            WHERE (codigo = '78');
             */
            String sql = "UPDATE producto SET nombre = '" + p.getNombre() + "', "
                    + "precio = '" + p.getPrecio() + "', "
                    + "codigo_fabricante = '" + p.getCodigo_Fabricante() + "' "
                    + "WHERE codigo = '" + p.getCodigo() + "';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    public void eliminarProducto(Integer codig) throws Exception{
        try {
            //sentencia sql de eliminacion
            String sql= "DELETE FROM producto WHERE codigo = '" + codig+"';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
        
        
    }
    
    
    public Producto buscarProductoporCodigo (Integer codig) throws Exception{
        try {
            String sql = "SELECT * FROM producto "
                    + " WHERE codigo = '" + codig + "'";

            consultarBase(sql);

            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_Fabricante(resultado.getInt(4));
           
            }
            desconectarBase();
            return prod;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
      public List<Producto> buscarProductoporNombre (String nombr) throws Exception{
        try {
            String sql = "SELECT * FROM producto "
                    + " WHERE nombre = '" + nombr + "'";

            consultarBase(sql);

            List<Producto> productList=new ArrayList<>();
            Producto product = null;
            while (resultado.next()) {
                product = new Producto();
                product.setCodigo(resultado.getInt(1));
                product.setNombre(resultado.getString(2));
                product.setPrecio(resultado.getDouble(3));
                product.setCodigo_Fabricante(resultado.getInt(4));
                productList.add(product);
            }
            desconectarBase();
            return productList;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        } finally {
            desconectarBase();
        }
        
    }
    
      public Collection<Producto> listarProductosNombre() throws Exception {
        try {
            String sql = "SELECT nombre FROM Producto ";
            consultarBase(sql);
            Producto producto = null;
            Collection<Producto> productos = new ArrayList();
            while (resultado.next()) {
                producto = new Producto(resultado.getInt(1), resultado.getString(2), resultado.getDouble(3), resultado.getInt(4));
                productos.add(producto);
            }
            desconectarBase();
            return productos;
        } catch (Exception ex) {
            desconectarBase();
            throw ex;
        }
    }
      
      public List<Producto> listarProductos() throws Exception {
        try {
            String sql = "SELECT * FROM producto ";

            consultarBase(sql);

           
            List<Producto> products = new ArrayList();
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_Fabricante(resultado.getInt(4));
           
                products.add(prod);
            }
           
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
     public boolean verificarFabricante(Integer cod_fab) throws Exception {

        try
        {
            // SENTENCIA SQL DE CONSULTA
            String sql = "SELECT * FROM producto WHERE codigo = '" + cod_fab + "';";
            consultarBase(sql);
            return resultado.next();

        } catch (Exception e){
            throw e;
        } finally{
            desconectarBase();
        }

    }
      
    public Producto buscarBarato() throws Exception {

        try
        {
            /* SENTENCIA SQL DE CONSULTA
            
            select *
            from producto
            order by precio
            limit 1;
             */

            String sql = "SELECT * FROM producto ORDER BY precio LIMIT 1;";
            consultarBase(sql);
            Producto p = null;

            while (resultado.next())
            {
                p = new Producto();

                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_Fabricante(resultado.getInt(4));
            }
            return p;
        } catch (Exception e){
            throw e;
        } finally{
            desconectarBase();
        }

    }
 
   
    public List<Producto> listarProductosporNombre() throws Exception {
        try {
            String sql = "SELECT * FROM producto ORDER BY nombre Asc";

            consultarBase(sql);

           
            List<Producto> products = new ArrayList();
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setCodigo(resultado.getInt(1));
                prod.setNombre(resultado.getString(2));
                prod.setPrecio(resultado.getDouble(3));
                prod.setCodigo_Fabricante(resultado.getInt(4));
           
                products.add(prod);
            }
           
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
    public List<Producto> nombreyPrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY nombre Asc";

            consultarBase(sql);

           
            List<Producto> products = new ArrayList<>();
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
           
                products.add(prod);
            }
           
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
      public List<Producto> rangoPrecio() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto p WHERE p.precio BETWEEN 120 and 202;";

            consultarBase(sql);

           
            List<Producto> products = new ArrayList<>();
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
           
                products.add(prod);
            }
           
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
    
      
      public List<Producto> masBarato() throws Exception {
        try {
            String sql = "SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1";

            consultarBase(sql);

           
            List<Producto> products = new ArrayList<>();
            Producto prod = null;
            while (resultado.next()) {
                prod = new Producto();
                prod.setNombre(resultado.getString(1));
                prod.setPrecio(resultado.getDouble(2));
           
                products.add(prod);
            }
           
            return products;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
