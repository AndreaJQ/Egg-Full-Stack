
package andrea.pruebas.graficos;

import java.awt.GraphicsEnvironment;
import javax.swing.*;

public class pruebass {

    
    public static void main(String[] args) {
        String fuente =JOptionPane.showInputDialog("introduce la fuente");
        boolean estalafuente=false;     
        
        String[] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        
        for (String nombresDeFuente : nombresDeFuentes) {
            if (nombresDeFuente.equals(fuente)) {
                estalafuente=true;
            }
        }
        
        if (estalafuente) {
            System.out.println("Fuente instalada");
        }else{
            System.out.println("No está instalada la fuente");
        }
    }
    
}
