
package guia34_poo;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class ProgramacionMDI extends javax.swing.JFrame {
    
    public ProgramacionMDI() {
        initComponents();
        this.setLocationRelativeTo(null);
        configuracionVentana();
    }

    public void configuracionVentana(){
        this.setSize(800, 600);
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        barraMenus = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuArchivoAbrir = new javax.swing.JMenuItem();
        menuArchivoCerrar = new javax.swing.JMenuItem();
        separador = new javax.swing.JPopupMenu.Separator();
        menuArchivoSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout panelInternoLayout = new javax.swing.GroupLayout(panelInterno);
        panelInterno.setLayout(panelInternoLayout);
        panelInternoLayout.setHorizontalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        panelInternoLayout.setVerticalGroup(
            panelInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        menuArchivo.setText("File");

        menuArchivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia34_poo/adjunto-archivo (1).png"))); // NOI18N
        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivoCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrar);
        menuArchivo.add(separador);

        menuArchivoSalir.setText("Salir");
        menuArchivo.add(menuArchivoSalir);

        barraMenus.add(menuArchivo);

        setJMenuBar(barraMenus);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuArchivoAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoAbrirActionPerformed
       JFileChooser abrir = new JFileChooser();
       int boton = abrir.showOpenDialog(null);
        if (boton == JFileChooser.APPROVE_OPTION) {
            VentanaInterna vi = new VentanaInterna();
            
            vi.setResizable(true);
            vi.setMaximizable(true);
            vi.setIconifiable(true);
            vi.setClosable(true);
            
            panelInterno.add(vi);
            
            String camino = abrir.getSelectedFile().toString();
            vi.setImagen(camino);
            vi.setTitle(camino);
            vi.setVisible(true);
            
        }
    }//GEN-LAST:event_menuArchivoAbrirActionPerformed

    private void menuArchivoCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarActionPerformed
      
        VentanaInterna vActiva = (VentanaInterna) panelInterno.getSelectedFrame();
        if (vActiva!=null) {
            vActiva.dispose();
        }
        
    }//GEN-LAST:event_menuArchivoCerrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
