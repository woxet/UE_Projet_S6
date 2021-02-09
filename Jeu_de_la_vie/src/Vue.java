import java.awt.*;
import java.awt.Color;
import javax.swing.*;

public class Vue extends JFrame {
    /**
	 *
	 */
	private static final long serialVersionUID = 1L;

	private JPanel container = new JPanel();
	public Modele grille; 

    public Vue(int size, Modele grille) {
		this.grille = grille;
		this.setTitle("Jeu de La Vie");
		this.setSize((size*21)+5, (size*21)+5);
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
