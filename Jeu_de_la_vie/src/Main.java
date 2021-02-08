public class Main implements Runnable{
    public Fenetre f;
    public Controller c;
    public GrilleModele grille;

    public Main(){
        int size = 20;
        this.grille = new GrilleModele(size);
        this.f = new Fenetre(size, grille);
        this.c = new Controller(grille);
    }

    @Override
    public void run() {
        while (true) {
            this.f.repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Main jeu = new Main();
        jeu.run();
    }
}
