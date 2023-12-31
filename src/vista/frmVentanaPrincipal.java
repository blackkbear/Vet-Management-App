/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;



import controlador.ControllerDueno;
import controlador.ControllerMascota;
import controlador.ControllerRegistroCita;
import controlador.ControllerReporteDueno;
import controlador.ControllerUsuario;
import controlador.ControllerVeterinario;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Graphics;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import vista.frmDueno;
import vista.frmMascota;
import vista.frmRegistroCita;
import vista.frmUsuario;
import vista.frmVeterinario;


/**
 *
 * @author two_r
 */
public class frmVentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmVentanaPrincipal
     */
    public frmVentanaPrincipal(String idUsuario, String nombreUsuario, String tipoUsuario ) {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       setTitle("Veterinaria Mi Mascota");
       lblIdPrincip.setText("ID: " + idUsuario);
        lblNombrePrincip.setText("Usuario: " + nombreUsuario);
        lblTipoPrincip.setText("Tipo de Usuario: " + tipoUsuario);
       
        
       
               }
   

  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.setColor(Color.WHITE);
                g.fillRect(0, 0, getWidth(), getHeight());
            }
        };
        lblBienvenida = new javax.swing.JLabel();
        lblNombrePrincip = new javax.swing.JLabel();
        lblIdPrincip = new javax.swing.JLabel();
        lblTipoPrincip = new javax.swing.JLabel();
        lblLogoPrincipal = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mitemSalir = new javax.swing.JMenuItem();
        menuProcesos = new javax.swing.JMenu();
        mitemCitas = new javax.swing.JMenuItem();
        menuCatalogo = new javax.swing.JMenu();
        mitemUsuarios = new javax.swing.JMenuItem();
        mitemVets = new javax.swing.JMenuItem();
        mitemMasc = new javax.swing.JMenuItem();
        mitemDuenos = new javax.swing.JMenuItem();
        menuReportes = new javax.swing.JMenu();
        mitemCitasFecha = new javax.swing.JMenuItem();
        mitemCitasDueno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        mitemSobre = new javax.swing.JMenuItem();
        mitemManual = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setForeground(new java.awt.Color(255, 255, 255));

        lblBienvenida.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblBienvenida.setText("MANTENIMIENTO DE CLÍNICA VETERINARIA MI MASCOTA");

        lblNombrePrincip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblNombrePrincip.setText("Nombre de Usuario:");

        lblIdPrincip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblIdPrincip.setText("ID de Usuario:");
        lblIdPrincip.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblTipoPrincip.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        lblTipoPrincip.setText("Tipo de Usuario:");

        lblLogoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rsz_2mimasc2.jpg"))); // NOI18N
        lblLogoPrincipal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        desktopPane.setLayer(lblBienvenida, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblNombrePrincip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblIdPrincip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblTipoPrincip, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desktopPane.setLayer(lblLogoPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopPaneLayout = new javax.swing.GroupLayout(desktopPane);
        desktopPane.setLayout(desktopPaneLayout);
        desktopPaneLayout.setHorizontalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIdPrincip, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addComponent(lblLogoPrincipal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblBienvenida))
                    .addComponent(lblTipoPrincip)
                    .addComponent(lblNombrePrincip))
                .addContainerGap(515, Short.MAX_VALUE))
        );
        desktopPaneLayout.setVerticalGroup(
            desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(desktopPaneLayout.createSequentialGroup()
                .addGroup(desktopPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblLogoPrincipal))
                    .addGroup(desktopPaneLayout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(lblBienvenida)))
                .addGap(51, 51, 51)
                .addComponent(lblIdPrincip)
                .addGap(36, 36, 36)
                .addComponent(lblTipoPrincip)
                .addGap(32, 32, 32)
                .addComponent(lblNombrePrincip)
                .addContainerGap(396, Short.MAX_VALUE))
        );

        jMenu1.setText("Archivo");
        jMenu1.setToolTipText("Salir");

        mitemSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mitemSalir.setText("Salir");
        mitemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mitemSalir);

        menuBar.add(jMenu1);

        menuProcesos.setText("Gestión de Procesos");
        menuProcesos.setToolTipText("Registro de Citas");

        mitemCitas.setText("Registro de Citas");
        mitemCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemCitasActionPerformed(evt);
            }
        });
        menuProcesos.add(mitemCitas);

        menuBar.add(menuProcesos);

        menuCatalogo.setText("Catálogo de Datos");
        menuCatalogo.setToolTipText("Mantenimiento de Usuarios, Vets, Mascotas, Dueños");

        mitemUsuarios.setText("Usuarios");
        mitemUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemUsuariosActionPerformed(evt);
            }
        });
        menuCatalogo.add(mitemUsuarios);

        mitemVets.setText("Veterinarios");
        mitemVets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemVetsActionPerformed(evt);
            }
        });
        menuCatalogo.add(mitemVets);

        mitemMasc.setText("Mascotas");
        mitemMasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemMascActionPerformed(evt);
            }
        });
        menuCatalogo.add(mitemMasc);

        mitemDuenos.setText("Dueños");
        mitemDuenos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemDuenosActionPerformed(evt);
            }
        });
        menuCatalogo.add(mitemDuenos);

        menuBar.add(menuCatalogo);

        menuReportes.setText("Reportes");
        menuReportes.setToolTipText("Ver Citas por Fechas y Dueños");

        mitemCitasFecha.setText("Citas por Fecha");
        mitemCitasFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemCitasFechaActionPerformed(evt);
            }
        });
        menuReportes.add(mitemCitasFecha);

        mitemCitasDueno.setText("Citas por Dueño");
        mitemCitasDueno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemCitasDuenoActionPerformed(evt);
            }
        });
        menuReportes.add(mitemCitasDueno);

        menuBar.add(menuReportes);

        jMenu5.setText("Ayuda");
        jMenu5.setToolTipText("Ver los Créditos y descargar Manual de uso del Sistema");

        mitemSobre.setText("Acerca De");
        mitemSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemSobreActionPerformed(evt);
            }
        });
        jMenu5.add(mitemSobre);

        mitemManual.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_MASK));
        mitemManual.setText("Manual");
        mitemManual.setToolTipText("Presione \"Manual\" para abrir el PDF Manual. Para descargar, presione el disco de \"Guardar cómo\"");
        mitemManual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mitemManualActionPerformed(evt);
            }
        });
        jMenu5.add(mitemManual);

        menuBar.add(jMenu5);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mitemUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemUsuariosActionPerformed
        // TODO add your handling code here:
         frmUsuario obj = new frmUsuario();
        desktopPane.add(obj);
        ControllerUsuario con = new ControllerUsuario(obj);
        con.iniciar();
        obj.toFront();
        obj.setLocation(desktopPane.getWidth() / 4 - obj.getWidth() / 4, desktopPane.getHeight() / 4 - obj.getHeight() / 4);
        obj.setVisible(true);
    }//GEN-LAST:event_mitemUsuariosActionPerformed

    private void mitemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSalirActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "Desea salir del sistema? Presione 'OK' para salir.");
        System.exit(0);
    }//GEN-LAST:event_mitemSalirActionPerformed

    private void mitemManualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemManualActionPerformed
        // TODO add your handling code here:
        try {
           Desktop.getDesktop().open(new File("./manualPDF/ManualdeUso.pdf"));
        } catch (Exception ex) {
            Logger.getLogger(frmVentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }//GEN-LAST:event_mitemManualActionPerformed

    private void mitemCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemCitasActionPerformed
        // TODO add your handling code here:
       frmRegistroCita obj4 = new frmRegistroCita();
        desktopPane.add(obj4);
        ControllerRegistroCita con4 = new ControllerRegistroCita(obj4);
        con4.iniciar();
        obj4.toFront();
        obj4.setLocation(desktopPane.getWidth() / 4 - obj4.getWidth() / 4, desktopPane.getHeight() / 4 - obj4.getHeight() / 4);
        obj4.setVisible(true);
    }//GEN-LAST:event_mitemCitasActionPerformed

    private void mitemDuenosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemDuenosActionPerformed
        // TODO add your handling code here:
        frmDueno obj1 = new frmDueno();
        desktopPane.add(obj1);
        ControllerDueno con1 = new ControllerDueno(obj1);
        con1.iniciar();
        obj1.toFront();
        obj1.setLocation(desktopPane.getWidth() / 3 - obj1.getWidth() / 3, desktopPane.getHeight() / 3 - obj1.getHeight() / 3);
        obj1.setVisible(true);
    }//GEN-LAST:event_mitemDuenosActionPerformed

    private void mitemVetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemVetsActionPerformed
        // TODO add your handling code here:
        frmVeterinario obj2 = new frmVeterinario();
        desktopPane.add(obj2);
        ControllerVeterinario con2 = new ControllerVeterinario(obj2);
        con2.iniciar();
        obj2.toFront();
        obj2.setLocation(desktopPane.getWidth() / 4 - obj2.getWidth() / 4, desktopPane.getHeight() / 4 - obj2.getHeight() / 4);
        obj2.setVisible(true);
    }//GEN-LAST:event_mitemVetsActionPerformed

    private void mitemMascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemMascActionPerformed
        // TODO add your handling code here:
        frmMascota obj3 = new frmMascota();
        desktopPane.add(obj3);
        ControllerMascota con3 = new ControllerMascota(obj3);
        con3.iniciar();
        obj3.toFront();
        obj3.setLocation(desktopPane.getWidth() / 4 - obj3.getWidth() / 4, desktopPane.getHeight() / 4 - obj3.getHeight() / 4);
        obj3.setVisible(true);
    }//GEN-LAST:event_mitemMascActionPerformed

    private void mitemCitasFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemCitasFechaActionPerformed

    }//GEN-LAST:event_mitemCitasFechaActionPerformed

    private void mitemCitasDuenoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemCitasDuenoActionPerformed
        frmReporteDueno obj5 = new frmReporteDueno();
        desktopPane.add(obj5);
        ControllerReporteDueno con = new ControllerReporteDueno(obj5);
        con.iniciar();
        obj5.toFront();
        obj5.setLocation(desktopPane.getWidth() / 4 - obj5.getWidth() / 4, desktopPane.getHeight() / 4 - obj5.getHeight() / 4);
        obj5.setVisible(true);
    }//GEN-LAST:event_mitemCitasDuenoActionPerformed

    private void mitemSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mitemSobreActionPerformed
        // TODO add your handling code here:
        frmAcerca acerca = new frmAcerca(this, rootPaneCheckingEnabled);
        acerca.setVisible(true);
    }//GEN-LAST:event_mitemSobreActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmVentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmVentanaPrincipal(lblIdPrincip.getText(), lblNombrePrincip.getText(), lblTipoPrincip.getText()).setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane desktopPane;
    public javax.swing.JMenu jMenu1;
    public javax.swing.JMenu jMenu5;
    public static javax.swing.JLabel lblBienvenida;
    public static javax.swing.JLabel lblIdPrincip;
    private javax.swing.JLabel lblLogoPrincipal;
    public static javax.swing.JLabel lblNombrePrincip;
    public static javax.swing.JLabel lblTipoPrincip;
    public javax.swing.JMenuBar menuBar;
    public javax.swing.JMenu menuCatalogo;
    private javax.swing.JMenu menuProcesos;
    public javax.swing.JMenu menuReportes;
    public javax.swing.JMenuItem mitemCitas;
    public javax.swing.JMenuItem mitemCitasDueno;
    public javax.swing.JMenuItem mitemCitasFecha;
    public javax.swing.JMenuItem mitemDuenos;
    public javax.swing.JMenuItem mitemManual;
    public javax.swing.JMenuItem mitemMasc;
    public javax.swing.JMenuItem mitemSalir;
    public javax.swing.JMenuItem mitemSobre;
    public javax.swing.JMenuItem mitemUsuarios;
    public javax.swing.JMenuItem mitemVets;
    // End of variables declaration//GEN-END:variables
}
