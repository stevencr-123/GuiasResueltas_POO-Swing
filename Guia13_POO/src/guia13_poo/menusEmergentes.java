
package guia13_poo;

import java.awt.Color;
import javax.swing.JOptionPane;

public class menusEmergentes extends javax.swing.JFrame {

    public menusEmergentes() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuEmergente = new javax.swing.JPopupMenu();
        menuRojo = new javax.swing.JMenuItem();
        menuVerde = new javax.swing.JMenuItem();
        menuAzul = new javax.swing.JMenuItem();

        menuRojo.setText("Rojo");
        menuRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRojoActionPerformed(evt);
            }
        });
        menuEmergente.add(menuRojo);

        menuVerde.setText("Verde");
        menuVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVerdeActionPerformed(evt);
            }
        });
        menuEmergente.add(menuVerde);

        menuAzul.setText("Azul");
        menuAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAzulActionPerformed(evt);
            }
        });
        menuEmergente.add(menuAzul);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
  menuEmergente.show(this,evt.getX(),evt.getY());
    }//GEN-LAST:event_formMouseClicked

    private void menuRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRojoActionPerformed
     this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuRojoActionPerformed

    private void menuVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVerdeActionPerformed
      this.getContentPane().setBackground(Color.green);
    }//GEN-LAST:event_menuVerdeActionPerformed

    private void menuAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAzulActionPerformed
    this.getContentPane().setBackground(Color.blue);
    }//GEN-LAST:event_menuAzulActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem menuAzul;
    private javax.swing.JPopupMenu menuEmergente;
    private javax.swing.JMenuItem menuRojo;
    private javax.swing.JMenuItem menuVerde;
    // End of variables declaration//GEN-END:variables
}
