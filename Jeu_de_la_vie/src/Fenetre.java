import java.awt.*;
import javax.swing.*;

public class Fenetre extends JFrame {
    private JPanel container = new JPanel();

    public Fenetre() {
		this.setTitle("Jeu de La Vie");
		this.setSize(410, 430);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		// this.setResizable(false);
		container.setBackground(Color.white);
		container.setLayout(new BorderLayout());
        this.setContentPane(container);
		this.setVisible(true);
	}
    public static void main(String[] args) {
        Fenetre a = new Fenetre();
    }
}
