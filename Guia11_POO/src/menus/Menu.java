
package menus;

import java.awt.Color;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemAbrir = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        separador1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();
        menuEdicion = new javax.swing.JMenu();
        menuColores = new javax.swing.JMenu();
        menuItemRojo = new javax.swing.JMenuItem();
        menuItemVerde = new javax.swing.JMenuItem();
        menuItemAzul = new javax.swing.JMenuItem();
        menuInsertar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuItemAbrir.setText("Abrir");
        menuArchivo.add(menuItemAbrir);

        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);

        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);

        menuEdicion.setText("Edicion");

        menuColores.setText("Colores");

        menuItemRojo.setText("Rojo");
        menuItemRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemRojoActionPerformed(evt);
            }
        });
        menuColores.add(menuItemRojo);

        menuItemVerde.setText("Verde");
        menuItemVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerdeActionPerformed(evt);
            }
        });
        menuColores.add(menuItemVerde);

        menuItemAzul.setText("Azul");
        menuItemAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAzulActionPerformed(evt);
            }
        });
        menuColores.add(menuItemAzul);

        menuEdicion.add(menuColores);

        barraMenus.add(menuEdicion);

        menuInsertar.setText("Insertar");
        barraMenus.add(menuInsertar);

        setJMenuBar(barraMenus);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuItemAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAzulActionPerformed
        this.getContentPane().setBackground(Color.BLUE);
    }//GEN-LAST:event_menuItemAzulActionPerformed

    private void menuItemRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemRojoActionPerformed
     this.getContentPane().setBackground(Color.RED);
    }//GEN-LAST:event_menuItemRojoActionPerformed

    private void menuItemVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerdeActionPerformed
        this.getContentPane().setBackground(Color.GREEN);
    }//GEN-LAST:event_menuItemVerdeActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuColores;
    private javax.swing.JMenu menuEdicion;
    private javax.swing.JMenu menuInsertar;
    private javax.swing.JMenuItem menuItemAbrir;
    private javax.swing.JMenuItem menuItemAzul;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemRojo;
    private javax.swing.JMenuItem menuItemVerde;
    private javax.swing.JMenuItem menuSalir;
    private javax.swing.JPopupMenu.Separator separador1;
    // End of variables declaration//GEN-END:variables
}
