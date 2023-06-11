
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import vista.frmVentanaPrincipal;
import modelo.CitaDAO;//
import modelo.Cita;//
import modelo.Dueno;//
import modelo.DuenoDAO;//
import modelo.Mascota;
import vista.frmRegistroCita;
import vista.frmVentanaPrincipal;
import helpers.Helpers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.text.ParseException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.MascotaDAO;//
import modelo.Usuario;//
import modelo.UsuarioDAO;
import modelo.Veterinario;
import modelo.VeterinarioDAO;
import vista.frmMascota;

/**
 *
 * @author two_r
 */
public class ControllerRegistroCita implements ActionListener {

    Usuario usuario = new Usuario();//
    UsuarioDAO udao = new UsuarioDAO();
    Dueno dueno = new Dueno();//
    DuenoDAO dao = new DuenoDAO();//
    Cita cita = new Cita();//
    CitaDAO cdao = new CitaDAO();//
    Veterinario veterinario = new Veterinario();
   VeterinarioDAO vdao = new VeterinarioDAO();
    frmRegistroCita vistaCita = new frmRegistroCita();//
    Helpers help = new Helpers();//    
    DefaultTableModel modelo = new DefaultTableModel();
    
@Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaCita.btnRegistroCita) {

            if (vistaCita.txtCedulaRegCita.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vistaCita, "Debe ingresar su numero de cédula", "Agregar Cedula", JOptionPane.INFORMATION_MESSAGE);
                
            } else if (vistaCita.txarAsuntoRegCita.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaCita, "Debe ingresar el asunto de la cita", "Agregar Asunto.", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaCita.fechaRegistroCita.getInheritsPopupMenu()) {

                JOptionPane.showMessageDialog(vistaCita, "Debe ingresar la Fecha de la cita.", "Agregar Fecha.", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaCita.cboxHoraRegCita.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaCita, "Debe seleccionar una hora disponible para la cita", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaCita.txtFechaCreacRegCita.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaCita, "Debe introducir la Fecha de Creación de la Cita", "Agregar Fecha de Creación.", JOptionPane.INFORMATION_MESSAGE);

            }else if (vistaCita.cboxIdDueRegistroCita.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaCita, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }else if (vistaCita.cboxIdVetRegistroCita.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaCita, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }else if (vistaCita.cboxIdUserRegistroCita.getSelectedIndex() == -1) { 

                JOptionPane.showMessageDialog(vistaCita, "Debe seleccionar una opcion", "Seleccionar Opcion", JOptionPane.INFORMATION_MESSAGE);

            }
         
    }

      } public ControllerRegistroCita(frmRegistroCita frm){

        this.vistaCita = frm;
        this.vistaCita.btnRegistroCita.addActionListener(this);
        this.vistaCita.cboxHoraRegCita.addActionListener(this);
        this.vistaCita.cboxIdDueRegistroCita.addActionListener(this);
        this.vistaCita.cboxIdVetRegistroCita.addActionListener(this);
        this.vistaCita.cboxIdUserRegistroCita.addActionListener(this);
        
    }
     public void agregarCita() {
        Dueno due = new Dueno();
        Veterinario vet = new Veterinario();
        Usuario user = new Usuario();
        String cedulaCita = vistaCita.txtCedulaRegCita.getText();
        String asuntoCita = vistaCita.txarAsuntoRegCita.getText();
        java.sql.Date sqlDate = new java.sql.Date(vistaCita.fechaRegistroCita.getDate().getTime());
        Date fechaCita = sqlDate;
        String horaCita = vistaCita.cboxHoraRegCita.getSelectedItem().toString();
        String fechaCreacionCit = vistaCita.txtFechaCreacRegCita.getText();
        
        due.setCedulaDue(cedulaCita);
        cita.setCedula(due);
        cita.setAsunto(asuntoCita);
        cita.setFecha(fechaCita);
        cita.setHora(horaCita);
        cita.setFechaCreacion(fechaCreacionCit);
        due.setIdDueno(0);
        cita.setIdDueno(due);
        vet.setIdVeterinario(0);
        cita.setIdVeterinario(vet);
        user.setIdUsuario(0);
        cita.setIdUsuario(user);
        int r = cdao.agregarCita(cita);
        if (r == 1) {

            JOptionPane.showMessageDialog(vistaCita, "Cita Agregada con Éxito.");
           
        } else {

            JOptionPane.showMessageDialog(vistaCita, "Cita NO Agregada con Éxito.");
        }
    }
     
 public void cargarComboIdDueno(){
     dao.cargarComboDueno(vistaCita.cboxIdDueRegistroCita);
 }
 
  public void cargarComboIdVeterinario(){
     vdao.cargarComboIdVeterinario(vistaCita.cboxIdVetRegistroCita);
 }
  public void cargarComboIdUsuario(){
     udao.cargarComboIdUsuario(vistaCita.cboxIdUserRegistroCita);
 }
  
  public void iniciar(){
    
        
    }

}

