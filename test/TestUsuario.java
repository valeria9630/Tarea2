/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cr.ac.ucr.if3000.tarea2.domain.Usuario;
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
public class TestUsuario {

    public static Usuario usuario;

    public TestUsuario() {
    }

    @Before
    public void setUpBeforeClass() {
        usuario = new Usuario();
    }

    @Test
    public void testSetGetNombreUnico() {
        String valorPruebaNombre = "Alonso";
        usuario.setNombreUnico(valorPruebaNombre);
        String retorno = usuario.getNombreUnico();
        assertEquals(valorPruebaNombre, retorno);

    }

    @Test
    public void testSetGetContrasena() {
        String valorPruebaContrasena = "Contrasena";
        usuario.setContrasena(valorPruebaContrasena);
        String retorno = usuario.getContrasena();
        assertEquals(valorPruebaContrasena, retorno);

    }

    @Test
    public void testSetGetNombreCompleto() {
        String valorPruebaNombreCompleto = "NombreCompleto";
        usuario.setNombreCompleto(valorPruebaNombreCompleto);
        String retorno = usuario.getNombreCompleto();
        assertEquals(valorPruebaNombreCompleto, retorno);

    }

    @Test
    public void testSetGetTipoIdentificacion() {
        String valorPruebaTipoIdentificacion = "TipoIdentificacion";
        usuario.setTipoIdentificacion(valorPruebaTipoIdentificacion);
        String retorno = usuario.getTipoIdentificacion();
        assertEquals(valorPruebaTipoIdentificacion, retorno);

    }

    @Test
    public void testSetGetIdentificacion() {
        String valorPruebaIdentificacion = "Identificacion";
        usuario.setIdentificacion(valorPruebaIdentificacion);
        String retorno = usuario.getIdentificacion();
        assertEquals(valorPruebaIdentificacion, retorno);

    }

}
