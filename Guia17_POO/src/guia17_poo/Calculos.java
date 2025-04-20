package guia17_poo;

public class Calculos extends javax.swing.JFrame {

    public Calculos() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    void sumar() {
        String cad1, cad2;
        int a, b, s;
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        s = a + b;
        etiResultado.setText("" + s);
    }

    void restar() {
        String cad1, cad2;
        int a, b, r;
        cad1 = txtNumero1.getText();
        cad2 = txtNumero2.getText();
        a = Integer.parseInt(cad1);
        b = Integer.parseInt(cad2);
        r = a - b;
        etiResultado.setText("" + r);
    }

    void borrar() {
        txtNumero1.setText("");
        txtNumero2.setText("");
        etiResultado.setText("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumero2 = new javax.swing.JTextField();
        txtNumero1 = new javax.swing.JTextField();
        etiResultado = new javax.swing.JLabel();
        btnSumar = new javax.swing.JButton();
        btnRestar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        menuBarra = new javax.swing.JMenuBar();
        menuCalcular = new javax.swing.JMenu();
        menuSumar = new javax.swing.JMenuItem();
        menuRestar = new javax.swing.JMenuItem();
        menuBorrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("      Numero 1:");

        jLabel2.setText("     Numero 2:");

        txtNumero2.setText("                     0");
        txtNumero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero2ActionPerformed(evt);
            }
        });

        txtNumero1.setText("                     0");
        txtNumero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumero1ActionPerformed(evt);
            }
        });

        etiResultado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnSumar.setText("Sumar");
        btnSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });

        btnRestar.setText("Restar");
        btnRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        menuCalcular.setText("Calcular");

        menuSumar.setText("Sumar");
        menuSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSumarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuSumar);

        menuRestar.setText("Restar");
        menuRestar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRestarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuRestar);

        menuBorrar.setText("Borrar");
        menuBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBorrarActionPerformed(evt);
            }
        });
        menuCalcular.add(menuBorrar);

        menuBarra.add(menuCalcular);

        setJMenuBar(menuBarra);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                    .addComponent(txtNumero2))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 37, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSumar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRestar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addGap(112, 112, 112))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumero2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(etiResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSumar)
                .addGap(18, 18, 18)
                .addComponent(btnRestar)
                .addGap(18, 18, 18)
                .addComponent(btnBorrar)
                .addContainerGap(85, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestarActionPerformed
        restar();
    }//GEN-LAST:event_btnRestarActionPerformed

    private void btnSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumarActionPerformed
        sumar();
    }//GEN-LAST:event_btnSumarActionPerformed

    private void menuSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSumarActionPerformed
        sumar();
    }//GEN-LAST:event_menuSumarActionPerformed

    private void txtNumero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero1ActionPerformed
        sumar();
    }//GEN-LAST:event_txtNumero1ActionPerformed

    private void txtNumero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumero2ActionPerformed
        sumar();
    }//GEN-LAST:event_txtNumero2ActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        borrar();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void menuRestarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRestarActionPerformed
        restar();
    }//GEN-LAST:event_menuRestarActionPerformed

    private void menuBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBorrarActionPerformed
        borrar();
    }//GEN-LAST:event_menuBorrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnRestar;
    private javax.swing.JButton btnSumar;
    private javax.swing.JLabel etiResultado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar menuBarra;
    private javax.swing.JMenuItem menuBorrar;
    private javax.swing.JMenu menuCalcular;
    private javax.swing.JMenuItem menuRestar;
    private javax.swing.JMenuItem menuSumar;
    private javax.swing.JTextField txtNumero1;
    private javax.swing.JTextField txtNumero2;
    // End of variables declaration//GEN-END:variables
}
