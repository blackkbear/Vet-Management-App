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
public class VeterinarioDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion conectar = new Conexion();
    Veterinario vet = new Veterinario();

    public List listarVeterinario() {

        List<Veterinario> datos = new ArrayList<>();
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement("SELECT * FROM Veterinario");
            rs = ps.executeQuery();
            while (rs.next()) {

                Veterinario vet = new Veterinario();
                vet.setIdVeterinario(rs.getInt(1));
                vet.setNombreVet(rs.getString(2));
                vet.setApellido1Vet(rs.getString(3));
                vet.setApellido2Vet(rs.getString(4));
                vet.setCedulaVet(rs.getNString(5));
                vet.setCodProfesional(rs.getNString(6));
                vet.setEmailVet(rs.getNString(7));
                vet.setTelefonoVet(rs.getNString(8));
                vet.setDirecionVet(rs.getNString(9));
                vet.setActivoVet(rs.getString(10));
                datos.add(vet);

            }
        } catch (SQLException e) {

        }

        return datos;

    }

    public int agregarVeterinario(Veterinario vete) {

        int r = 0;

        String sql = "INSERT INTO Veterinario(Nombre,Apellido1,Apellido2,Cedula,CodProfesional,Email,Telefono,Direccion,Activo)VALUES (?,?,?,?,?,?,?,?,?)";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vete.getNombreVet());
            ps.setString(2, vete.getApellido1Vet());
            ps.setString(3, vete.getApellido2Vet());
            ps.setString(4, vete.getCedulaVet());
            ps.setString(5, vete.getCodProfesional());
            ps.setString(6, vete.getEmailVet());
            ps.setString(7, vete.getTelefonoVet());
            ps.setString(8, vete.getDirecionVet());
            ps.setString(9, vete.getActivoVet());
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

    public int actualizarVeterinario(Veterinario vete) {

        int r = 0;
        String sql = "UPDATE Veterinario set Nombre=?,Apellido1=?,Apellido2=?,Cedula=?,CodProfesional=?,Email=?,Telefono=?,Direccion=?,Activo=? WHERE IdVeterinario=?";
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, vete.getNombreVet());
            ps.setString(2, vete.getApellido1Vet());
            ps.setString(3, vete.getApellido2Vet());
            ps.setString(4, vete.getCedulaVet());
            ps.setString(5, vete.getCodProfesional());
            ps.setString(6, vete.getEmailVet());
            ps.setString(7, vete.getTelefonoVet());
            ps.setString(8, vete.getDirecionVet());
            ps.setString(9, vete.getActivoVet());
            ps.setInt(10,vete.getIdVeterinario());
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
        String sql = "DELETE FROM Veterinario WHERE IdVeterinario=" + id;
        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            r = ps.executeUpdate();
        } catch (Exception e) {
            return r;
        }
        return r;
    }

    public void filtrarTablaPorVeterinario(JTable table, String filtro) {

        String[] titulos = {"IdVeterinario", "Nombre", "Apellido1", "Apellido2", "Cedula", "CodProfesional", "Email", "Telefono", "Direccion","Activo"};
        String[] registros = new String[100];

        String sql = "SELECT * FROM Veterinario WHERE Nombre LIKE '%" + filtro + "%'";
        DefaultTableModel model = new DefaultTableModel();
        model = new DefaultTableModel(null, titulos);

        try {
            con = conectar.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                registros[0] = rs.getString("IdVeterinario");
                registros[1] = rs.getString("Nombre");
                registros[2] = rs.getString("Apellido1");
                registros[3] = rs.getString("Apellido2");
                registros[4] = rs.getString("Cedula");
                registros[5] = rs.getString("CodProfesional");
                registros[6] = rs.getString("Email");
                registros[7] = rs.getString("Telefono");
                registros[8] = rs.getString("Direccion");
                registros[9] = rs.getString("Activo");
                model.addRow(registros);

            }
            table.setModel(model);
        } catch (SQLException e) {

            System.out.println("ERROR AL BUSCAR DATOS" + e.getMessage());
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
}
