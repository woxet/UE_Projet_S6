import java.awt.event.*;

public class Controller implements ActionListener{
    Vue f;
    Main m;
    public Controller(Main m, Vue f){
        this.m = m;
        this.f = f;
        f.grille.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = (int)(e.getY()/20);
                int y = (int)(e.getX()/20);
                if(x >= 0 && x < f.grille.t.length && y >= 0 && y < f.grille.t.length) f.grille.t[x][y] = 1 ;
                f.grille.repaint();
            }
        });

        f.grille.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {
                int x = (int)(e.getY()/20);
                int y = (int)(e.getX()/20);
                if(x >= 0 && x < f.grille.t.length && y >= 0 && y < f.grille.t.length) f.grille.t[x][y] = 1 ;
                f.grille.repaint();
            }
            public void mouseMoved(MouseEvent e) {}
        });

        f.jButton1.addActionListener(this);
        f.jButton2.addActionListener(this);
        f.jButton3.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == this.f.jButton1){
            this.m.interrupt();
        }
        if (source == this.f.jButton2){
            this.m.start();
        }
    }

    
}
