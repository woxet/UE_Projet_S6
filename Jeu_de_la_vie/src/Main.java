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
        int[] compt;
        while (true) {
            this.f.repaint();
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(c.etat) this.grille.vie();
            compt = grille.compteurs();
                this.f.alive.setText("Personnes saines : "+compt[0]);
                this.f.infected.setText("Personnes infectées : "+compt[1]);
                this.f.dead.setText("Personnes mortes : "+compt[3]);
                this.f.pop.setText("Population : "+(compt[0]+compt[1]+compt[2]));
        }
    }

    public static void main(String[] args) {
        Main jeu = new Main();
        jeu.start();
    }
}
