
package guia10_poo;

public class ScrollBars extends javax.swing.JFrame {

    public ScrollBars() {
        initComponents();
        this.setLocationRelativeTo(null);
        desValor.setValue(70);
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desValor = new javax.swing.JScrollBar();
        etiValor = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        desValor.setBlockIncrement(20);
        desValor.setMaximum(150);
        desValor.setMinimum(50);
        desValor.setOrientation(javax.swing.JScrollBar.HORIZONTAL);
        desValor.setUnitIncrement(2);
        desValor.setVisibleAmount(5);
        desValor.addAdjustmentListener(new java.awt.event.AdjustmentListener() {
            public void adjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {
                desValorAdjustmentValueChanged(evt);
            }
        });

        etiValor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(desValor, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(etiValor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(desValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addComponent(etiValor, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desValorAdjustmentValueChanged(java.awt.event.AdjustmentEvent evt) {//GEN-FIRST:event_desValorAdjustmentValueChanged
       etiValor.setText("El valor es: "+desValor.getValue());
    }//GEN-LAST:event_desValorAdjustmentValueChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollBar desValor;
    private javax.swing.JLabel etiValor;
    // End of variables declaration//GEN-END:variables
}
