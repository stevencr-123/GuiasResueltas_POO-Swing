
package guia32_poo;

public class HerenciaDialogos extends javax.swing.JFrame {
dialogoFecha nacimiento;
    public HerenciaDialogos() {
        initComponents();
        this.setLocationRelativeTo(null);
        nacimiento = new dialogoFecha(null, true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnFechaNacimiento = new javax.swing.JButton();
        etiFechaNacimiento = new javax.swing.JLabel();
        etiFechaNacimientoLargo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnFechaNacimiento.setText("Introducir Fecha de nacimiento");
        btnFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFechaNacimientoActionPerformed(evt);
            }
        });

        etiFechaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiFechaNacimientoLargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiFechaNacimiento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(etiFechaNacimientoLargo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(btnFechaNacimiento)
                .addGap(18, 18, 18)
                .addComponent(etiFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(etiFechaNacimientoLargo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFechaNacimientoActionPerformed
      nacimiento.setVisible(true);
      
        if (nacimiento.getBotonPulsado() == 0) {
            etiFechaNacimiento.setText(nacimiento.getFecha());
            etiFechaNacimientoLargo.setText(nacimiento.getFechaCompleta());
        } else {
         etiFechaNacimiento.setText("");
         etiFechaNacimientoLargo.setVisible(false);
        }
    }//GEN-LAST:event_btnFechaNacimientoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFechaNacimiento;
    private javax.swing.JLabel etiFechaNacimiento;
    private javax.swing.JLabel etiFechaNacimientoLargo;
    // End of variables declaration//GEN-END:variables
}
