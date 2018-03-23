/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cr.ac.ucr.if3000.tarea2.domain.Bibliotecologo;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class TestBibliotecologo {

    public static Bibliotecologo bibliotecologo;

    public TestBibliotecologo() {
    }

    @Before
    public void setUpBeforeClass() {
        bibliotecologo = new Bibliotecologo();
    }

    @Test
    public void testSetGetNombreUnico() {
        String valorPruebaNombre = "Alonso";
        bibliotecologo.setNombreUnico(valorPruebaNombre);
        String retorno = bibliotecologo.getNombreUnico();
        assertEquals(valorPruebaNombre, retorno);

    }

    @Test
    public void testSetGetContrasena() {
        String valorPruebaContrasena = "Contrasena";
        bibliotecologo.setContrasena(valorPruebaContrasena);
        String retorno = bibliotecologo.getContrasena();
        assertEquals(valorPruebaContrasena, retorno);

    }

    @Test
    public void testSetGetNombreCompleto() {
        String valorPruebaNombreCompleto = "NombreCompleto";
        bibliotecologo.setNombreCompleto(valorPruebaNombreCompleto);
        String retorno = bibliotecologo.getNombreCompleto();
        assertEquals(valorPruebaNombreCompleto, retorno);

    }

    @Test
    public void testSetGetTipoIdentificacion() {
        String valorPruebaTipoIdentificacion = "TipoIdentificacion";
        bibliotecologo.setTipoIdentificacion(valorPruebaTipoIdentificacion);
        String retorno = bibliotecologo.getTipoIdentificacion();
        assertEquals(valorPruebaTipoIdentificacion, retorno);

    }

    @Test
    public void testSetGetIdentificacion() {
        String valorPruebaIdentificacion = "Identificacion";
        bibliotecologo.setIdentificacion(valorPruebaIdentificacion);
        String retorno = bibliotecologo.getIdentificacion();
        assertEquals(valorPruebaIdentificacion, retorno);

    }
}
