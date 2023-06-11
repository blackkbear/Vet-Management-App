package modelo;

/**
 *
 * @author two_r
 */
public class Usuario {

    private int idUsuario;
    private String nombreUser;
    private String apellido1User;
    private String apellido2User;
    private String emailUser;
    private String nombreUsuario;
    private String password;
    private String tipoUsuario;
    private String activoUser;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nombreUser, String apellido1User, String apellido2User, String emailUser, String nombreUsuario, String password, String passwordConfirm, String tipoUsuario, String activoUser) {
        this.idUsuario = idUsuario;
        this.nombreUser = nombreUser;
        this.apellido1User = apellido1User;
        this.apellido2User = apellido2User;
        this.emailUser = emailUser;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.tipoUsuario = tipoUsuario;
        this.activoUser = activoUser;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    public String getApellido1User() {
        return apellido1User;
    }

    public void setApellido1User(String apellido1User) {
        this.apellido1User = apellido1User;
    }

    public String getApellido2User() {
        return apellido2User;
    }

    public void setApellido2User(String apellido2User) {
        this.apellido2User = apellido2User;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public String getActivoUser() {
        return activoUser;
    }

    public void setActivoUser(String activoUser) {
        this.activoUser = activoUser;
    }

}
