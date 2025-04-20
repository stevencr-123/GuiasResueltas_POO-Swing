package guia31_poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Herencia extends javax.swing.JFrame {

    BotonContador botonA;
    BotonContador botonB;
    BotonContador botonC;

    public Herencia() {
        initComponents();
        this.setLocationRelativeTo(null);
        creacionVentana();
    }

    public void creacionVentana() {
        this.setTitle("Ejercicio de Herencia");
        this.setSize(400, 400);

        botonA = new BotonContador();
        botonA.setText("Boton A");
        botonA.setBounds(10, 10, 100, 30);
        this.getContentPane().add(botonA);

        botonB = new BotonContador();
        botonB.setText("Boton B");
        botonB.setBounds(130, 10, 100, 30);
        this.getContentPane().add(botonB);

        botonC = new BotonContador();
        botonC.setText("Boton C");
        botonC.setBounds(250, 10, 100, 30);
        this.getContentPane().add(botonC);

        botonA.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pulsacionBotonA(evt);
            }
        });

        botonB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pulsacionBotonB(evt);
            }
        });

        botonC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                pulsacionBotonC(evt);
            }
        });
    }

    public void pulsacionBotonA(ActionEvent evt) {
        botonA.incrementa();
    }

    public void pulsacionBotonB(ActionEvent evt) {
        botonB.incrementa();
    }

    public void pulsacionBotonC(ActionEvent evt) {
        botonC.aumenta(2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnVerPulsaciones = new javax.swing.JButton();
        btnReiniciar = new javax.swing.JButton();
        txtNumeroInicial = new javax.swing.JTextField();
        btnIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnVerPulsaciones.setText("Ver pulsaciones");
        btnVerPulsaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerPulsacionesActionPerformed(evt);
            }
        });

        btnReiniciar.setText("Reiniciar");
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnIniciar.setText("Iniciar");
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtNumeroInicial)
                    .addComponent(btnVerPulsaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(btnIniciar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVerPulsaciones)
                    .addComponent(btnReiniciar))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIniciar)
                    .addComponent(txtNumeroInicial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVerPulsacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerPulsacionesActionPerformed
        String info;

        info = " El botón A se ha pulsado "+ botonA.getPulsaciones() + "\n";
        info = info + " El botón B se ha pulsado " + botonB.getPulsaciones() + "\n";
        info = info + " El botón C se ha pulsado " + botonC.getPulsaciones() + "\n";

        JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnVerPulsacionesActionPerformed

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        botonA.reiniciar();
        botonB.reiniciar();
        botonC.reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        int numPulsaciones = Integer.parseInt(txtNumeroInicial.getText());
        botonA.setPulsaciones(numPulsaciones);
        botonB.setPulsaciones(numPulsaciones);
        botonC.setPulsaciones(numPulsaciones);
    }//GEN-LAST:event_btnIniciarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton btnReiniciar;
    private javax.swing.JButton btnVerPulsaciones;
    private javax.swing.JTextField txtNumeroInicial;
    // End of variables declaration//GEN-END:variables
}
