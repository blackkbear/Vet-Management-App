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
import modelo.Dueno;
import modelo.DuenoDAO;
import modelo.Mascota;
import modelo.MascotaDAO;
import vista.frmMascota;

/**
 *
 * @author JOSH
 */
public class ControllerMascota implements ActionListener {
    DuenoDAO daoDue = new DuenoDAO();
    MascotaDAO daoMas = new MascotaDAO();
    Mascota mas = new Mascota();
    frmMascota vistaMascota = new frmMascota();
    DefaultTableModel modelo = new DefaultTableModel();
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaMascota.btnGuardarMasc) {

            if (vistaMascota.txtNombreMasc.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe ingresar el nombre de la Mascota", "Agregar Mascota", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxGeneroMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxTipoMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxRazaMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxActivoMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }else if (vistaMascota.cbDueno.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }
            else {

                agregarMascota();

            }

        }
        if (e.getSource() == vistaMascota.btnEditarMasc) {

            if (vistaMascota.txtNombreMasc.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe ingresar el nombre de la Mascota", "Agregar Mascota", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxGeneroMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxTipoMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxRazaMasc.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaMascota.cboxActivoMasc.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaMascota.cbDueno.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaMascota, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }
            else {

                actualizarMascota();

            }

        }
        
         if (e.getSource() == vistaMascota.cbDueno) {

            daoDue.cargarComboIdDueno(vistaMascota.cbDueno,vistaMascota.txtIdDueno);

        }
        if (e.getSource() == vistaMascota.btnCancelarMasc) {

            limpiarCampos();

        }
        if (e.getSource() == vistaMascota.btnRefrescarMasc) {

            listarMascota(vistaMascota.tableMascota);
            limpiarCampos();

        }
        if (e.getSource() == vistaMascota.btnEliminarMasc) {

            eliminarMascota();

        }

        if (e.getSource() == vistaMascota.btnBuscarMasc) {

            FiltrarTablaPorNombre(vistaMascota.tableMascota, vistaMascota.txtBuscarNombreMasc.getText());

        }

    }

    public ControllerMascota(frmMascota frm) {

        this.vistaMascota = frm;
        this.vistaMascota.btnGuardarMasc.addActionListener(this);
        this.vistaMascota.btnEditarMasc.addActionListener(this);
        this.vistaMascota.btnCancelarMasc.addActionListener(this);
        this.vistaMascota.btnBuscarMasc.addActionListener(this);
        this.vistaMascota.btnRefrescarMasc.addActionListener(this);
        this.vistaMascota.btnEliminarMasc.addActionListener(this);
        this.vistaMascota.cbDueno.addActionListener(this);
        
        
    }
     public void agregarMascota() {
        Dueno due = new Dueno();
        String nombreMas = vistaMascota.txtNombreMasc.getText();
        String generoMas = vistaMascota.cboxGeneroMasc.getSelectedItem().toString();
        String tipo = vistaMascota.cboxTipoMasc.getSelectedItem().toString();
        String raza = vistaMascota.cboxRazaMasc.getSelectedItem().toString();
        String activoMas = vistaMascota.cboxActivoMasc.getSelectedItem().toString();
        Integer idDueno = Integer.valueOf(vistaMascota.txtIdDueno.getText());  
        mas.setNombreMas(nombreMas);
        mas.setGeneroMas(generoMas);
        mas.setTipo(tipo);
        mas.setRaza(raza);
        mas.setActivoMas(activoMas);
        due.setIdDueno(idDueno);
        mas.setIdDueno(due);
        int r = daoMas.agregarMascota(mas);
        if (r == 1) {

            JOptionPane.showMessageDialog(vistaMascota, "Mascota Agregada con exito.");
            listarMascota(vistaMascota.tableMascota);
        } else {

            JOptionPane.showMessageDialog(vistaMascota, "Mascota NO Agregada.");
        }
    }
     
      public void actualizarMascota() {
    Dueno due = new Dueno();
        if (vistaMascota.txtIdMasc.getText().equals("")) {
            JOptionPane.showMessageDialog(vistaMascota, "No se Identifica el ID, debe seleccionar un registro en la tabla");
        } else {
            int idMascota = Integer.parseInt(vistaMascota.txtIdMasc.getText());
        
        String nombreMas = vistaMascota.txtNombreMasc.getText();
        String generoMas = vistaMascota.cboxGeneroMasc.getSelectedItem().toString();
        String tipo = vistaMascota.cboxTipoMasc.getSelectedItem().toString();
        String raza = vistaMascota.cboxRazaMasc.getSelectedItem().toString();
        String activoMas = vistaMascota.cboxActivoMasc.getSelectedItem().toString();
        Integer idDueno = Integer.valueOf(vistaMascota.txtIdDueno.getText());
        mas.setIdMascota(idMascota);
        mas.setNombreMas(nombreMas);
        mas.setGeneroMas(generoMas);
        mas.setTipo(tipo);
        mas.setRaza(raza);
        mas.setActivoMas(activoMas);
        due.setIdDueno(idDueno);
        mas.setIdDueno(due);
        int r = daoMas.actualizarMascota(mas);
            if (r == 1) {

                JOptionPane.showMessageDialog(vistaMascota, "Mascota Actualizada con exito.");
                listarMascota(vistaMascota.tableMascota);
            } else {

                JOptionPane.showMessageDialog(vistaMascota, "Mascota NO fue Actualizado.");
            }

        }
      }
      
     public void listarMascota(JTable tabla) {
        limpiarTabla(tabla, modelo);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Mascota> lista = daoMas.listarMascota();
        Object[] objeto = new Object[15];

        for (int i = 0; i < lista.size(); i++) {
            
            objeto[0] = lista.get(i).getIdMascota();
            objeto[1] = lista.get(i).getNombreMas();
            objeto[2] = lista.get(i).getGeneroMas();
            objeto[3] = lista.get(i).getTipo();
            objeto[4] = lista.get(i).getRaza();
            objeto[5] = lista.get(i).getActivoMas();
            objeto[6] = lista.get(i).getIdDueno().getIdDueno();
            modelo.addRow(objeto);

        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }

    public void iniciar() {

        listarMascota(vistaMascota.tableMascota);
        limpiarCampos();
    }

    public void limpiarTabla(JTable table, DefaultTableModel model) {

        for (int i = 0; i < table.getRowCount(); i++) {

            model.removeRow(i);
            i = i - 1;

        }

    }

    public void limpiarCampos() {

        vistaMascota.txtIdMasc.setText("");
        cargarComboMascotaDueno();
        vistaMascota.txtNombreMasc.setText("");
        cargarComboMascotaDueno();
        vistaMascota.cboxGeneroMasc.setSelectedItem(0);
        cargarComboMascotaDueno();
        vistaMascota.cboxTipoMasc.setSelectedItem(0);
        cargarComboMascotaDueno();
        vistaMascota.cboxRazaMasc.setSelectedItem(0);
        cargarComboMascotaDueno();
        vistaMascota.cboxActivoMasc.setSelectedItem(0);
        cargarComboMascotaDueno();
        vistaMascota.txtIdDueno.setText("");
        cargarComboMascotaDueno();
        

    }
         public void eliminarMascota() {

        int fila = vistaMascota.tableMascota.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaMascota.tableMascota, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vistaMascota.tableMascota.getValueAt(fila, 0).toString());
            daoMas.eliminar(id);
            JOptionPane.showMessageDialog(vistaMascota, "Mascota eliminada con exito");
            listarMascota(vistaMascota.tableMascota);
            limpiarCampos();
        }

    }
         public void FiltrarTablaPorNombre(JTable table, String filtro) {

        daoMas.filtrarTablaPorMascota(table, filtro);

    }
 public void cargarComboMascotaDueno(){
     daoDue.cargarComboDueno(vistaMascota.cbDueno);
 }

}
     