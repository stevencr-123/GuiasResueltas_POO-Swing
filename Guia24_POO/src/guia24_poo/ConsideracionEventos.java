package guia24_poo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConsideracionEventos extends javax.swing.JFrame {

    JLabel etiTexto;
    JTextField txtDato;

    public ConsideracionEventos() {
        initComponents();
        creacionDeVentana();
    }

    public void creacionDeVentana() {
        this.setTitle("Consideración de eventos");
        this.setSize(400, 400);
        this.setLocation(100, 100);

        etiTexto = new JLabel();
        etiTexto.setText("-------");
        etiTexto.setBounds(50, 10, 300, 20);
        this.getContentPane().add(etiTexto);

        txtDato = new JTextField();
        txtDato.setText(" ");
        txtDato.setBounds(110, 10, 100, 20);
        this.getContentPane().add(txtDato);

        etiTexto.addMouseListener(new MouseAdapter() {
//Estructura base para la creación de eventos de la etiqueta etiTexto
            public void mouseEntered(MouseEvent evt) {
                etiTextoMouseEntered(evt);
            }

            public void mouseExited(MouseEvent evt) {
                etiTextoMouseExited(evt);
            }

            public void mousePressed(MouseEvent evt) {
                etiTextoMousePressed(evt);
            }

            public void mouseReleased(MouseEvent evt) {
                etiTextoMouseReleased(evt);
            }

            public void mouseClicked(MouseEvent evt) {
                etiTextoMouseClicked(evt);
            }
        });

        //Eventos de teclado: KeyEvent
        txtDato.addKeyListener(new KeyAdapter() {

            public void keyPressed(KeyEvent evt) {
                txtDatoKeyPressed(evt);
            }

            public void keyReleased(KeyEvent evt) {
                txtDatoKeyReleased(evt);
            }

            public void keyTyped(KeyEvent evt) {
                txtDatoKeyTyped(evt);
            }
        });

    }

    //Personalización de los metodos para los eventos
    private void etiTextoMouseEntered(MouseEvent evt) {
    }

    private void etiTextoMouseExited(MouseEvent evt) {
    }

    private void etiTextoMousePressed(MouseEvent evt) {
    }

    private void etiTextoMouseReleased(MouseEvent evt) {
    }

    private void etiTextoMouseClicked(MouseEvent evt) {
    }

    //Metodos para progrmar los eventos KeyEvent
    private void txtDatoKeyPressed(KeyEvent evt) {
    }

    private void txtDatoKeyReleased(KeyEvent evt) {
    }

    private void txtDatoKeyTyped(KeyEvent evt) {
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
