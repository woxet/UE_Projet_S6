public class Vue extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
        // Variables declaration - do not modify                     
        public javax.swing.JButton jButton1;
        public javax.swing.JButton jButton2;
        public javax.swing.JButton jButton3;
        public javax.swing.JLabel pop;
        private javax.swing.JLabel jLabel2;
        public javax.swing.JLabel dead;
        public javax.swing.JLabel infected;
        private javax.swing.JLabel jLabel5;
        public javax.swing.JLabel alive;
        public Modele grille;
        // End of variables declaration   

    public Vue(int size, Modele grille) {
        super("Jeu des épidémies");
        this.grille = grille;
        initComponents(size);
    }
                       
    private void initComponents(int size) {
        jLabel5 = new javax.swing.JLabel();
        pop = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        dead = new javax.swing.JLabel();
        infected = new javax.swing.JLabel();
        alive = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        jLabel5.setText("Personnes saines :");
        jLabel5.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel5.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel5.setPreferredSize(new java.awt.Dimension(61, 40));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension((size*20)+23+300, (size*20)+45));
        setMinimumSize(new java.awt.Dimension((size*20)+23+300, (size*20)+45));
        setPreferredSize(new java.awt.Dimension((size*20)+23+300, (size*20)+47));
        setResizable(false);
        setSize(new java.awt.Dimension((size*20)+25+300, (size*20)+45));
		setBackground(new java.awt.Color(0,0,0));

        this.grille.setBackground(new java.awt.Color(0, 0, 0));
        this.grille.setMaximumSize(new java.awt.Dimension((size*20)+27, (size*20)+47));
        this.grille.setMinimumSize(new java.awt.Dimension((size*20)+27, (size*20)+47));

        javax.swing.GroupLayout grilleLayout = new javax.swing.GroupLayout(grille);
        this.grille.setLayout(grilleLayout);
        grilleLayout.setHorizontalGroup(
            grilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 607, Short.MAX_VALUE)
        );
        grilleLayout.setVerticalGroup(
            grilleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pop.setText("Population :");
        pop.setMaximumSize(new java.awt.Dimension(61, 40));
        pop.setMinimumSize(new java.awt.Dimension(61, 40));
        pop.setPreferredSize(new java.awt.Dimension(61, 40));

        jLabel2.setText("Vaccination :");
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(61, 40));

        dead.setText("Personnes mortes :");
        dead.setMaximumSize(new java.awt.Dimension(61, 40));
        dead.setMinimumSize(new java.awt.Dimension(61, 40));
        dead.setPreferredSize(new java.awt.Dimension(61, 40));

        infected.setText("Personnes infectées :");
        infected.setMaximumSize(new java.awt.Dimension(61, 40));
        infected.setMinimumSize(new java.awt.Dimension(61, 40));
        infected.setPreferredSize(new java.awt.Dimension(61, 40));

        alive.setText("Personnes saines :");
        alive.setMaximumSize(new java.awt.Dimension(61, 40));
        alive.setMinimumSize(new java.awt.Dimension(61, 40));
        alive.setPreferredSize(new java.awt.Dimension(61, 40));

        jButton1.setText("Start");

        jButton2.setText("Stop");

        jButton3.setText("Restart");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(this.grille, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(alive, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(pop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dead, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(this.grille, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(pop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dead, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(infected, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(194, Short.MAX_VALUE))
        );
		this.setVisible(true);
        pack();
    }                
}