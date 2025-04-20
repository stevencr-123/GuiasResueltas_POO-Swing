
package guia22_poo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class EventoDesdeCodigo extends javax.swing.JFrame {

    public EventoDesdeCodigo() {
        initComponents();
        creacionDeVentana();
    }

    JLabel etiNum1;
    JLabel etiNum2;
    JTextField txtNum1;
    JTextField txtNum2;
    JButton btnSumar;
    JButton btnRestar;

    public void creacionDeVentana() {
        this.setTitle("Programa Operaciones");
        this.setSize(500, 300);
        this.setLocation(100, 100);

        etiNum1 = new JLabel();
        etiNum1.setText("Numero 1");
        etiNum1.setBounds(10, 10, 100, 20);
        this.getContentPane().add(etiNum1);

        etiNum2 = new JLabel();
        etiNum2.setText("Numero 2");
        etiNum2.setBounds(10, 60, 100, 20);
        this.getContentPane().add(etiNum2);

        txtNum1 = new JTextField();
        txtNum1.setText("0");
        txtNum1.setBounds(110, 10, 100, 20);
        this.getContentPane().add(txtNum1);

        txtNum2 = new JTextField();
        txtNum2.setText("0");
        txtNum2.setBounds(110, 60, 100, 20);
        this.getContentPane().add(txtNum2);

        btnSumar = new JButton();
        btnSumar.setText("Suamar");
        btnSumar.setBounds(10, 120, 100, 20);
        this.getContentPane().add(btnSumar);

        btnRestar = new JButton();
        btnRestar.setText("Restar");
        btnRestar.setBounds(150, 120, 100, 20);
        this.getContentPane().add(btnRestar);
        
        //Metodos ActionListener
       btnSumar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnSumarActionPerformed(evt);
            }
        });
       
       btnRestar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                btnRestarActionPerformed(evt);
            }
        });


    }
    
     public void btnSumarActionPerformed(ActionEvent evt){
        double a,b,s;
       a = Double.parseDouble(txtNum1.getText());
       b = Double.parseDouble(txtNum2.getText());
       s = a+b;
         JOptionPane.showMessageDialog(null, "La suma es: "+s);
    
     }
     
      public void btnRestarActionPerformed(ActionEvent evt){
        double a,b,r;
       a = Double.parseDouble(txtNum1.getText());
       b = Double.parseDouble(txtNum2.getText());
       r = a-b;
         JOptionPane.showMessageDialog(null, "La resta es: "+r);
    
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
