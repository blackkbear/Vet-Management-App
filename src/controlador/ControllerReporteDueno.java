/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Cita;
import modelo.CitaDAO;
import modelo.Dueno;
import modelo.DuenoDAO;
import modelo.MascotaDAO;
import modelo.Usuario;
import modelo.UsuarioDAO;
import modelo.Veterinario;
import modelo.VeterinarioDAO;
import vista.frmDueno;
import vista.frmReporteDueno;

/**
 *
 * @author JOSH
 */
public class ControllerReporteDueno implements ActionListener{
    Cita ci = new Cita();
    CitaDAO cidao = new CitaDAO();
    MascotaDAO madao = new MascotaDAO();
    Dueno due = new Dueno();
    DuenoDAO duedao = new DuenoDAO();
    Usuario user = new Usuario();
    UsuarioDAO userDao = new UsuarioDAO();
    Veterinario vete = new Veterinario();
    VeterinarioDAO veteDao = new VeterinarioDAO();
    frmReporteDueno vistaReDueno = new frmReporteDueno();
    DefaultTableModel modelo = new DefaultTableModel();

 public ControllerReporteDueno(frmReporteDueno frm) {

        this.vistaReDueno = frm;

        this.vistaReDueno.btnBuscarCedReporteDue.addActionListener(this);
        this.vistaReDueno.btnImprimirReporteDueno.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaReDueno.btnBuscarCedReporteDue) {
            FiltrarTablaPorDueno(vistaReDueno.tableReporteDueno, vistaReDueno.cboxCedReporteDue.getActionCommand());
        }
        if (e.getSource() == vistaReDueno.btnImprimirReporteDueno) {
        }
    }

public void listarDuenoPorCedula(JTable tabla) {
        limpiarTabla();
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Cita> lista = cidao.listarCita();
        Object[] objeto = new Object[100];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getIdCita();
            objeto[1] = lista.get(i).getAsunto();
            objeto[2] = lista.get(i).getFecha();
            objeto[3] = lista.get(i).getHora();
            objeto[4] = lista.get(i).getFechaCreacion();
            objeto[5] = lista.get(i).getIdDueno().getIdDueno();
            objeto[6] = lista.get(i).getCedula().getCedulaDue();
            objeto[7] = lista.get(i).getIdVeterinario().getIdVeterinario();
            objeto[8] = lista.get(i).getIdUsuario().getIdUsuario();
            modelo.addRow(objeto);
        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);
    }
    public void iniciar() {
        listarDuenoPorCedula(vistaReDueno.tableReporteDueno);
       
    }
    
     public void limpiarTabla() {
        for (int i = 0; i < vistaReDueno.tableReporteDueno.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void FiltrarTablaPorDueno(JTable table, String filtro) {
        limpiarTabla();
        duedao.filtrarTablaPorDueno(table, filtro);

    }

    public void cargarComboCedulaDuenoMascota() {

        duedao.cargarComboDueno(vistaReDueno.cboxCedReporteDue);
    }

}
