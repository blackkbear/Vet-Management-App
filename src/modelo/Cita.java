
package modelo;
import java.sql.Date;
/**
 *
 * @author two_r
 */
public class Cita {
    
    private int idCita;
    private String asunto;
    private Date fecha;
    private String hora;
    private String fechaCreacion;
    private Dueno idDueno;
    private Usuario idUsuario;
    private Veterinario idVeterinario;
    private Dueno cedula;

    public Cita() {
    }

    public Cita(int idCita, String asunto, Date fecha, String hora, String fechaCreacion, Dueno idDueno, Usuario idUsuario, Veterinario idVeterinario, Dueno cedula) {
        this.idCita = idCita;
        this.asunto = asunto;
        this.fecha = fecha;
        this.hora = hora;
        this.fechaCreacion = fechaCreacion;
        this.idDueno = idDueno;
        this.idUsuario = idUsuario;
        this.idVeterinario = idVeterinario;
        this.cedula = cedula;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Dueno getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Dueno idDueno) {
        this.idDueno = idDueno;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Veterinario getIdVeterinario() {
        return idVeterinario;
    }

    public void setIdVeterinario(Veterinario idVeterinario) {
        this.idVeterinario = idVeterinario;
    }

    public Dueno getCedula() {
        return cedula;
    }

    public void setCedula(Dueno cedula) {
        this.cedula = cedula;
    }

   
    
}
