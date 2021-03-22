public class Main extends Thread{
    public Vue f;
    public Controller c;
    public Modele grille;

    public Main(){
        int size = 30;
        this.grille = new Modele(size);
        this.f = new Vue(size, grille);
        
        this.c = new Controller(this, f);
    }

	public void run() {
        while (true) {
            this.f.repaint();
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        this.grille.vie();
        }
    }

    public static void main(String[] args) {
        Main jeu = new Main();
        jeu.start();
    }
}
