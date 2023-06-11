/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JOSH
 */
public class UsuarioDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Usuario usu = new Usuario();

    public List listarUsuario() {

        List<Usuario> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("SELECT * FROM Usuario");
            rs = ps.executeQuery();
            while (rs.next()) {

                Usuario usu = new Usuario();
                usu.setIdUsuario(rs.getInt(1));
                usu.setNombreUser(rs.getString(2));
                usu.setApellido1User(rs.getString(3));
                usu.setApellido2User(rs.getString(4));
                usu.setEmailUser(rs.getString(5));
                usu.setNombreUsuario(rs.getString(6));
                usu.setPassword(rs.getString(7));
                usu.setTipoUsuario(rs.getString(8));
                usu.setActivoUser(rs.getString(9));
                datos.add(usu);

            }
        } catch (SQLException e) {

        }

        return datos;

    }
    
    public int agregarUsuario(Usuario user) {

        int r = 0;
        String sql = "INSERT INTO Usuario(Nombre,Apellido1,Apellido2,Email,NombreUsuario,Password,TipoUsuario,Activo)VALUES(?,?,?,?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUser());
            ps.setString(2, user.getApellido1User());
            ps.setString(3, user.getApellido2User());
            ps.setString(4, user.getEmailUser());
            ps.setString(5, user.getNombreUsuario());
            ps.setString(6, user.getPassword());
            ps.setString(7, user.getTipoUsuario());
            ps.setString(8, user.getActivoUser());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (Exception e) {
        }

        return r;
    }

    public int actualizarUsuario(Usuario user) {

        int r = 0;
        String sql = "UPDATE Usuario SET Nombre=?, Apellido1=?, Apellido2=?, Email=?, NombreUsuario=?, Password=?, TipoUsuario=?, Activo=? WHERE IdUsuario=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUser());
            ps.setString(2, user.getApellido1User());
            ps.setString(3, user.getApellido2User());
            ps.setString(4, user.getEmailUser());
            ps.setString(5, user.getNombreUsuario());
            ps.setString(6, user.getPassword());
            ps.setString(7, user.getTipoUsuario());
            ps.setString(8, user.getActivoUser());
            ps.setInt(9, user.getIdUsuario());
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
        }
        return r;
    }
public int eliminar(int id) {

        int r = 0;
        String sql = "DELETE FROM Usuarios WHERE IdUsuario=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
          
        }
        return r;
    }
public void filtrarTablaPorNombre(JTable table, String filtro) {

        String[] titulos = {"IdUsuario", "Nombre", "Apellido1", "Apellido2", "Email", "NombreUsuario", "Password", "TipoUsuario", "Activo"};
        String[] registros = new String[100];

        String sql = "SELECT * FROM Usuario WHERE Nombre LIKE '%" + filtro + "%'";

        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdUsuario");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido1");
                registros[3] = rs.getString("Apellido2");
                registros[4] = rs.getString("Email");
                registros[5] = rs.getString("NombreUsuario");
                registros[6] = rs.getString("Password");
                registros[7] = rs.getString("TipoUsuario");
                registros[8] = rs.getString("Activo");
                model.addRow(registros);

            }
            table.setModel(model);
        } catch (SQLException e) {

            System.out.println("ERROR AL BUSCAR DATOS" + e.getMessage());
        }

    }
 public boolean login(Usuario user) {

        String sql= "SELECT IdUsuario, Nombre, Apellido1, Apellido2, Email, NombreUsuario, Password, TipoUsuario, Activo FROM Usuario WHERE NombreUsuario=?";
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombreUsuario());
            rs = ps.executeQuery();
            
            if(rs.next()){
            
                if (user.getPassword().equals(rs.getString(7)) && user.getTipoUsuario().equals(rs.getString(8))) {
                    user.setIdUsuario(rs.getInt(1));
                    user.setNombreUsuario(rs.getString(6));
                    user.setTipoUsuario(rs.getString(8));
                    return true;
                } else {
                    return false;
                }
            }
            
            return false;
            
        } catch (Exception e) {
            return false;
        }
    }

    
     public int cargarIdUsuario(String nombreUsuario) {

        int idUsuario = 0;
        String sql = "SELECT IdUsuario FROM Usuario WHERE NombreUsuario = '" + nombreUsuario + "'";
        try {
            
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            idUsuario = rs.getInt("IdUsuario");
            
        } catch (SQLException e) {
        }
        
        return idUsuario;

    }

     public void cargarComboIdUsuario(JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("SELECCIONAR Usuario");
        String sql = "SELECT IdUsuario FROM Cita";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                combo.addItem(rs.getInt(sql));

            }

        } catch (SQLException e) {
        }

    }
}
