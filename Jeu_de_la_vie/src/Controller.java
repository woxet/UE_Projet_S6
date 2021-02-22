import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class Controller {
    public Controller(Modele grille){
        grille.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = (int)(e.getY()/(400/20));
                int y = (int)(e.getX()/(400/20));
                if(x > 0 && x < grille.t.length && y > 0 && y < grille.t.length) grille.t[x][y] = 1 ;
                grille.repaint();
            }
        });

        grille.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {
                int x = (int)(e.getY()/(400/20));
                int y = (int)(e.getX()/(400/20));
                if(x > 0 && x < grille.t.length && y > 0 && y < grille.t.length) grille.t[x][y] = 1 ;
                grille.repaint();
            }
            public void mouseMoved(MouseEvent e) {}
        });
    }
}
