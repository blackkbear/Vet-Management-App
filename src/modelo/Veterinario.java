
package modelo;

/**
 *
 * @author two_r
 */
public class Veterinario {
    
    private int idVeterinario;
    private String nombreVet;
    private String apellido1Vet;
    private String apellido2Vet;
    private String cedulaVet;
    private String codProfesional;
    private String emailVet;
    private String telefonoVet;
    private String direcionVet;
    private String activoVet;

    public Veterinario() {
    }

    public Veterinario(int idVeterinario, String nombreVet, String apellido1Vet, String apellido2Vet, String cedulaVet, String codProfesional, String emailVet, String telefonoVet, String direcionVet, String activoVet) {
        this.idVeterinario = idVeterinario;
        this.nombreVet = nombreVet;
        this.apellido1Vet = apellido1Vet;
        this.apellido2Vet = apellido2Vet;
        this.cedulaVet = cedulaVet;
        this.codProfesional = codProfesional;
        this.emailVet = emailVet;
        this.telefonoVet = telefonoVet;
        this.direcionVet = direcionVet;
        this.activoVet = activoVet;
    }

    public int getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(int idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public String getNombreVet() {
        return nombreVet;
    }

    public void setNombreVet(String nombreVet) {
        this.nombreVet = nombreVet;
    }

    public String getApellido1Vet() {
        return apellido1Vet;
    }

    public void setApellido1Vet(String apellido1Vet) {
        this.apellido1Vet = apellido1Vet;
    }

    public String getApellido2Vet() {
        return apellido2Vet;
    }

    public void setApellido2Vet(String apellido2Vet) {
        this.apellido2Vet = apellido2Vet;
    }

    public String getCedulaVet() {
        return cedulaVet;
    }

    public void setCedulaVet(String cedulaVet) {
        this.cedulaVet = cedulaVet;
    }

    public String getCodProfesional() {
        return codProfesional;
    }

    public void setCodProfesional(String codProfesional) {
        this.codProfesional = codProfesional;
    }

    public String getEmailVet() {
        return emailVet;
    }

    public void setEmailVet(String emailVet) {
        this.emailVet = emailVet;
    }

    public String getTelefonoVet() {
        return telefonoVet;
    }

    public void setTelefonoVet(String telefonoVet) {
        this.telefonoVet = telefonoVet;
    }

    public String getDirecionVet() {
        return direcionVet;
    }

    public void setDirecionVet(String direcionVet) {
        this.direcionVet = direcionVet;
    }

    public String getActivoVet() {
        return activoVet;
    }

    public void setActivoVet(String activoVet) {
        this.activoVet = activoVet;
    }

   
}
