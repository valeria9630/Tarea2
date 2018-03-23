/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.tarea2.domain;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class Autor extends Persona {

    private ArrayList<Libro> obrasEscritas;

    public Autor() {
        this.obrasEscritas = obrasEscritas;
    }

    public Autor(String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contrasena, nombreCompleto, tipoIdentificacion, identificacion);
    }

    public Autor(ArrayList<Libro> obrasEscritas, String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contrasena, nombreCompleto, tipoIdentificacion, identificacion);
        this.obrasEscritas = obrasEscritas;
    }

    public ArrayList<Libro> getObrasEscritas() {
        return obrasEscritas;
    }

    public void setObrasEscritas(ArrayList<Libro> obrasEscritas) {
        this.obrasEscritas = obrasEscritas;
    }

  

}
