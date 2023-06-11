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
import modelo.UsuarioDAO;
import vista.frmUsuario;
import vista.frmVentanaPrincipal;

/**
 *
 * @author JOSH
 */
public class ControllerUsuario implements ActionListener {

    UsuarioDAO dao = new UsuarioDAO();
    Usuario user = new Usuario();
    frmUsuario vistaUsuario = new frmUsuario();
    DefaultTableModel modelo = new DefaultTableModel();

    public ControllerUsuario(frmUsuario frm) {

        this.vistaUsuario = frm;
        this.vistaUsuario.btnGuardarUser.addActionListener(this);
        this.vistaUsuario.btnEditarUser.addActionListener(this);
        this.vistaUsuario.btnCancelarUser.addActionListener(this);
        this.vistaUsuario.btnRefrescarUser.addActionListener(this);
        this.vistaUsuario.btnEliminarUser.addActionListener(this);
        this.vistaUsuario.btnBuscarUser.addActionListener(this);
    }

    public ControllerUsuario(frmVentanaPrincipal u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaUsuario.btnGuardarUser) {

            if (vistaUsuario.txtNombre.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el nombre del Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.txt1ApellidoUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Primer Apellido", "Agregar Primer Apellido", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.txt2ApellidoUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Segundo Apellido", "Agregar Segundo Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtEmailUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Email", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtNombreUsuario.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Nombre de Usuario", "Agregar Nombre Usuario", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtPasswordUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar la Contraseña", "Agregar Contraseña", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.cboxTipoUserFrm.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe de seleccionar un tipo de usuario", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.cboxActivo.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe de seleccionar un tipo", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            } else {

                agregarUsuario();

            }

        }
        if (e.getSource() == vistaUsuario.btnEditarUser) {

            if (vistaUsuario.txtNombre.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el nombre del Usuario", "Agregar Usuario", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.txt1ApellidoUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Primer Apellido", "Agregar Primer Apellido", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.txt2ApellidoUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Segundo Apellido", "Agregar Segundo Apellido", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtEmailUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Email", "Agregar Email", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtNombreUsuario.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar el Nombre de Usuario", "Agregar Nombre Usuario", JOptionPane.INFORMATION_MESSAGE);

            } else if (vistaUsuario.txtPasswordUser.getText().isEmpty()) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe ingresar la Contraseña", "Agregar Contraseña", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.cboxTipoUserFrm.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe de seleccionar un tipo de usuario", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            } else if (vistaUsuario.cboxActivo.getSelectedIndex() == -1) {

                JOptionPane.showMessageDialog(vistaUsuario, "Debe de seleccionar un tipo", "Seleccionar", JOptionPane.INFORMATION_MESSAGE);
            } else {

                actualizarUsuario();

            }

        }
        if (e.getSource() == vistaUsuario.btnCancelarUser) {

            limpiarCampos();

        }
        if (e.getSource() == vistaUsuario.btnRefrescarUser) {

            listarUsuario(vistaUsuario.tableUser);
            limpiarCampos();

        }
        if (e.getSource() == vistaUsuario.btnEliminarUser) {

            eliminarUsuario();

        }

        if (e.getSource() == vistaUsuario.btnBuscarUser) {

            FiltrarTablaPorNombre(vistaUsuario.tableUser, vistaUsuario.txtBuscarNombreUser.getText());

        }

    }
    
    public void agregarUsuario() {
        String nombre = vistaUsuario.txtNombre.getText();
        String apellido1 = vistaUsuario.txt1ApellidoUser.getText();
        String apellido2 = vistaUsuario.txt2ApellidoUser.getText();
        String email = vistaUsuario.txtEmailUser.getText();
        String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
        String password = vistaUsuario.txtPasswordUser.getText();
        String tipoUsuario = vistaUsuario.cboxTipoUserFrm.getSelectedItem().toString();
        String activo = vistaUsuario.cboxActivo.getSelectedItem().toString();
        user.setNombreUser(nombre);
        user.setApellido1User(apellido1);
        user.setApellido2User(apellido2);
        user.setEmailUser(email);
        user.setNombreUsuario(nombreUsuario);
        user.setPassword(password);
        user.setTipoUsuario(tipoUsuario);
        user.setActivoUser(activo);
        int r = dao.agregarUsuario(user);
        if (r == 1) {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario Agregado con Exito.");
            listarUsuario(vistaUsuario.tableUser);
            limpiarCampos();
        } else {
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario NO fue Agregado con Exito.");
        }
    }

     public void actualizarUsuario() {

         if (vistaUsuario.txtIdUserFrm.getText().equals("")) {
             JOptionPane.showMessageDialog(vistaUsuario, "No se Identifica el ID, debe seleccionar un registro en la tabla");
         } else {
             
             int idUsuario = Integer.parseInt(vistaUsuario.txtIdUserFrm.getText());
             String nombre = vistaUsuario.txtNombre.getText();
             String apellido1 = vistaUsuario.txt1ApellidoUser.getText();
             String apellido2 = vistaUsuario.txt2ApellidoUser.getText();
             String email = vistaUsuario.txtEmailUser.getText();
             String nombreUsuario = vistaUsuario.txtNombreUsuario.getText();
             String password = vistaUsuario.txtPasswordUser.getText();
             String tipoUsuario = vistaUsuario.cboxTipoUserFrm.getSelectedItem().toString();
             String activo = vistaUsuario.cboxActivo.getSelectedItem().toString();
             user.setIdUsuario(idUsuario);
             user.setNombreUser(nombre);
             user.setApellido1User(apellido1);
             user.setApellido2User(apellido2);
             user.setEmailUser(email);
             user.setNombreUsuario(nombreUsuario);
             user.setPassword(password);
             user.setTipoUsuario(tipoUsuario);
             user.setActivoUser(activo);
             int r = dao.actualizarUsuario(user);
             if (r == 1) {

                JOptionPane.showMessageDialog(vistaUsuario, "Usuario Actualizado con exito.");
                listarUsuario(vistaUsuario.tableUser);
                limpiarCampos();
            } else {

                JOptionPane.showMessageDialog(vistaUsuario, "Usuario NO fue Actualizado con exito.");
            }

        }
    }
    
    public void listarUsuario(JTable tabla) {
        limpiarTabla(tabla, modelo);
        modelo = (DefaultTableModel) tabla.getModel();
        tabla.setModel(modelo);
        List<Usuario> lista = dao.listarUsuario();
        Object[] objeto = new Object[100];

        for (int i = 0; i < lista.size(); i++) {

            objeto[0] = lista.get(i).getIdUsuario();
            objeto[1] = lista.get(i).getNombreUser();
            objeto[2] = lista.get(i).getApellido1User();
            objeto[3] = lista.get(i).getApellido2User();
            objeto[4] = lista.get(i).getEmailUser();
            objeto[5] = lista.get(i).getNombreUsuario();
            objeto[6] = lista.get(i).getPassword();
            objeto[7] = lista.get(i).getTipoUsuario();
            objeto[8] = lista.get(i).getActivoUser();
            modelo.addRow(objeto);

        }
        tabla.setRowHeight(35);
        tabla.setRowMargin(10);

    }

 public void iniciar() {

        listarUsuario(vistaUsuario.tableUser);
        limpiarCampos();
    }
    
    public void limpiarTabla(JTable table, DefaultTableModel model) {

        for (int i = 0; i < table.getRowCount(); i++) {

            model.removeRow(i);
            i = i - 1;

        }

    }
   
    public void limpiarCampos() {

        vistaUsuario.txtIdUserFrm.setText("");
        vistaUsuario.txtNombre.setText("");
        vistaUsuario.txt1ApellidoUser.setText("");
        vistaUsuario.txt2ApellidoUser.setText("");
        vistaUsuario.txtEmailUser.setText("");
        vistaUsuario.txtNombreUsuario.setText("");
        vistaUsuario.txtPasswordUser.setText("");
        vistaUsuario.cboxTipoUserFrm.setSelectedItem(0);
        vistaUsuario.cboxActivo.setSelectedItem(0);

    }
     public void eliminarUsuario() {

        int fila = vistaUsuario.tableUser.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(vistaUsuario.tableUser, "Debe Seleccionar una Fila...!!!");
        } else {
            int id = Integer.parseInt((String) vistaUsuario.tableUser.getValueAt(fila, 0).toString());
            dao.eliminar(id);
            JOptionPane.showMessageDialog(vistaUsuario, "Usuario eliminado con exito");
            listarUsuario(vistaUsuario.tableUser);
            limpiarCampos();
        }

    }
    
    public void FiltrarTablaPorNombre(JTable table, String filtro) {

        dao.filtrarTablaPorNombre(table, filtro);

    }

}
