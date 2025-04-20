
package guia18_poo;

public class Layout extends javax.swing.JFrame {

    public Layout() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Botón");
        getContentPane().add(jButton1, java.awt.BorderLayout.PAGE_START);

        jButton2.setText("jButton2");
        getContentPane().add(jButton2, java.awt.BorderLayout.LINE_START);

        jButton3.setText("jButton3");
        getContentPane().add(jButton3, java.awt.BorderLayout.PAGE_END);

        jButton4.setText("jButton4");
        getContentPane().add(jButton4, java.awt.BorderLayout.LINE_END);

        jButton5.setText("jButton5");
        getContentPane().add(jButton5, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables
}
