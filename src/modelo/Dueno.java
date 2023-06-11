
package modelo;

/**
 *
 * @author two_r
 */
public class Dueno {
    
    private int idDueno;
    private String nombreDue;
    private String apellido1Due;
    private String apellido2Due;
    private String cedulaDue;
    private String generoDue;
    private String emailDue;
    private String telefonoDue;
    private String direccionDue;

    public Dueno() {
    }

    public Dueno(int idDueno, String nombreDue, String apellido1Due, String apellido2Due, String cedulaDue, String generoDue, String emailDue, String telefonoDue, String direccionDue) {
        this.idDueno = idDueno;
        this.nombreDue = nombreDue;
        this.apellido1Due = apellido1Due;
        this.apellido2Due = apellido2Due;
        this.cedulaDue = cedulaDue;
        this.generoDue = generoDue;
        this.emailDue = emailDue;
        this.telefonoDue = telefonoDue;
        this.direccionDue = direccionDue;
    }

    public int getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(int idDueno) {
        this.idDueno = idDueno;
    }

    public String getNombreDue() {
        return nombreDue;
    }

    public void setNombreDue(String nombreDue) {
        this.nombreDue = nombreDue;
    }

    public String getApellido1Due() {
        return apellido1Due;
    }

    public void setApellido1Due(String apellido1Due) {
        this.apellido1Due = apellido1Due;
    }

    public String getApellido2Due() {
        return apellido2Due;
    }

    public void setApellido2Due(String apellido2Due) {
        this.apellido2Due = apellido2Due;
    }

    public String getCedulaDue() {
        return cedulaDue;
    }

    public void setCedulaDue(String cedulaDue) {
        this.cedulaDue = cedulaDue;
    }

    public String getGeneroDue() {
        return generoDue;
    }

    public void setGeneroDue(String generoDue) {
        this.generoDue = generoDue;
    }

    public String getEmailDue() {
        return emailDue;
    }

    public void setEmailDue(String emailDue) {
        this.emailDue = emailDue;
    }

    public String getTelefonoDue() {
        return telefonoDue;
    }

    public void setTelefonoDue(String telefonoDue) {
        this.telefonoDue = telefonoDue;
    }

    public String getDireccionDue() {
        return direccionDue;
    }

    public void setDireccionDue(String direccionDue) {
        this.direccionDue = direccionDue;
    }

   

    
}
