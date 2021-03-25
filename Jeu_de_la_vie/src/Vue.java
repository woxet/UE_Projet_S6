public class Vue extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
        // Variables declaration - do not modify                     
        public javax.swing.JButton jButton1;
        public javax.swing.JButton jButton2;
        public javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        public Modele grille;
        // End of variables declaration   

    public Vue(int size, Modele grille) {
        this.grille = grille;
        initComponents(size);
    }
                       
    private void initComponents(int size) {
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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

        jLabel1.setText("Population :");
        jLabel1.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel1.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel1.setPreferredSize(new java.awt.Dimension(61, 40));

        jLabel2.setText("Vaccination :");
        jLabel2.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel2.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel2.setPreferredSize(new java.awt.Dimension(61, 40));

        jLabel3.setText("Personnes mortes :");
        jLabel3.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel3.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel3.setPreferredSize(new java.awt.Dimension(61, 40));

        jLabel4.setText("Personnes infectées :");
        jLabel4.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel4.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel4.setPreferredSize(new java.awt.Dimension(61, 40));

        jLabel6.setText("Personnes saines :");
        jLabel6.setMaximumSize(new java.awt.Dimension(61, 40));
        jLabel6.setMinimumSize(new java.awt.Dimension(61, 40));
        jLabel6.setPreferredSize(new java.awt.Dimension(61, 40));

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
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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