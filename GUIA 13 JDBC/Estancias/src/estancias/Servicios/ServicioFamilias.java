
package estancias.Servicios;

import estancias.Entidades.Familias;
import estancias.Persistencia.FamiliasDAO;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author andreajalil
 */
public class ServicioFamilias {
    //INSTANCIAR EL DAO CORRESPONDIENTE Y EL CONSTRUCTOR.
   private FamiliasDAO fDAO;
   private Scanner leer;
    //BUENAS PRACTICAS
  
   public ServicioFamilias(){
       this.fDAO=new FamiliasDAO();
        this.leer=new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
   }
    
    
    
  public void elegirCantidadHijos() throws Exception{
      
      System.out.println("INGRESE EL NUMERO DE HIJOS");
      Integer cantHijos = leer.nextInt();
      System.out.println("INGRESE LA EDAD MAXIMA");
      Integer edad=leer.nextInt();
      mostrarFamiliashijos3(cantHijos, edad);
  }

    public void mostrarFamiliashijos3(Integer cantHijos, Integer edad) throws Exception {
        List<Familias> familias = fDAO.mostrarFamiliashijos3(cantHijos, edad);
        try {
            if (familias.isEmpty()) {
                throw new Exception("NO EXISTEN FAMILIAS LISTADAS");
            }else{
                System.out.println("--------------- L I S T A        F A M I L I A S -------------------");
                System.out.printf("%-15s%-20s%-15s%-15s%-15s%-20s%-15s\n", "ID FAMILIA", "NOMBRE", "EDAD MINIMA","EDAD MAXIMA",
                        "NUMERO HIJOS", "EMAIL","ID CASA FAMILIA");
                familias.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    //c) Encuentra todas aquellas familias cuya dirección de mail sea de Hotmail. FAMILIAS
    
    
    public void elegirEmail() throws Exception{
        System.out.println("INGRESE EL SERVIDOR DE EMAIL QUE QUIERE BUSCAR");
        String email=leer.next();
        buscarFamiliasEmail(email);
    }
    
    public void buscarFamiliasEmail(String email) throws Exception{
        List<Familias> familias = fDAO.buscarFamiliasEmail(email);
        try {
            if (familias.isEmpty()) {
                throw new Exception("NO EXISTEN FAMILIAS LISTADAS");
            }else{
                System.out.println("--------------- L I S T A        F A M I L I A S -------------------");
                System.out.printf("%-15s%-20s%-15s%-15s%-15s%-20s%-15s\n", "ID FAMILIA", "NOMBRE", "EDAD MINIMA","EDAD MAXIMA",
                        "NUMERO HIJOS", "EMAIL","ID CASA FAMILIA");
                familias.forEach(aux -> {
                    System.out.println(aux);
                } );
                System.out.println("------------------------------------------------------------------------");
            }
        } catch (Exception e) {
            throw e;
        }
        
    }
}
