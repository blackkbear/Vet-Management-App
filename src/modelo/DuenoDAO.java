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
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import vista.frmDueno;

/**
 *
 * @author JOSH
 */
public class DuenoDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Dueno du = new Dueno();
    

    public List listarDueno() {

        List<Dueno> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("SELECT * FROM Dueno");
            rs = ps.executeQuery();
            while (rs.next()) {

                Dueno du = new Dueno();
                du.setIdDueno(rs.getInt(1));
                du.setNombreDue(rs.getString(2));
                du.setApellido1Due(rs.getString(3));
                du.setApellido2Due(rs.getString(4));
                du.setCedulaDue(rs.getString(5));
                du.setGeneroDue(rs.getString(6));
                du.setEmailDue(rs.getString(7));
                du.setTelefonoDue(rs.getString(8));
                du.setDireccionDue(rs.getString(9));
                datos.add(du);

            }
        } catch (SQLException e) {

        }

        return datos;

    }

    public int agregarDueno(Dueno due) {

        int r = 0;
        String sql = "INSERT INTO Dueno(Nombre,Apellido1,Apellido2,Cedula,Genero,Email,Telefono,Direccion)VALUES(?,?,?,?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, due.getNombreDue());
            ps.setString(2, due.getApellido1Due());
            ps.setString(3, due.getApellido2Due());
            ps.setString(4, due.getCedulaDue());
            ps.setString(5, due.getGeneroDue());
            ps.setString(6, due.getEmailDue());
            ps.setString(7, due.getTelefonoDue());
            ps.setString(8, due.getDireccionDue());
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

    public int actualizarDueno(Dueno due) {

        int r = 0;
        String sql = "UPDATE Dueno SET Nombre=?,Apellido1=?,Apellido2=?,Cedula=?,Genero=?,Email=?,Telefono=?,Direccion=? WHERE IdDueno=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, due.getNombreDue());
            ps.setString(2, due.getApellido1Due());
            ps.setString(3, due.getApellido2Due());
            ps.setString(4, due.getCedulaDue());
            ps.setString(5, due.getGeneroDue());
            ps.setString(6, due.getEmailDue());
            ps.setString(7, due.getTelefonoDue());
            ps.setString(8, due.getDireccionDue());
            ps.setInt(9, due.getIdDueno());
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

    public int eliminar(int id) {

        int r = 0;
        String sql = "DELETE FROM Dueno WHERE IdDueno=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            return r;
        }
        return r;
    }
 public void filtrarTablaPorDueno(JTable table, String filtro) {

        String[] titulos = {"IdDueno", "Nombre", "Apellido1", "Apellido2", "Cedula","Genero","Email","Telefono","Direccion"};
        String[] registros = new String[100];

        String sql = "SELECT * FROM Dueno WHERE Nombre LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdDueno");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido1");
                registros[3] = rs.getString("Apellido2");
                registros[4] = rs.getString("Cedula");
                registros[5] = rs.getString("Genero");
                registros[6] = rs.getString("Email");
                registros[7] = rs.getString("Telefono");
                registros[8] = rs.getString("Direccion");
                model.addRow(registros);

            }
            table.setModel(model);
        } catch (SQLException e) {

            System.out.println("ERROR AL BUSCAR DATOS" + e.getMessage());
        }

    }

    public void cargarComboDueno(JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("SELECCIONAR DUEÑO");
        String sql = "SELECT Nombre FROM Dueno";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {

                combo.addItem(rs.getString("Nombre"));

            }

        } catch (SQLException e) {
        }

    }

    public void cargarComboIdDueno(JComboBox combo, JTextField txtIdDue ){

        String sql = "SELECT IdDueno FROM Dueno WHERE Nombre='" + combo.getSelectedItem() + "'";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            rs.next();
            txtIdDue.setText(String.valueOf(rs.getInt("IdDueno")));
            
            
        
        } catch (SQLException e) {
        }

    }

}
