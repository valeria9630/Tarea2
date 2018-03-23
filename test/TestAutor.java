/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cr.ac.ucr.if3000.tarea2.domain.Autor;
import cr.ac.ucr.if3000.tarea2.domain.Libro;
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
public class TestAutor {

    public static Autor autor;

    public TestAutor() {
    }

    @Before
    public void setUpBeforeClass() {
        autor = new Autor();
    }

    @Test
    public void testSetGetNombreUnico() {
        String valorPruebaNombre = "Alonso";
        autor.setNombreUnico(valorPruebaNombre);
        String retorno = autor.getNombreUnico();
        assertEquals(valorPruebaNombre, retorno);

    }

    @Test
    public void testSetGetContrasena() {
        String valorPruebaContrasena = "Contrasena";
        autor.setContrasena(valorPruebaContrasena);
        String retorno = autor.getContrasena();
        assertEquals(valorPruebaContrasena, retorno);

    }

    @Test
    public void testSetGetNombreCompleto() {
        String valorPruebaNombreCompleto = "NombreCompleto";
        autor.setNombreCompleto(valorPruebaNombreCompleto);
        String retorno = autor.getNombreCompleto();
        assertEquals(valorPruebaNombreCompleto, retorno);

    }

    @Test
    public void testSetGetTipoIdentificacion() {
        String valorPruebaTipoIdentificacion = "TipoIdentificacion";
        autor.setTipoIdentificacion(valorPruebaTipoIdentificacion);
        String retorno = autor.getTipoIdentificacion();
        assertEquals(valorPruebaTipoIdentificacion, retorno);

    }

    @Test
    public void testSetGetIdentificacion() {
        String valorPruebaIdentificacion = "Identificacion";
        autor.setIdentificacion(valorPruebaIdentificacion);
        String retorno = autor.getIdentificacion();
        assertEquals(valorPruebaIdentificacion, retorno);

    }
}
