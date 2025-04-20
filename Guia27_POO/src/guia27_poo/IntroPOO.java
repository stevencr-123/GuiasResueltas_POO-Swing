
package guia27_poo;

import java.awt.Color;
import javax.swing.JButton;

public class IntroPOO extends javax.swing.JFrame {
    //JButton es la clase que permite crear Botones.
    JButton botonAceptar;
    JButton botonCancelar;
    
    public IntroPOO() {
        initComponents();
        crearVentana();
    }
    void crearVentana(){
        this.setTitle("Introducción a POO ");
        this.setSize(300,200);
        
        //Creamos un botón que contenga el nombre Aceptar y otro Cancelar
        botonAceptar = new JButton();
        botonCancelar = new JButton();
        
        //Métodos para cambiar propiedades de los botones
        botonAceptar.setText("Aceptar");
        botonCancelar.setText("Cancelar");
        botonAceptar.setBounds(10, 75, 100, 20);
        botonCancelar.setBounds(150, 75, 100, 20);
        botonAceptar.setBackground(Color.BLUE);
        botonCancelar.setBackground(Color.RED);
        
        //Métodos para obteber informacion de los botones
        botonAceptar.getBackground();
        botonCancelar.getBackground();
        botonAceptar.getBounds();
        botonCancelar.getBounds();
        botonAceptar.getText();
        botonCancelar.getText();
 
        //Métodos para dar ordenes a botones
        botonAceptar.addNotify();
        botonCancelar.addNotify();

        this.getContentPane().add(botonAceptar);
        this.getContentPane().add(botonCancelar);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IntroPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IntroPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IntroPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroPOO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IntroPOO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
