
package guia07_poo;

public class ToggleButtons extends javax.swing.JFrame {

    public ToggleButtons() {
        initComponents();
        this.setLocationRelativeTo(null);
        tbtnInstalacion.setSelected(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPrecioBase = new javax.swing.JTextField();
        tbtnInstalacion = new javax.swing.JToggleButton();
        tbtnFormacion = new javax.swing.JToggleButton();
        tbtnAlimentacionBD = new javax.swing.JToggleButton();
        btnCalcular = new javax.swing.JButton();
        etiTotal = new javax.swing.JLabel();
        etiPrecioInstalacion = new javax.swing.JLabel();
        etiPrecioFormacion = new javax.swing.JLabel();
        etiPrecioAlimentacionBD = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Precio Base");

        tbtnInstalacion.setText("Instalación");
        tbtnInstalacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnInstalacionActionPerformed(evt);
            }
        });

        tbtnFormacion.setText("Formación");

        tbtnAlimentacionBD.setText("AlimentaciónBD");
        tbtnAlimentacionBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbtnAlimentacionBDActionPerformed(evt);
            }
        });

        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        etiTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiPrecioInstalacion.setText("40");

        etiPrecioFormacion.setText("200");

        etiPrecioAlimentacionBD.setText("200");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tbtnInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbtnFormacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(tbtnAlimentacionBD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiPrecioInstalacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPrecioFormacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(etiPrecioAlimentacionBD, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(btnCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPrecioBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnInstalacion)
                    .addComponent(etiPrecioInstalacion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnFormacion)
                    .addComponent(etiPrecioFormacion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbtnAlimentacionBD)
                    .addComponent(etiPrecioAlimentacionBD))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(etiTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbtnInstalacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnInstalacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnInstalacionActionPerformed

    private void tbtnAlimentacionBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbtnAlimentacionBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbtnAlimentacionBDActionPerformed

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        double precio_base;
        double precio_instal; //precio instalación
        double precio_for; //precio formacion
        double precio_ali; //precio alimentacion

//Recojo datos desde la ventana:
        precio_base = Double.parseDouble(txtPrecioBase.getText());
        precio_instal = Double.parseDouble(etiPrecioInstalacion.getText());
        precio_for = Double.parseDouble(etiPrecioFormacion.getText());
        precio_ali = Double.parseDouble(etiPrecioAlimentacionBD.getText());

//Ahora que tengo los datos, puedo hacer cálculos.
//Al precio base se le van añadiendo precio de extras
//según estén o no activados los JToggleButtons
        double precio_total;

        precio_total = precio_base;

        if (tbtnInstalacion.isSelected()) { //Si se seleccionó instalación
            precio_total = precio_total + precio_instal;
        }

        if (tbtnFormacion.isSelected()) { //Si se seleccionó formación
            precio_total = precio_total + precio_for;
        }

        if (tbtnAlimentacionBD.isSelected()) { //Si se seleccionó Alimentación BD
            precio_total = precio_total + precio_ali;
        }

//Finalmente pongo el resultado en la etiqueta
        etiTotal.setText(precio_total + " €");

    }//GEN-LAST:event_btnCalcularActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JLabel etiPrecioAlimentacionBD;
    private javax.swing.JLabel etiPrecioFormacion;
    private javax.swing.JLabel etiPrecioInstalacion;
    private javax.swing.JLabel etiTotal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JToggleButton tbtnAlimentacionBD;
    private javax.swing.JToggleButton tbtnFormacion;
    private javax.swing.JToggleButton tbtnInstalacion;
    private javax.swing.JTextField txtPrecioBase;
    // End of variables declaration//GEN-END:variables
}
