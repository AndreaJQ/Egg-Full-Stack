
package tienda.persistencia;

import java.util.ArrayList;
import java.util.List;
import tienda.dominio.fabricante.Fabricante;

public final class FabricanteDAO extends DAO{
    
    //AGREGAR FABRICANTE
    public void guardarFabricante (Fabricante f) throws Exception{
        try {
            if (f==null) {
                throw new Exception("Fablicante inválido");}
            
            //sentencia sql de inserción 
            //INSERT INTO `tienda`.`fabricante` (`codigo`, `nombre`) 
            //VALUES ('10', 'HP');
        
            String sql= "INSERT INTO fabricante (codigo, nombre)"
                    +"VALUES('"+f.getCodigo()
                    +"' , '" + f.getNombre()+"' );";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();
        }
    }
    
    //MODIFICAR FABRICANTE
    public void modificarFabricante(Fabricante f) throws Exception{
        try {
            if (f==null) {
                throw new Exception("Indique el fabricante que quiere modificar");}
            // sentencia sql de modificacion -- 
            //UPDATE fabricante 
            //SET nombre = 'Generico' 
            //WHERE (codigo = '11');
            
            String sql = "UPDATE fabricante SET "
                    + "nombre = '" + f.getNombre() + "' WHERE codigo = '" + f.getCodigo() + "';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }finally {
            desconectarBase();}
    }
    
    //ELIMINAR FABRICANTE
    public void eliminarFabricante(int codig) throws Exception{
        try {
            //sentencia sql de eliminacion
            String sql= "DELETE FROM fabricante WHERE codigo = '" + codig+"';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }   
    }
    
    //BUSCAR FABRICANTE POR CODIGO
    public Fabricante buscarFabricanteporCodigo (Integer codig) throws Exception{
        try {
            String sql = "SELECT * FROM fabricante "
                    + " WHERE codigo = '" + codig + "'";

            consultarBase(sql);

            Fabricante fab = null;
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fab;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
    //BUSCAR FABRICANTE POR NOMBRE
      public Fabricante buscarFabricanteporNombre (String fabr) throws Exception{
        try {
            String sql = "SELECT * FROM fabricante "
                    + " WHERE nombre = '" + fabr + "'";

            consultarBase(sql);

            Fabricante fab = null;
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
            }
            desconectarBase();
            return fab;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    //MOSTRAR FABRICANTE
      public List<Fabricante> listarFabricantes() throws Exception {
        try {
            String sql = "SELECT codigo, nombre FROM fabricante ";

            consultarBase(sql);

            Fabricante fab = null;
            List<Fabricante> fabs = new ArrayList();
            while (resultado.next()) {
                fab = new Fabricante();
                fab.setCodigo(resultado.getInt(1));
                fab.setNombre(resultado.getString(2));
                fabs.add(fab);
            }
            desconectarBase();
            return fabs;
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de sistema");
        }
    }
}
