public class Main extends Thread{
    public Vue f;
    public Controller c;
    public Modele grille;

    public Main(){
        int lg = 30;
        int lar = 30;
        this.grille = new Modele(lg, lar);
        this.f = new Vue(lg, lar, grille);
        
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
            this.grille.npChange = Double.parseDouble(f.jTextField1.getText());
            this.grille.pImmune = Double.parseDouble(f.jTextField2.getText());
            this.grille.pMort = Double.parseDouble(f.jTextField3.getText());
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
