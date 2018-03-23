/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.tarea2.domain;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public abstract class Persona {

    private String nombreUnico;
    private String contrasena;
    private String nombreCompleto;
    private String tipoIdentificacion;
    private String identificacion;

    public Persona() {
        this.nombreUnico = nombreUnico;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;

    }

    public Persona(String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        this.nombreUnico = nombreUnico;
        this.contrasena = contrasena;
        this.nombreCompleto = nombreCompleto;
        this.tipoIdentificacion = tipoIdentificacion;
        this.identificacion = identificacion;
    }

    public String getNombreUnico() {
        return nombreUnico;
    }

    public void setNombreUnico(String nombreUnico) {
        this.nombreUnico = nombreUnico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTipoIdentificacion() {
        return tipoIdentificacion;
    }

    public void setTipoIdentificacion(String tipoIdentificacion) {
        this.tipoIdentificacion = tipoIdentificacion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    
    @Override
    public String toString() {
        return "Usuario{" + "nombreUnico=" + nombreUnico + ", contrasena=" + contrasena + ", nombreCompleto=" + nombreCompleto + ", tipoIdentificacion=" + tipoIdentificacion + ", identificacion=" + identificacion + '}';
    }

}
