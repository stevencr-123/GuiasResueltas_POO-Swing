
package guia14_poo;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class fileChooser extends javax.swing.JFrame {

    public fileChooser() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        elegirFichero = new javax.swing.JFileChooser();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuAbrir = new javax.swing.JMenuItem();
        Separador1 = new javax.swing.JPopupMenu.Separator();
        menuSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuArchivo.setText("Archivo");

        menuAbrir.setText("Abrir");
        menuAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuAbrir);
        menuArchivo.add(Separador1);

        menuSalir.setText("Salir");
        menuArchivo.add(menuSalir);

        barraMenus.add(menuArchivo);

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

    private void menuAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAbrirActionPerformed
        int resp;

        resp = elegirFichero.showOpenDialog(this);

        if (resp == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(null, elegirFichero.getSelectedFile().toString());

        } else if (resp == JFileChooser.CANCEL_OPTION) {

            JOptionPane.showMessageDialog(null, "Se pulsó la opción Cancelar");
        }

    }//GEN-LAST:event_menuAbrirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu.Separator Separador1;
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JFileChooser elegirFichero;
    private javax.swing.JMenuItem menuAbrir;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuSalir;
    // End of variables declaration//GEN-END:variables
}
