
package guia35_poo;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

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
        menuArchivoInfo = new javax.swing.JMenuItem();
        menuArchivoSalir = new javax.swing.JMenuItem();
        menuArchivoCerrarTodo = new javax.swing.JMenuItem();
        menuVentana = new javax.swing.JMenu();
        menuCascada = new javax.swing.JMenuItem();

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

        menuArchivo.setText("Archivo");

        menuArchivoAbrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guia35_poo/adjunto-archivo (1).png"))); // NOI18N
        menuArchivoAbrir.setText("Abrir");
        menuArchivoAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoAbrirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoAbrir);

        menuArchivoCerrar.setText("Cerrar");
        menuArchivo.add(menuArchivoCerrar);
        menuArchivo.add(separador);

        menuArchivoInfo.setText("Info");
        menuArchivoInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoInfoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoInfo);

        menuArchivoSalir.setText("Salir");
        menuArchivo.add(menuArchivoSalir);

        menuArchivoCerrarTodo.setText("Cerrar todo");
        menuArchivoCerrarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuArchivoCerrarTodoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuArchivoCerrarTodo);

        barraMenus.add(menuArchivo);

        menuVentana.setText("Ventana");
        menuVentana.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVentanaActionPerformed(evt);
            }
        });

        menuCascada.setText("Cascada");
        menuVentana.add(menuCascada);

        barraMenus.add(menuVentana);

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

    private void menuArchivoInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoInfoActionPerformed
      VentanaInterna vActiva = (VentanaInterna) panelInterno.getSelectedFrame();
        if (vActiva!=null) {
            String titulo = vActiva.getTitle();
            JOptionPane.showMessageDialog(null, "Camino de la imagen: \n"+titulo);
        }else{
            JOptionPane.showMessageDialog(null, "No hay ninguna imagen seleccionada");
        }
    }//GEN-LAST:event_menuArchivoInfoActionPerformed

    private void menuArchivoCerrarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuArchivoCerrarTodoActionPerformed
        int i;
        JInternalFrame v[] = panelInterno.getAllFrames();
        
        for (i = 0; i < v.length; i++) {
            v[i].dispose();
        }
    }//GEN-LAST:event_menuArchivoCerrarTodoActionPerformed

    private void menuVentanaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVentanaActionPerformed
      int i,x,y;
      
        JInternalFrame v[] = panelInterno.getAllFrames();
        
        x = 0;
        y = 0;
      
        for (i = v.length-1; i>=0; i--) {
            v[i].setSize(600,400);
            v[i].setLocation(x, y);
            
            x=x+30;
            y=y+30;
        }
    }//GEN-LAST:event_menuVentanaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraMenus;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenuItem menuArchivoAbrir;
    private javax.swing.JMenuItem menuArchivoCerrar;
    private javax.swing.JMenuItem menuArchivoCerrarTodo;
    private javax.swing.JMenuItem menuArchivoInfo;
    private javax.swing.JMenuItem menuArchivoSalir;
    private javax.swing.JMenuItem menuCascada;
    private javax.swing.JMenu menuVentana;
    private javax.swing.JDesktopPane panelInterno;
    private javax.swing.JPopupMenu.Separator separador;
    // End of variables declaration//GEN-END:variables
}
