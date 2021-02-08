import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Controller {
    public Controller(GrilleModele grille){
        grille.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                grille.t[(int)(e.getY()/(400/20))][(int)(e.getX()/(400/20))] = 1 ;
                grille.repaint();
            }
        });

        grille.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {}
            public void mouseMoved(MouseEvent e) {}
        });
    }
}
