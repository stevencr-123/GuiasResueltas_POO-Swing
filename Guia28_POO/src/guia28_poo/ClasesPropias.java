
package guia28_poo;

import javax.swing.JOptionPane;

public class ClasesPropias extends javax.swing.JFrame {
Rectangulo suelo;
    
    public ClasesPropias() {
        initComponents();
        this.setLocationRelativeTo(null);
        MostrarInfosuelo();
    }
    
     public void MostrarInfosuelo(){
        suelo = new Rectangulo();
        double area = 0;
        double peri = 0;
        suelo = new Rectangulo(); 
        suelo.setAltura(50);
        suelo.setBase(30);
        area = suelo.perimetro(suelo.base, suelo.altura); 
        peri = suelo.area(suelo.base, suelo.altura);
        suelo.setUnidadMedida("m2");
        suelo.setIdentificador(1);
        JOptionPane.showMessageDialog(null, "\nEl identificador del suelo es: "+suelo.getIdentificador()+
                           "\nLa base del suelo es: "+ suelo.getBase()+suelo.getUnidadMedida()+
                           "\nLa altura del suelo es: "+ suelo.getAltura()+suelo.getUnidadMedida()+
                           "\nEl área del suelo es de: "+area+suelo.getUnidadMedida()+
                           "\nEl perimetro del suelo es de:"+peri+suelo.getUnidadMedida(),
                           "Exito", JOptionPane.INFORMATION_MESSAGE);
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
