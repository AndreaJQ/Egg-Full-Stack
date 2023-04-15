
package andrea.pruebas.graficos;


import java.awt.Graphics;

import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

public class probandoImagenes {

    public static void main(String[] args) {
       MarcoConImagen marcoConImagen=new MarcoConImagen();
       marcoConImagen.setVisible(true);
       marcoConImagen.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
class MarcoConImagen extends JFrame{
public MarcoConImagen(){
        setTitle("Prueba de Imagen insertada");
        setSize(400, 400);
        LaminaconImagen lamina = new LaminaconImagen();
        add(lamina);
      
    }
}

class LaminaconImagen extends JPanel{
    private Image imagen;
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        File miimagen=new File("/Users/andreajalil/EGG/NewFolder/PRUEBAS/src/main/java/andrea/pruebas/graficos/thumbup.jpeg");
        
        try {
            imagen=ImageIO.read(miimagen);
        } catch (IOException ex) {
            Logger.getLogger(Lamina.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        g.drawImage(imagen, 5, 5, null);
                
    }
    
    
}

