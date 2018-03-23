/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.tarea2.domain;

import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Usuario extends Persona{
    private ArrayList<Libro> librosPrestados;

    public Usuario() {
        this.librosPrestados = librosPrestados;
    }

    public Usuario(String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contrasena, nombreCompleto, tipoIdentificacion, identificacion);
    }

    public Usuario(ArrayList<Libro> librosPrestados, String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contrasena, nombreCompleto, tipoIdentificacion, identificacion);
        this.librosPrestados = librosPrestados;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    
}
