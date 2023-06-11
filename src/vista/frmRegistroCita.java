/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControllerRegistroCita;



/**
 *
 * @author two_r
 */
public class frmRegistroCita extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmCita
     */
    public frmRegistroCita() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMiMascVet = new javax.swing.JLabel();
        panelCita = new javax.swing.JPanel();
        lblLogoCita = new javax.swing.JLabel();
        panelRegistroCita = new javax.swing.JPanel();
        lblCedulaCita = new javax.swing.JLabel();
        lblAsuntoRegistroCita = new javax.swing.JLabel();
        lblFechaRegistroCita = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fechaRegistroCita = new com.toedter.calendar.JDateChooser();
        txtCedulaRegCita = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txarAsuntoRegCita = new javax.swing.JTextArea();
        lblHoraRegistroCita = new javax.swing.JLabel();
        lblFechaCreacRegCita = new javax.swing.JLabel();
        lblIdDueRegistroCita = new javax.swing.JLabel();
        lblIdVetRegistroCita = new javax.swing.JLabel();
        lblIdUserRegistroCita = new javax.swing.JLabel();
        cboxIdDueRegistroCita = new javax.swing.JComboBox<>();
        cboxIdVetRegistroCita = new javax.swing.JComboBox<>();
        cboxIdUserRegistroCita = new javax.swing.JComboBox<>();
        txtFechaCreacRegCita = new javax.swing.JTextField();
        cboxHoraRegCita = new javax.swing.JComboBox<>();
        btnRegistroCita = new javax.swing.JButton();
        lblLogoRegCita = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Ventana Registro Citas");

        panelCita.setBackground(new java.awt.Color(255, 255, 255));
        panelCita.setForeground(new java.awt.Color(255, 255, 255));

        panelRegistroCita.setBackground(new java.awt.Color(255, 255, 255));
        panelRegistroCita.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Cita", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 1, 15))); // NOI18N
        panelRegistroCita.setToolTipText("Formulario para registrar una cita");

        lblCedulaCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblCedulaCita.setText("Cédula:");

        lblAsuntoRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblAsuntoRegistroCita.setText("Asunto:");

        lblFechaRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblFechaRegistroCita.setText("Fecha:");

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        jLabel1.setText("Datos del Cliente:");

        txtCedulaRegCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtCedulaRegCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaRegCitaActionPerformed(evt);
            }
        });

        txarAsuntoRegCita.setColumns(20);
        txarAsuntoRegCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txarAsuntoRegCita.setRows(5);
        jScrollPane1.setViewportView(txarAsuntoRegCita);

        lblHoraRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblHoraRegistroCita.setText("Hora:");

        lblFechaCreacRegCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblFechaCreacRegCita.setText("Fecha de Creación:");

        lblIdDueRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblIdDueRegistroCita.setText("ID de Dueño:");

        lblIdVetRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblIdVetRegistroCita.setText("ID de Veterinario:");

        lblIdUserRegistroCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        lblIdUserRegistroCita.setText("ID de Usuario:");

        cboxIdDueRegistroCita.setBackground(new java.awt.Color(102, 102, 102));
        cboxIdDueRegistroCita.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N

        cboxIdVetRegistroCita.setBackground(new java.awt.Color(102, 102, 102));
        cboxIdVetRegistroCita.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N

        cboxIdUserRegistroCita.setBackground(new java.awt.Color(102, 102, 102));
        cboxIdUserRegistroCita.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N

        txtFechaCreacRegCita.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        txtFechaCreacRegCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaCreacRegCitaActionPerformed(evt);
            }
        });

        cboxHoraRegCita.setBackground(new java.awt.Color(102, 102, 102));
        cboxHoraRegCita.setFont(new java.awt.Font("SansSerif", 1, 11)); // NOI18N
        cboxHoraRegCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "8:00 A.M", "10:00 A.M", "12:00 M.D", "3:00 P.M", "5:00 P.M", "7:00 P.M" }));
        cboxHoraRegCita.setToolTipText("Seleccione una hora disponible");

        javax.swing.GroupLayout panelRegistroCitaLayout = new javax.swing.GroupLayout(panelRegistroCita);
        panelRegistroCita.setLayout(panelRegistroCitaLayout);
        panelRegistroCitaLayout.setHorizontalGroup(
            panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                        .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                                .addComponent(lblFechaRegistroCita)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fechaRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lblIdUserRegistroCita, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRegistroCitaLayout.createSequentialGroup()
                                    .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                                            .addComponent(lblFechaCreacRegCita)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroCitaLayout.createSequentialGroup()
                                            .addComponent(lblHoraRegistroCita)
                                            .addGap(78, 78, 78)))
                                    .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtFechaCreacRegCita)
                                        .addComponent(cboxHoraRegCita, 0, 229, Short.MAX_VALUE))))
                            .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAsuntoRegistroCita)
                                    .addComponent(lblCedulaCita))
                                .addGap(65, 65, 65)
                                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(txtCedulaRegCita))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                        .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIdVetRegistroCita)
                            .addComponent(lblIdDueRegistroCita))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboxIdUserRegistroCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxIdDueRegistroCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboxIdVetRegistroCita, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15))))
        );
        panelRegistroCitaLayout.setVerticalGroup(
            panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(10, 10, 10)
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCedulaCita)
                    .addComponent(txtCedulaRegCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsuntoRegistroCita)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fechaRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFechaRegistroCita))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraRegistroCita)
                    .addComponent(cboxHoraRegCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                        .addComponent(lblFechaCreacRegCita)
                        .addGap(10, 30, Short.MAX_VALUE)
                        .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cboxIdDueRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIdDueRegistroCita))
                        .addGap(18, 18, 18)
                        .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroCitaLayout.createSequentialGroup()
                                .addGroup(panelRegistroCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblIdVetRegistroCita)
                                    .addComponent(cboxIdVetRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblIdUserRegistroCita)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRegistroCitaLayout.createSequentialGroup()
                                .addComponent(cboxIdUserRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))))
                    .addGroup(panelRegistroCitaLayout.createSequentialGroup()
                        .addComponent(txtFechaCreacRegCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        btnRegistroCita.setBackground(new java.awt.Color(255, 153, 0));
        btnRegistroCita.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        btnRegistroCita.setText("Registrar Cita");

        lblLogoRegCita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/rsz_2mimasc2.jpg"))); // NOI18N

        javax.swing.GroupLayout panelCitaLayout = new javax.swing.GroupLayout(panelCita);
        panelCita.setLayout(panelCitaLayout);
        panelCitaLayout.setHorizontalGroup(
            panelCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panelCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRegistroCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistroCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCitaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblLogoRegCita)
                    .addComponent(lblLogoCita))
                .addGap(82, 82, 82))
        );
        panelCitaLayout.setVerticalGroup(
            panelCitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCitaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogoCita)
                .addGap(18, 18, 18)
                .addComponent(lblLogoRegCita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(panelRegistroCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnRegistroCita)
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelCita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCedulaRegCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaRegCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaRegCitaActionPerformed

    private void txtFechaCreacRegCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaCreacRegCitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaCreacRegCitaActionPerformed

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
            java.util.logging.Logger.getLogger(frmRegistroCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmRegistroCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmRegistroCita rgcit = new frmRegistroCita();
                ControllerRegistroCita con = new ControllerRegistroCita(rgcit);
                con.iniciar();
                rgcit.setVisible(true);
                rgcit.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnRegistroCita;
    public javax.swing.JComboBox<String> cboxHoraRegCita;
    public javax.swing.JComboBox<String> cboxIdDueRegistroCita;
    public javax.swing.JComboBox<String> cboxIdUserRegistroCita;
    public javax.swing.JComboBox<String> cboxIdVetRegistroCita;
    public com.toedter.calendar.JDateChooser fechaRegistroCita;
    public javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lblAsuntoRegistroCita;
    public javax.swing.JLabel lblCedulaCita;
    public javax.swing.JLabel lblFechaCreacRegCita;
    public javax.swing.JLabel lblFechaRegistroCita;
    public javax.swing.JLabel lblHoraRegistroCita;
    public javax.swing.JLabel lblIdDueRegistroCita;
    public javax.swing.JLabel lblIdUserRegistroCita;
    public javax.swing.JLabel lblIdVetRegistroCita;
    public javax.swing.JLabel lblLogoCita;
    private javax.swing.JLabel lblLogoRegCita;
    private javax.swing.JLabel lblMiMascVet;
    private javax.swing.JPanel panelCita;
    public javax.swing.JPanel panelRegistroCita;
    public javax.swing.JTextArea txarAsuntoRegCita;
    public javax.swing.JTextField txtCedulaRegCita;
    public javax.swing.JTextField txtFechaCreacRegCita;
    // End of variables declaration//GEN-END:variables

    private void setLocationRelativeTo(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
    
}
