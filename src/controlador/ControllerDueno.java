/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author two_r
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Dueno;
import modelo.DuenoDAO;
import vista.frmDueno;

public class ControllerDueno implements ActionListener {
    
    DuenoDAO dao = new DuenoDAO();
    Dueno d = new Dueno();
    DefaultTableModel modelo = new DefaultTableModel();
    frmDueno vistaDueno = new frmDueno();
    
    public ControllerDueno(frmDueno frm) {

        this.vistaDueno = frm;
        this.vistaDueno.btnGuardarDueno.addActionListener(this);
        this.vistaDueno.btnEditarDueno.addActionListener(this);
        this.vistaDueno.btnCancelarDueno.addActionListener(this);
        this.vistaDueno.btnRefrescarDueno.addActionListener(this);
        this.vistaDueno.btnEliminarDueno.addActionListener(this);
        this.vistaDueno.btnBuscarDue.addActionListener(this);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaDueno.btnGuardarDueno) {
            
            if (vistaDueno.txtNombreDueno.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar el nombre", "Agregar Dueño", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txt1ApellidoDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su primer Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txt2ApellidoDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su segundo Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtCedulaDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su numero de cédula", "Agregar Cedula", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.cboxGeneroDue.getSelectedIndex()== -1) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe seleccionar su género", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtEmailDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su correo electrónico", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtTelfDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su número telefónico", "Agregar Telefono", JOptionPane.INFORMATION_MESSAGE);

            } else {
                agregarDueno();
            }

        }

        if (e.getSource() == vistaDueno.btnEditarDueno) {
            if (vistaDueno.txtNombreDueno.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar el nombre", "Agregar Dueño", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txt1ApellidoDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su primer Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txt2ApellidoDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su segundo Apellido", "Agregar Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtCedulaDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su numero de cedula", "Agregar Cedula", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.cboxGeneroDue.getSelectedIndex()== -1) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe seleccionar su género", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtEmailDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su correo electronico", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaDueno.txtTelfDue.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaDueno, "Debe ingresar su numero telefonico", "Agregar Telefono", JOptionPane.INFORMATION_MESSAGE);

            } else {
                actualizarDueno();
            }
        }

        if (e.getSource() == vistaDueno.btnCancelarDueno) {
            limpiarCampos();
        }
        if (e.getSource() == vistaDueno.btnRefrescarDueno) {
            listarDueno(vistaDueno.tableDueno);
            limpiarCampos();
        }
        if (e.getSource() == vistaDueno.btnEliminarDueno) {
            eliminarDueno();
        }
        if (e.getSource() == vistaDueno.btnBuscarDue) {
            FiltrarTablaPorNombre(vistaDueno.tableDueno, vistaDueno.txtBuscarNombreDue.getText());
        }

    }
    
    
    
    //Agregar Dueño nuevo
    
    public void agregarDueno(){
        String nombreDueno = vistaDueno.txtNombreDueno.getText();
        String apellido1 = vistaDueno.txt1ApellidoDue.getText();
        String apellido2 = vistaDueno.txt2ApellidoDue.getText();
        String cedula = vistaDueno.txtCedulaDue.getText();
        String generoDueno = vistaDueno.cboxGeneroDue.getSelectedItem().toString();
        String email = vistaDueno.txtEmailDue.getText();
        String telefono = vistaDueno.txtTelfDue.getText();
        String direccion = vistaDueno.txtDireccionDue.getText();
        d.setNombreDue(nombreDueno);
        d.setApellido1Due(apellido1);
        d.setApellido2Due(apellido2);
        d.setCedulaDue(cedula);
        d.setGeneroDue(generoDueno);
        d.setEmailDue(email);
        d.setTelefonoDue(telefono);
        d.setDireccionDue(direccion);
        int r = dao.agregarDueno(d);
        if(r == 1){
            JOptionPane.showMessageDialog(vistaDueno, "Dueño Agregado con Exito.");
            listarDueno(vistaDueno.tableDueno);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vistaDueno, "Dueño NO fue Agregado.");
        }
    }

    //Actualizar Dueño
    public void actualizarDueno() {
        if (vistaDueno.txtIdDuenoFrm.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaDueno, "No se Identifica el ID, debe seleccionar un registro en la tabla");
        } else {
            int idDueno = Integer.parseInt(vistaDueno.txtIdDuenoFrm.getText());
            String nombreDueno = vistaDueno.txtNombreDueno.getText();
            String apellido1 = vistaDueno.txt1ApellidoDue.getText();
            String apellido2 = vistaDueno.txt2ApellidoDue.getText();
            String cedula = vistaDueno.txtCedulaDue.getText();
            String generoDueno = vistaDueno.cboxGeneroDue.getSelectedItem().toString();
            String email = vistaDueno.txtEmailDue.getText();
            String telefono = vistaDueno.txtTelfDue.getText();
            String direccion = vistaDueno.txtDireccionDue.getText();
            d.setIdDueno((idDueno));
            d.setNombreDue(nombreDueno);
            d.setApellido1Due(apellido1);
            d.setApellido2Due(apellido2);
            d.setCedulaDue(cedula);
            d.setGeneroDue(generoDueno);
            d.setEmailDue(email);
            d.setTelefonoDue(telefono);
            d.setDireccionDue(direccion);
            int r = dao.actualizarDueno(d);
            if (r == 1) {
                JOptionPane.showMessageDialog(vistaDueno, "Dueno Actualizado con exito.");
                listarDueno(vistaDueno.tableDueno);
                limpiarCampos();
                
                
            } else {
                JOptionPane.showMessageDialog(vistaDueno, "Usuario NO fue Actualizado.");
            }
        }
    }

    /**
     * Listar Dueños
     *
     * @param tabla
     */
    
    public void listarDueno(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Dueno> lista = dao.listarDueno();
        Object[] objeto = new Object[100];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdDueno();
            objeto[1] = lista.get(i).getNombreDue();
            objeto[2] = lista.get(i).getApellido1Due();
            objeto[3] = lista.get(i).getApellido2Due();
            objeto[4] = lista.get(i).getCedulaDue();
            objeto[5] = lista.get(i).getGeneroDue();
            objeto[6] = lista.get(i).getEmailDue();
            objeto[7] = lista.get(i).getTelefonoDue();
            objeto[8] = lista.get(i).getDireccionDue();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    
    public void iniciar() {
        listarDueno(vistaDueno.tableDueno);
        limpiarCampos();
    }
    
    /**
    * Limpiar Tabla
    * @param table
    * @param model 
    */
    public void limpiarTabla() {
        for (int i = 0; i < vistaDueno.tableDueno.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }
    
    /**
     * Limpiar Campos
     */
    public void limpiarCampos() {
        vistaDueno.txtIdDuenoFrm.setText("");
        vistaDueno.txtNombreDueno.setText("");
        vistaDueno.txt1ApellidoDue.setText("");
        vistaDueno.txt2ApellidoDue.setText("");
        vistaDueno.txtCedulaDue.setText("");
        vistaDueno.cboxGeneroDue.setSelectedItem(0);
        vistaDueno.txtEmailDue.setText("");
        vistaDueno.txtTelfDue.setText("");
        vistaDueno.txtDireccionDue.setText("");
        vistaDueno.txtBuscarNombreDue.setText("");
    }
    
    /**
     * Eliminar Dueño
     */

    public void eliminarDueno() {
        int fila = vistaDueno.tableDueno.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaDueno.tableDueno, "Debe Seleccionar una Fila");
        } else {
            int id = Integer.parseInt((String) vistaDueno.tableDueno.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(vistaDueno, "Usuario eliminado");
            listarDueno(vistaDueno.tableDueno);
            limpiarCampos();
        }
    }
    
    /**
     * Filtrar tabla por nombre
     * @param table
     * @param filtro 
     */

    public void FiltrarTablaPorNombre(JTable table, String filtro) {
        limpiarTabla();
        dao.filtrarTablaPorDueno(table, filtro);
        
        
    }
 
    
}
