import java.awt.event.*;


public class Controller implements ActionListener{

    boolean etat = false;
    Vue f;
    Main m;
    public Controller(Main m, Vue f){
        this.m = m;
        this.f = f;
        f.grille.addMouseListener(new MouseAdapter(){
            public void mousePressed(MouseEvent e){
                int x = (int)(e.getY()/(559/f.grille.lar));
                int y = (int)(e.getX()/(785/f.grille.lg));
                if(x >= 0 && x < f.grille.lg && y >= 0 && y < f.grille.lar && (f.grille.t[x][y] == 0 || f.grille.t[x][y] == 2)) f.grille.t[x][y] = 1 ;
                f.grille.repaint();
            }
        });

        f.grille.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e) {
                int x = (int)(e.getY()/(559/f.grille.lar));
                int y = (int)(e.getX()/(785/f.grille.lg));
                if(x >= 0 && x < f.grille.lg && y >= 0 && y < f.grille.lar && (f.grille.t[x][y] == 0 || f.grille.t[x][y] == 2)) f.grille.t[x][y] = 1 ;
                f.grille.repaint();
            }
            public void mouseMoved(MouseEvent e) {}
        });

        f.jButton1.addActionListener(this);
        f.jButton2.addActionListener(this);
        f.jButton3.addActionListener(this);
        f.jButton4.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evt) {
        Object source = evt.getSource();
        if (source == this.f.jButton1){
            if(!etat) etat = true;
        }
        if (source == this.f.jButton2){
            if(etat) etat = false;
        }

        if (source == this.f.jButton3){
            if(etat) etat = false;
            for(int a= 0; a< f.grille.lg; a++){
                for(int b= 0; b< f.grille.lar; b++){
                    f.grille.t[a][b] = 0;
                }
            }
        }

        if (source == this.f.jButton4){
            m.grille = new Modele(Integer.parseInt(f.jTextField6.getText()), Integer.parseInt(f.jTextField5.getText()));
            f.getContentPane().removeAll();
            f.grille = m.grille;
            f.initComponents(f.grille.lg, f.grille.lar);
            m.c = new Controller(m, f);
            f.getContentPane().repaint();

            /*System.out.println(Integer.parseInt(f.jTextField5.getText()));
            f.changeGrille(m.grille);
            f.jButton1.removeActionListener(MouseAdapteur);

            f.repaint();*/
        }
    }

    
}
