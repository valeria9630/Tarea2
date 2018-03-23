/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class TestLibro {
    
    public static Libro libro;
    public TestLibro() {
    }
    
    @Before
    public void setUpBeforeClass() {
        libro = new Libro();
    }


    @Test
    public void testSetGetTitulo() {
        String valorPruebaTitulo = "Valeria";
        libro.setTitulo(valorPruebaTitulo);
        String retorno = libro.getTitulo();
        assertEquals(valorPruebaTitulo, retorno);

    }
   
}
