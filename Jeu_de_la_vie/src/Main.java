public class Main implements Runnable{
    private Fenetre f;

    public Main(){
        f = new Fenetre();
        //Controller c = new Controller(f);
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
