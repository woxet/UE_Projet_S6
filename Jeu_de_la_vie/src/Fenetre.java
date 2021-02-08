import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class Fenetre extends JFrame {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private int size = 20;
	private JPanel container = new JPanel();
    public GrilleModele grille = new GrilleModele(size);

    public Fenetre() {
		this.setTitle("Jeu de La Vie");
		this.setSize((size*21)+5, (size*22)+5);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setBackground(Color.black);
		container.setLayout(new BorderLayout());
		container.add(grille, BorderLayout.CENTER);

        this.setContentPane(container);
		this.setVisible(true);
	}

	public void paintComponent(Graphics g){
		this.grille.repaint();
	}
}
