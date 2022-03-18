
package projetoguidesenho;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import javax.swing.JPanel;
public class PainelDesenho extends JPanel implements MouseMotionListener{

    private ArrayList<Point> pontos = new ArrayList<>(); 
    
    @Override
    public void mouseDragged(MouseEvent e) {
        pontos.add( e.getPoint() );
        repaint();
    }
    //construtor
    @Override
    public void mouseMoved(MouseEvent arg0) {
       
    }
        public PainelDesenho(){
            addMouseMotionListener(this);
        }
        
   @Override
   public void paintComponent(Graphics g){
       super.paint(g);
       for(Point p : pontos){
           g.fillOval(p.x,p.y,4,4);
       }
   }
}
