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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Date;
import javax.swing.JComboBox;
import javax.swing.JTextField;
/**
 *
 * @author JOSH
 */
public class CitaDAO {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Cita ci = new Cita();
    
    public List listarCita() {

        List<Cita> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
                     
                ps = con.prepareStatement("SELECT * FROM cita c"
                    + " INNER JOIN dueno d ON c.idDueno = d.idDueno"
                    + " INNER JOIN veterinario v ON c.idVeterinario = v.idVeterinario"
                    + " INNER JOIN usuario u ON c.idUsuario = u.idUsuario");
                rs = ps.executeQuery();
           
            
            while (rs.next()) {


                Cita cita = new Cita();
                Dueno dueno = new Dueno();
                Veterinario vete = new Veterinario();
                Usuario usuario = new Usuario();


                
                cita.setIdCita(rs.getInt("idCita"));
                cita.setAsunto(rs.getString("asunto"));
                cita.setFecha(rs.getDate("fecha"));
                cita.setHora(rs.getString("hora"));
                cita.setFechaCreacion(rs.getString("fechaCreacion"));


                
                dueno.setIdDueno(rs.getInt("idDueno"));
                cita.setIdDueno(dueno);
                dueno.setCedulaDue(rs.getString("cedula"));
                cita.setCedula(dueno);


                
                vete.setIdVeterinario(rs.getInt("idVeterinario"));
                cita.setIdVeterinario(vete);


                
                usuario.setIdUsuario(rs.getInt("idUsuario"));
                cita.setIdUsuario(usuario);
                datos.add(cita);


            }
        } catch (SQLException e) {
        }
        return datos;


    }
    
    public int agregarCita(Cita cit) {

        int r = 0;
        String sql = "INSERT INTO Cita(Asunto,Fecha,Hora,FechaCreacion,IdDueno,IdVeterinario,IdUsuario,Cedula) VALUES (?,?,?,?,?,?,?,?)";

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cit.getAsunto());
            ps.setDate(2, cit.getFecha());
            ps.setString(3, cit.getHora());
            ps.setString(4, cit.getFechaCreacion());
            ps.setInt(5, cit.getIdDueno().getIdDueno());
            ps.setInt(6, cit.getIdVeterinario().getIdVeterinario());
            ps.setInt(7, cit.getIdUsuario().getIdUsuario());
            ps.setString(8, cit.getCedula().getCedulaDue());
            r = ps.executeUpdate();
            if (r == 1) {

                return 1;
            } else {
                return 0;
            }
        } catch (SQLException ex) {

        }
        return r;

    }
public void flitrarTablaPorCedula(JTable table, String filtro) {

        String[] titulos = {"IdCita", "Asunto", "Fecha", "Hora", "FechaCreacion", "IdDueno", "IdVeterinario", "IdUsuario","Cedula"};
        String[] registros = new String[100];
        String sql = "SELECT Cita.IdDueno, Cita.Asunto, Cita.Fecha, Cita.Hora"
                    + "Cita.FechaCreacion, Dueno.IdDueno, Dueno.Cedula, Veterinario.IdVeterinario, Usuario.IdUsuario FROM ((((Cita "
                    + "INNER JOIN dueno ON Cita.IdDueno = Dueno.IdDueno)"
                    + "INNER JOIN dueno ON Cita.Cedula = Dueno.Cedula)"
                    + "INNER JOIN veterinario ON Cita.IdVeterinario = Veterinario.IdVeterinario)"
                    + "INNER JOIN Usuario ON Cita.idUsuario = Usuario.IdUsuario) WHERE Cedula LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);
        try {

            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdCita");
                registros[1] = rs.getString("Asunto");
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("Hora");
                registros[4] = rs.getString("FechaCreacion");
                registros[5] = rs.getString("IdDueno");
                registros[6] = rs.getString("Cedula");
                registros[7] = rs.getString("IdVeterinario");
                registros[8] = rs.getString("IdUsuario");
                model.addRow(registros);

            }
            table.setModel(model);

        } catch (SQLException e) {
            System.out.println("Error al buscar los datos" + e.getMessage());
        }

    }

public void filtrarTablaPorFechas(JTable table, Date inicio, Date fin){
         String[] titulos = {"IdCita", "Asunto", "Fecha", "Hora", "FechaCreacion", "IdDueno", "IdVeterinario", "IdUsuario","Cedula"};
        String[] registros = new String[100];
        String sql = "SELECT Cita.IdDueno, Cita.Asunto, Cita.Fecha, Cita.Hora"
                    + "Cita.FechaCreacion, Dueno.IdDueno, Veterinario.IdVeterinario, Usuario.IdUsuario FROM ((((Cita "
                    + "INNER JOIN Dueno ON Cita.IdDueno = Dueno.IdDueno)"
                    + "INNER JOIN Dueno ON Cita.Cedula = Dueno.Cedula)"
                    + "INNER JOIN Veterinario ON Cita.IdVeterinario = Veterinario.IdVeterinario)"
                    + "INNER JOIN Usuario ON Cita.IdUsuario = Usuario.IdUsuario)WHERE Cita.Fecha BETWEEN%" + inicio + "%AND%" + fin + "%";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);
        
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdCita");
                registros[1] = rs.getString("Asunto");
                registros[2] = rs.getString("Fecha");
                registros[3] = rs.getString("Hora");
                registros[4] = rs.getString("FechaCreacion");
                registros[5] = rs.getString("IdDueno");
                registros[6] = rs.getString("Cedula");
                registros[7] = rs.getString("IdVeterinario");
                registros[8] = rs.getString("IdUsuario");
                model.addRow(registros);}
            table.setModel(model);
        } catch (SQLException e) {
            System.out.println("ERROR AL BUSCAR DATOS" + e.getMessage());
        }
    
    }
 public void cargarComboIdDueno(JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("SELECCIONAR Dueno");
        String sql = "SELECT IdDueno FROM Cita";
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
 public void cargarComboIdVeterinario(JComboBox combo) {

        combo.removeAllItems();
        combo.addItem("SELECCIONAR Veterinario");
        String sql = "SELECT IdVeterinario FROM Cita";
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

