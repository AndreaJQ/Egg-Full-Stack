
package andrea.pruebas.graficos;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import javax.swing.*;

public class PruebaDibujos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MarcoConDibujos marcoConDibujos=new MarcoConDibujos();
       marcoConDibujos.setVisible(true);
       marcoConDibujos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    }
    
}

class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        setTitle("Prueba de Dibujo");
        setSize(400, 400);
        Lamina lamina = new Lamina();
        add(lamina);
        setBackground(Color.yellow);
    }
}

class Lamina extends JPanel{
    public void paintComponent(Graphics g) {
        /*super.paintComponent(g);
        g.drawRect(100, 100, 100, 100);
        g.drawLine(50, 50, 200, 300);
        g.drawArc(300, 300, 100, 200, 60, 150);
        g.draw3DRect(400, 400, 70, 70, true);*/
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rect = new Rectangle2D.Double(100, 100, 200, 150);
        g2.setPaint(Color.CYAN);
        g2.draw(rect);
        g2.setPaint(Color.black);
        g2.fill(rect);
        
        Ellipse2D elipse = new Ellipse2D.Double();
        elipse.setFrame(rect);
        g2.draw(elipse);
        
        g2.draw(new Line2D.Double(100, 100, 300, 250));
        
        double cX=rect.getCenterX();
        double cY=rect.getCenterY();
        double r=150;
        
        Ellipse2D circ=new Ellipse2D.Double();
        circ.setFrameFromCenter(cX, cY, cX+r, cY+r);
        g2.draw(circ);
                
                
    }
}