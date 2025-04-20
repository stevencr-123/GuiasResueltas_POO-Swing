
package guia12_poo;

import javax.swing.JOptionPane;

public class BarraHerramientas extends javax.swing.JFrame {

    public BarraHerramientas() {
        initComponents();
      this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraHerramientas = new javax.swing.JToolBar();
        btnUno = new javax.swing.JButton();
        btnDos = new javax.swing.JButton();
        btnTres = new javax.swing.JButton();
        btnCuatro = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        menuPrincipal = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        barraHerramientas.setRollover(true);

        btnUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/adjunto-archivo (1).png"))); // NOI18N
        btnUno.setFocusable(false);
        btnUno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUnoActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnUno);

        btnDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/enviar.png"))); // NOI18N
        btnDos.setFocusable(false);
        btnDos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDosActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnDos);

        btnTres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/archivo.png"))); // NOI18N
        btnTres.setFocusable(false);
        btnTres.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTres.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTresActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnTres);

        btnCuatro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/buscar.png"))); // NOI18N
        btnCuatro.setFocusable(false);
        btnCuatro.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuatro.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuatroActionPerformed(evt);
            }
        });
        barraHerramientas.add(btnCuatro);

        menuPrincipal.setText("Menu");
        jMenuBar.add(menuPrincipal);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(barraHerramientas, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(barraHerramientas, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 327, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUnoActionPerformed
        JOptionPane.showMessageDialog(null,"Activaste el botón uno");
    }//GEN-LAST:event_btnUnoActionPerformed

    private void btnDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDosActionPerformed
          JOptionPane.showMessageDialog(null,"Activaste el botón dos");
    }//GEN-LAST:event_btnDosActionPerformed

    private void btnTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTresActionPerformed
          JOptionPane.showMessageDialog(null,"Activaste el botón tres");
    }//GEN-LAST:event_btnTresActionPerformed

    private void btnCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuatroActionPerformed
          JOptionPane.showMessageDialog(null,"Activaste el botón cuatro");
    }//GEN-LAST:event_btnCuatroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToolBar barraHerramientas;
    private javax.swing.JButton btnCuatro;
    private javax.swing.JButton btnDos;
    private javax.swing.JButton btnTres;
    private javax.swing.JButton btnUno;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenu menuPrincipal;
    // End of variables declaration//GEN-END:variables
}
