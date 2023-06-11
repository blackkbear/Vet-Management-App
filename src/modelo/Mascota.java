/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author two_r
 */
public class Mascota {
    
    private int idMascota;
    private String nombreMas;
    private String generoMas;
    private String tipo;
    private String raza;
    private String activoMas;
    private Dueno idDueno;

    public Mascota() {
    }

    public Mascota(int idMascota, String nombreMas, String generoMas, String tipo, String raza, String activoMas, Dueno idDueno) {
        this.idMascota = idMascota;
        this.nombreMas = nombreMas;
        this.generoMas = generoMas;
        this.tipo = tipo;
        this.raza = raza;
        this.activoMas = activoMas;
        this.idDueno = idDueno;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombreMas() {
        return nombreMas;
    }

    public void setNombreMas(String nombreMas) {
        this.nombreMas = nombreMas;
    }

    public String getGeneroMas() {
        return generoMas;
    }

    public void setGeneroMas(String generoMas) {
        this.generoMas = generoMas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getActivoMas() {
        return activoMas;
    }

    public void setActivoMas(String activoMas) {
        this.activoMas = activoMas;
    }

    public Dueno getIdDueno() {
        return idDueno;
    }

    public void setIdDueno(Dueno idDueno) {
        this.idDueno = idDueno;
    }


    
}
