package guia16_poo;

public class Parking extends javax.swing.JFrame {

    int coches;

    public Parking() {
        initComponents();
        this.setLocationRelativeTo(null);
        coches = 0;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEntro = new javax.swing.JButton();
        btnSalio = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        etiCoches = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnEntro.setText("Entró");
        btnEntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntroActionPerformed(evt);
            }
        });

        btnSalio.setText("Salio");
        btnSalio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalioActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        jLabel1.setText("Coches en el parking");

        etiCoches.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        etiCoches.setText("             0");
        etiCoches.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(etiCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnEntro, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                .addComponent(btnSalio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(166, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnEntro)
                .addGap(59, 59, 59)
                .addComponent(btnSalio)
                .addGap(59, 59, 59)
                .addComponent(btnReiniciar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntroActionPerformed
        coches = coches + 1;
        etiCoches.setText("" + coches);

    }//GEN-LAST:event_btnEntroActionPerformed

    private void btnSalioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalioActionPerformed
        if (coches > 0) {
            coches = coches - 1;
            etiCoches.setText("" + coches);
        }

    }//GEN-LAST:event_btnSalioActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        coches = 0;
        etiCoches.setText("0");

    }//GEN-LAST:event_btnReiniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEntro;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnSalio;
    private javax.swing.JLabel etiCoches;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
