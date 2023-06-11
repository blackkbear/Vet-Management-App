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
public class MascotaDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Mascota mas = new Mascota();

    public List listarMascota() {

        List<Mascota> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("SELECT * FROM Mascota");
            rs = ps.executeQuery();
            while (rs.next()) {

                Mascota mas = new Mascota();
                Dueno due = new Dueno();

                mas.setIdMascota(rs.getInt(1));
                mas.setNombreMas(rs.getString(2));
                mas.setGeneroMas(rs.getString(3));
                mas.setTipo(rs.getString(4));
                mas.setRaza(rs.getNString(5));
                mas.setActivoMas(rs.getString(6));
                due.setIdDueno(rs.getInt(7));
                mas.setIdDueno(due);

                datos.add(mas);

            }
        } catch (SQLException e) {

        }

        return datos;

    }
 public int agregarMascota(Mascota mas) {

        int r = 0;
        String sql = "INSERT INTO Mascota(Nombre,Genero,Tipo,Raza,Activo,IdDueno)VALUES(?,?,?,?,?,?)";
       
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, mas.getNombreMas());
            ps.setString(2, mas.getGeneroMas());
            ps.setString(3, mas.getTipo());
            ps.setString(4, mas.getRaza());
            ps.setString(5, mas.getActivoMas());
            ps.setInt(6, mas.getIdDueno().getIdDueno());
            
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
    public int actualizarMascota(Mascota mas) {

        int r = 0;
        String sql = "UPDATE Mascota set Nombre=?,Genero=?,Tipo=?,Raza=?,Activo=?,IdDueno=? WHERE IdMascota=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, mas.getNombreMas());
            ps.setString(2, mas.getGeneroMas());
            ps.setString(3, mas.getTipo());
            ps.setString(4, mas.getRaza());
            ps.setString(5, mas.getActivoMas());
            ps.setInt(6, mas.getIdDueno().getIdDueno());
            ps.setInt(7,mas.getIdMascota());
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
        String sql = "DELETE FROM Mascota WHERE IdMascota=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            return r;
        }
        return r;
    }
     public void filtrarTablaPorMascota(JTable table, String filtro) {

        String[] titulos = {"IdMascota", "Nombre", "Genero", "Tipo", "Raza","Activo","IdDueno"};
        String[] registros = new String[100];

        String sql = "SELECT * FROM Mascota WHERE Nombre LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdMascota");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Genero");
                registros[3] = rs.getString("Tipo");
                registros[4] = rs.getString("Raza");
                registros[5] = rs.getString("Activo");
                registros[6] = rs.getString("IdDueno");
                model.addRow(registros);

            }
            table.setModel(model);
        } catch (SQLException e) {

            System.out.println("ERROR AL BUSCAR DATOS" + e.getMessage());
        }

    }
    
    public void cargarComboDueno(JComboBox combo){
    
    combo.removeAllItems();
    combo.addItem("SELECCIONAR DUEÑO");
    String sql = "SELECT IdDueno FROM Dueno";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
            
                combo.addItem(rs.getInt(sql));
            
            }
            
        } catch (SQLException e) {
        }
    
    }
    
    
    
    
}
