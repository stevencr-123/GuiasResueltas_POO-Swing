
package guia30_poo;

import javax.swing.JOptionPane;

public class Multicines extends javax.swing.JFrame {
SalaCine central;
SalaCine vo;
    public Multicines() {
        initComponents();
        this.setLocationRelativeTo(null);
        central = new SalaCine();
        vo = new SalaCine();
        
        central.setAforo(500);
        central.setEntrada(8.00);
        
        vo.setAforo(80);
        vo.setEntrada(6.00);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelCentral = new javax.swing.JPanel();
        etiTitulo = new javax.swing.JLabel();
        etiPelicula = new javax.swing.JLabel();
        etiCentralPelicula = new javax.swing.JLabel();
        btnCambiar = new javax.swing.JButton();
        btnNueva = new javax.swing.JButton();
        btnOcupacion = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        btnIngresos = new javax.swing.JButton();
        panelVOriginal = new javax.swing.JPanel();
        etiTituloOriginal = new javax.swing.JLabel();
        etiPeliculaOriginal = new javax.swing.JLabel();
        etiCentralPeliculaOriginal = new javax.swing.JLabel();
        btnOriginalCambiar = new javax.swing.JButton();
        btnOriginalNueva = new javax.swing.JButton();
        btnOriginalOcupacion = new javax.swing.JButton();
        btnOriginalVaciar = new javax.swing.JButton();
        btnOriginalIngresos = new javax.swing.JButton();
        btnIngresosTotales = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Multicine");
        setBackground(new java.awt.Color(0, 0, 0));

        panelCentral.setBackground(new java.awt.Color(204, 204, 255));
        panelCentral.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiTitulo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiTitulo.setText("SALA CENTRAL");

        etiPelicula.setText("    Pelicula:");

        etiCentralPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnCambiar.setText("Cambiar");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });

        btnNueva.setText("Nueva venta");
        btnNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaActionPerformed(evt);
            }
        });

        btnOcupacion.setText("% Ocupacion");
        btnOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOcupacionActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        btnIngresos.setText("Ingresos");
        btnIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCentralLayout = new javax.swing.GroupLayout(panelCentral);
        panelCentral.setLayout(panelCentralLayout);
        panelCentralLayout.setHorizontalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnIngresos))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTitulo)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(etiPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiCentralPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelCentralLayout.setVerticalGroup(
            panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCentralLayout.createSequentialGroup()
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(etiTitulo)
                        .addGap(18, 18, 18)
                        .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiPelicula, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelCentralLayout.createSequentialGroup()
                                .addComponent(etiCentralPelicula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))))
                    .addGroup(panelCentralLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnCambiar)))
                .addGap(62, 62, 62)
                .addGroup(panelCentralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNueva)
                    .addComponent(btnOcupacion)
                    .addComponent(btnVaciar)
                    .addComponent(btnIngresos))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        panelVOriginal.setBackground(new java.awt.Color(204, 204, 204));
        panelVOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        etiTituloOriginal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        etiTituloOriginal.setText("SALA VERSIÓN ORIGINAL");

        etiPeliculaOriginal.setText("    Pelicula:");

        etiCentralPeliculaOriginal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOriginalCambiar.setText("Cambiar");
        btnOriginalCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalCambiarActionPerformed(evt);
            }
        });

        btnOriginalNueva.setText("Nueva venta");
        btnOriginalNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalNuevaActionPerformed(evt);
            }
        });

        btnOriginalOcupacion.setText("% Ocupacion");
        btnOriginalOcupacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalOcupacionActionPerformed(evt);
            }
        });

        btnOriginalVaciar.setText("Vaciar");
        btnOriginalVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalVaciarActionPerformed(evt);
            }
        });

        btnOriginalIngresos.setText("Ingresos");
        btnOriginalIngresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOriginalIngresosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelVOriginalLayout = new javax.swing.GroupLayout(panelVOriginal);
        panelVOriginal.setLayout(panelVOriginalLayout);
        panelVOriginalLayout.setHorizontalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnOriginalNueva)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnOriginalOcupacion)
                        .addGap(18, 18, 18)
                        .addComponent(btnOriginalVaciar)
                        .addGap(18, 18, 18)
                        .addComponent(btnOriginalIngresos))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiTituloOriginal)
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addComponent(etiPeliculaOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etiCentralPeliculaOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnOriginalCambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        panelVOriginalLayout.setVerticalGroup(
            panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelVOriginalLayout.createSequentialGroup()
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(etiTituloOriginal)
                        .addGap(18, 18, 18)
                        .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiPeliculaOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelVOriginalLayout.createSequentialGroup()
                                .addComponent(etiCentralPeliculaOriginal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3))))
                    .addGroup(panelVOriginalLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(btnOriginalCambiar)))
                .addGap(62, 62, 62)
                .addGroup(panelVOriginalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOriginalNueva)
                    .addComponent(btnOriginalOcupacion)
                    .addComponent(btnOriginalVaciar)
                    .addComponent(btnOriginalIngresos))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        btnIngresosTotales.setText("Ingresos totales");
        btnIngresosTotales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresosTotalesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnIngresosTotales, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelVOriginal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCentral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnIngresosTotales)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresosTotalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosTotalesActionPerformed
    double total = central.getIngresos()+vo.getIngresos();
    JOptionPane.showMessageDialog(null, "Los ingresos totales son: "+total);
    }//GEN-LAST:event_btnIngresosTotalesActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
     String titulo;
     
     titulo = JOptionPane.showInputDialog("Introduce el titulo de la pelicula");
     central.setPelicula(titulo);
     etiCentralPelicula.setText(titulo);
    }//GEN-LAST:event_btnCambiarActionPerformed

    private void btnNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaActionPerformed
     central.entraUno();
    }//GEN-LAST:event_btnNuevaActionPerformed

    private void btnOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOcupacionActionPerformed
    String info;
    
    info ="Sala central\n";
    info = info + " Pelicula: "+central.getPelicula()+"\n";
    info = info + " Aforo: "+central.getAforo()+"\n";
    info = info + " Ocupadas: "+central.getOcupadas();
    info = info + " Libres: "+central.getLibres()+"\n";
    info = info + " Porcentaje de Ocupación: "+central.getPorcentaje()+"\n";
    
    JOptionPane.showMessageDialog(null, info);

    }//GEN-LAST:event_btnOcupacionActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
    central.Vaciar();
    etiCentralPelicula.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresosActionPerformed
    String info;
    
    info = "Ingresos de la sala: "+central.getIngresos()+" euros";
    
    JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnIngresosActionPerformed

    private void btnOriginalCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalCambiarActionPerformed
       String titulo;
     
     titulo = JOptionPane.showInputDialog("Introduce el titulo de la pelicula");
     vo.setPelicula(titulo);
     etiCentralPeliculaOriginal.setText(titulo);
    }//GEN-LAST:event_btnOriginalCambiarActionPerformed

    private void btnOriginalNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalNuevaActionPerformed
       vo.entraUno();
    }//GEN-LAST:event_btnOriginalNuevaActionPerformed

    private void btnOriginalOcupacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalOcupacionActionPerformed
         String info;
    
    info ="Sala central\n";
    info = info + " Pelicula: "+vo.getPelicula()+"\n";
    info = info + " Aforo: "+vo.getAforo()+"\n";
    info = info + " Ocupadas: "+vo.getOcupadas();
    info = info + " Libres: "+vo.getLibres()+"\n";
    info = info + " Porcentaje de Ocupación: "+vo.getPorcentaje()+"\n";
    
    JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalOcupacionActionPerformed

    private void btnOriginalVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalVaciarActionPerformed
       vo.Vaciar();
    etiCentralPeliculaOriginal.setText("");
    }//GEN-LAST:event_btnOriginalVaciarActionPerformed

    private void btnOriginalIngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOriginalIngresosActionPerformed
       String info;
    
    info = "Ingresos de la sala: "+vo.getIngresos()+" euros";
    
    JOptionPane.showMessageDialog(null, info);
    }//GEN-LAST:event_btnOriginalIngresosActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnIngresos;
    private javax.swing.JButton btnIngresosTotales;
    private javax.swing.JButton btnNueva;
    private javax.swing.JButton btnOcupacion;
    private javax.swing.JButton btnOriginalCambiar;
    private javax.swing.JButton btnOriginalIngresos;
    private javax.swing.JButton btnOriginalNueva;
    private javax.swing.JButton btnOriginalOcupacion;
    private javax.swing.JButton btnOriginalVaciar;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JLabel etiCentralPelicula;
    private javax.swing.JLabel etiCentralPeliculaOriginal;
    private javax.swing.JLabel etiPelicula;
    private javax.swing.JLabel etiPeliculaOriginal;
    private javax.swing.JLabel etiTitulo;
    private javax.swing.JLabel etiTituloOriginal;
    private javax.swing.JPanel panelCentral;
    private javax.swing.JPanel panelVOriginal;
    // End of variables declaration//GEN-END:variables
}
