/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Usuario;
import modelo.Veterinario;
import modelo.VeterinarioDAO;
import vista.frmVeterinario;

/**
 *
 * @author JOSH
 */
public class ControllerVeterinario implements ActionListener {

    VeterinarioDAO daoVete = new VeterinarioDAO();
    Veterinario vet = new Veterinario();
    frmVeterinario vistaVeterinario = new frmVeterinario();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControllerVeterinario(frmVeterinario frm) {

        this.vistaVeterinario = frm;
        this.vistaVeterinario.btnGuardarVet.addActionListener(this);
        this.vistaVeterinario.btnEditarVet.addActionListener(this);
        this.vistaVeterinario.btnCancelarVet.addActionListener(this);
        this.vistaVeterinario.btnRefrescarVet.addActionListener(this);
        this.vistaVeterinario.btnEliminarVet.addActionListener(this);
        this.vistaVeterinario.btnBuscarVet.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaVeterinario.btnGuardarVet) {

            if (vistaVeterinario.txtNombreVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar el nombre", "Agregar Veterinario", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txt1ApellidoVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su primer Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txt2ApellidoVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su segundo Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtCedulaVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su numero de cédula", "Agregar Cedula", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtCodProfVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su código", "Ingresar", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtEmailVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su correo electrónico", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtTelfVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su número telefónico", "Agregar Telefono", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtDireccionVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar la Direccion", "Agregar", JOptionPane.INFORMATION_MESSAGE);

            } else {
                agregarVeterinario();
            }

        }
        if (e.getSource() == vistaVeterinario.btnEditarVet) {

            if (vistaVeterinario.txtNombreVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar el nombre", "Agregar Veterinario", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txt1ApellidoVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su primer Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txt2ApellidoVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su segundo Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtCedulaVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su numero de cédula", "Agregar Cedula", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtCodProfVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su código", "Ingresar", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtEmailVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su correo electrónico", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtTelfVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar su número telefónico", "Agregar Telefono", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaVeterinario.txtDireccionVetFrm.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaVeterinario, "Debe ingresar la Direccion", "Agregar", JOptionPane.INFORMATION_MESSAGE);

            } else {
                actualizarVeterinario();
            }
        }
        if (e.getSource() == vistaVeterinario.btnCancelarVet) {
            limpiarCampos();
        }
        if (e.getSource() == vistaVeterinario.btnEditarVet) {
            listarVeterinario(vistaVeterinario.tableVet);
            limpiarCampos();
        }
        if (e.getSource() == vistaVeterinario.btnEliminarVet) {
            eliminarVeterinario();
        }
        if (e.getSource() == vistaVeterinario.btnBuscarVet) {
            FiltrarTablaPorNombre(vistaVeterinario.tableVet, vistaVeterinario.txtBuscarNombreVet.getText());
        }

    }


    

    public void agregarVeterinario() {
        String nombre = vistaVeterinario.txtNombreVetFrm.getText();
        String apellido1 = vistaVeterinario.txt1ApellidoVetFrm.getText();
        String apellido2 = vistaVeterinario.txt2ApellidoVetFrm.getText();
        String cedula = vistaVeterinario.txtCedulaVetFrm.getText();
        String codigoPro = vistaVeterinario.txtCodProfVetFrm.getText();
        String email = vistaVeterinario.txtEmailVetFrm.getText();
        String telefono = vistaVeterinario.txtTelfVetFrm.getText();
        String direccion = vistaVeterinario.txtDireccionVetFrm.getText();
        String activo = vistaVeterinario.cboxActivoVetFrm.getSelectedItem().toString();
        vet.setNombreVet(nombre);
        vet.setApellido1Vet(apellido1);
        vet.setApellido2Vet(apellido2);
        vet.setCedulaVet(cedula);
        vet.setCodProfesional(codigoPro);
        vet.setEmailVet(email);
        vet.setTelefonoVet(telefono);
        vet.setDirecionVet(direccion);
        vet.setActivoVet(activo);
        int r = daoVete.agregarVeterinario(vet);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaVeterinario, "Veterinario Agregado con Exito.");
            listarVeterinario(vistaVeterinario.tableVet);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vistaVeterinario, "Veterinario NO fue Agregado con Exito.");
        }
    }

    public void actualizarVeterinario() {

        if (vistaVeterinario.txtIdVetFrm.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaVeterinario, "No se Identifica el ID, debe seleccionar un registro en la tabla");
        } else {

            int idUsuario = Integer.parseInt(vistaVeterinario.txtIdVetFrm.getText());
            String nombre = vistaVeterinario.txtNombreVetFrm.getText();
            String apellido1 = vistaVeterinario.txt1ApellidoVetFrm.getText();
            String apellido2 = vistaVeterinario.txt2ApellidoVetFrm.getText();
            String cedula = vistaVeterinario.txtCedulaVetFrm.getText();
            String codigoPro = vistaVeterinario.txtCodProfVetFrm.getText();
            String email = vistaVeterinario.txtEmailVetFrm.getText();
            String telefono = vistaVeterinario.txtTelfVetFrm.getText();
            String direccion = vistaVeterinario.txtDireccionVetFrm.getText();
            String activo = vistaVeterinario.cboxActivoVetFrm.getSelectedItem().toString();
            vet.setIdVeterinario(idUsuario);
            vet.setNombreVet(nombre);
            vet.setApellido1Vet(apellido1);
            vet.setApellido2Vet(apellido2);
            vet.setCedulaVet(cedula);
            vet.setCodProfesional(codigoPro);
            vet.setEmailVet(email);
            vet.setTelefonoVet(telefono);
            vet.setDirecionVet(direccion);
            vet.setActivoVet(activo);
            int r = daoVete.actualizarVeterinario(vet);
            if (r == 1) {

                JOptionPane.showMessageDialog(vistaVeterinario, "Veterinario Actualizado con exito.");
                listarVeterinario(vistaVeterinario.tableVet);
                limpiarCampos();
            } else {

                JOptionPane.showMessageDialog(vistaVeterinario, "Veterinario NO fue Actualizado con exito.");
            }

        }
    }
 public void listarVeterinario(JTable tabla) {
        limpiarTabla(tabla, modelo);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Veterinario> lista = daoVete.listarVeterinario();
        Object[] objeto = new Object[100];

        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getIdVeterinario();
            objeto[1] = lista.get(i).getNombreVet();
            objeto[2] = lista.get(i).getApellido1Vet();
            objeto[3] = lista.get(i).getApellido2Vet();
            objeto[4] = lista.get(i).getCedulaVet();
            objeto[5] = lista.get(i).getCodProfesional();
            objeto[6] = lista.get(i).getEmailVet();
            objeto[7] = lista.get(i).getTelefonoVet();
            objeto[8] = lista.get(i).getDirecionVet();
            objeto[9] = lista.get(i).getActivoVet();
            modelo.addRow(objeto);

        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }
        
        public void iniciar() {

        listarVeterinario(vistaVeterinario.tableVet);
        limpiarCampos();
    }
    
    public void limpiarTabla(JTable table, DefaultTableModel model) {

        for (int i = 0; i < table.getRowCount(); i++) {

            model.removeRow(i);
            i = i - 1;

        }

    }
   
    public void limpiarCampos() {

        vistaVeterinario.txtIdVetFrm.setText("");
        vistaVeterinario.txtNombreVetFrm.setText("");
        vistaVeterinario.txt1ApellidoVetFrm.setText("");
        vistaVeterinario.txt2ApellidoVetFrm.setText("");
        vistaVeterinario.txtCedulaVetFrm.setText("");
        vistaVeterinario.txtCodProfVetFrm.setText("");
        vistaVeterinario.txtEmailVetFrm.setText("");
        vistaVeterinario.txtTelfVetFrm.setText("");
        vistaVeterinario.txtDireccionVetFrm.setText("");
        vistaVeterinario.cboxActivoVetFrm.setSelectedItem(0);

    }
     public void eliminarVeterinario() {

        int fila = vistaVeterinario.tableVet.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaVeterinario.tableVet, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vistaVeterinario.tableVet.getValueAt(fila, 0).toString());
            daoVete.eliminar(id);
            JOptionPane.showMessageDialog(vistaVeterinario, "Veterinario eliminado con exito");
            listarVeterinario(vistaVeterinario.tableVet);
            limpiarCampos();
        }

    }
       public void FiltrarTablaPorNombre(JTable table, String filtro) {

        daoVete.filtrarTablaPorVeterinario(table, filtro);

    } 
        
        
        
        
        
        
        
        
        
        
        
        

    
    
    
    
    
    
    
    
    
    
    
    
    
}
