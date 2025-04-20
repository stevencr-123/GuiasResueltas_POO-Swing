
package guia15_poo;

public class panelDesplazamiento extends javax.swing.JFrame {

    public panelDesplazamiento() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scpImagen = new javax.swing.JScrollPane();
        etiImagen = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia15_poo/DiagramaUML.png"))); // NOI18N
        scpImagen.setViewportView(etiImagen);

        getContentPane().add(scpImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel etiImagen;
    private javax.swing.JScrollPane scpImagen;
    // End of variables declaration//GEN-END:variables
}
