
package guia19_poo;

public class LayoutPanel extends javax.swing.JFrame {

    public LayoutPanel() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelDatos = new javax.swing.JPanel();
        panelEtiqueta1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        panelCuadro1 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        panelEtiqueta2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        panelCuadro2 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        panelEstado = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panelVerificacion = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        panelBotonera = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Ejercicio de distrubución de paneles y layouts");
        panelTitulo.add(jLabel1);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("por Stevenson Caraballo");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelTitulo.add(jLabel2);

        getContentPane().add(panelTitulo, java.awt.BorderLayout.CENTER);

        panelDatos.setLayout(new java.awt.GridLayout(2, 2));

        jLabel6.setText("DATO1:");

        javax.swing.GroupLayout panelEtiqueta1Layout = new javax.swing.GroupLayout(panelEtiqueta1);
        panelEtiqueta1.setLayout(panelEtiqueta1Layout);
        panelEtiqueta1Layout.setHorizontalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addContainerGap(71, Short.MAX_VALUE))
        );
        panelEtiqueta1Layout.setVerticalGroup(
            panelEtiqueta1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel6)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        panelDatos.add(panelEtiqueta1);

        javax.swing.GroupLayout panelCuadro1Layout = new javax.swing.GroupLayout(panelCuadro1);
        panelCuadro1.setLayout(panelCuadro1Layout);
        panelCuadro1Layout.setHorizontalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelCuadro1Layout.setVerticalGroup(
            panelCuadro1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro1Layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        panelDatos.add(panelCuadro1);

        jLabel8.setText("DATO2:");

        javax.swing.GroupLayout panelEtiqueta2Layout = new javax.swing.GroupLayout(panelEtiqueta2);
        panelEtiqueta2.setLayout(panelEtiqueta2Layout);
        panelEtiqueta2Layout.setHorizontalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEtiqueta2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel8)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        panelEtiqueta2Layout.setVerticalGroup(
            panelEtiqueta2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEtiqueta2Layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(40, 40, 40))
        );

        panelDatos.add(panelEtiqueta2);

        javax.swing.GroupLayout panelCuadro2Layout = new javax.swing.GroupLayout(panelCuadro2);
        panelCuadro2.setLayout(panelCuadro2Layout);
        panelCuadro2Layout.setHorizontalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro2Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        panelCuadro2Layout.setVerticalGroup(
            panelCuadro2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCuadro2Layout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        panelDatos.add(panelCuadro2);

        getContentPane().add(panelDatos, java.awt.BorderLayout.CENTER);

        jLabel3.setText("jLabel3");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panelEstadoLayout = new javax.swing.GroupLayout(panelEstado);
        panelEstado.setLayout(panelEstadoLayout);
        panelEstadoLayout.setHorizontalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        panelEstadoLayout.setVerticalGroup(
            panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelEstadoLayout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(panelEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(124, 124, 124))
        );

        getContentPane().add(panelEstado, java.awt.BorderLayout.PAGE_END);

        panelVerificacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setText("jCheckBox1");
        panelVerificacion.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 64, -1, -1));

        jCheckBox2.setText("jCheckBox2");
        panelVerificacion.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 133, -1, -1));

        jCheckBox3.setText("jCheckBox3");
        panelVerificacion.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 192, -1, -1));

        jCheckBox4.setText("jCheckBox4");
        panelVerificacion.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 251, -1, -1));

        getContentPane().add(panelVerificacion, java.awt.BorderLayout.LINE_END);

        panelBotonera.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("jButton1");
        panelBotonera.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jButton2.setText("jButton2");
        panelBotonera.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jButton3.setText("jButton3");
        panelBotonera.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jButton4.setText("jButton4");
        panelBotonera.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        getContentPane().add(panelBotonera, java.awt.BorderLayout.WEST);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JPanel panelBotonera;
    private javax.swing.JPanel panelCuadro1;
    private javax.swing.JPanel panelCuadro2;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JPanel panelEstado;
    private javax.swing.JPanel panelEtiqueta1;
    private javax.swing.JPanel panelEtiqueta2;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelVerificacion;
    // End of variables declaration//GEN-END:variables
}
