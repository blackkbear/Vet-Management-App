
package modelo;

/**
 *
 * @author two_r
 */

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Conexion {
    
    Connection ccn = null;//nos permite almacenar la ruta donde esta mi DB
    Statement st = null;//procedimiento que vaya ejecutar

    public Conexion() {
        try {
            String rutaFile;
            rutaFile = "./DB/MiMascotaDB.accdb";
            String url = "jdbc:ucanaccess://" + rutaFile;
            ccn = DriverManager.getConnection(url);
            st = ccn.createStatement();

        } catch (SQLException e) {

            JOptionPane.showInputDialog(null, "CONEXION ERRONEA" + e);
        }
    }

    //Metodo que devuelva la conexion actual
    public Connection getConnection() {

        return ccn;

    }

    //Metodo para desconectarse
    public void desconexion() {

        try {

            ccn.close();
            System.exit(0);

        } catch (SQLException e) {

            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, e);
        }

    }
    
}
