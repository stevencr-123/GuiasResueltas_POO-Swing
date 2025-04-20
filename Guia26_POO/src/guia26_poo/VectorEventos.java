package guia26_poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class VectorEventos extends javax.swing.JFrame {

    JButton vBotones[];

    public VectorEventos() {
        initComponents();
        crearVentana();
    }

    void crearVentana() {
        this.setTitle("Ejemplo de vectores y eventos ");
        this.setSize(600, 200);

        String textoBotones[] = {"Aceptar", "Cancelar", "Cerrar", "Salir"};
        vBotones = new JButton[4];
        int i;
        for (i = 0; i < vBotones.length; i++) {
            vBotones[i] = new JButton();
            vBotones[i].setText(textoBotones[i]);
            vBotones[i].setBounds(10 + i * 100, 100, 90, 20);
            this.getContentPane().add(vBotones[i]);
        }

        for (i = 0; i < vBotones.length; i++) {
            vBotones[i].addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent evt) {
                    botonesActionPerformed(evt);
                }
            });
        }

    }

    public void botonesActionPerformed(ActionEvent evt) {
        JButton botonPulsado = (JButton) evt.getSource();
        JOptionPane.showMessageDialog(null, "Has pulsado el boton " + botonPulsado.getText());
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
