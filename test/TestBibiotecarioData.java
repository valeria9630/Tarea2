/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cr.ac.ucr.if3000.tarea2.data.BibliotecarioData;
import cr.ac.ucr.if3000.tarea2.domain.Autor;
import cr.ac.ucr.if3000.tarea2.domain.Bibliotecologo;
import cr.ac.ucr.if3000.tarea2.domain.Libro;
import cr.ac.ucr.if3000.tarea2.domain.Usuario;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static cr.ac.ucr.if3000.tarea2.domain.Bibliotecologo.listadoAutor;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class TestBibiotecarioData {

    public static Usuario usuario;
    public static Autor autor;
    public static Libro libro;
    public static Bibliotecologo bibliotecologo;
    public static BibliotecarioData bibliotecarioData;

    public TestBibiotecarioData() {

    }

    @Before
    public  void setUpBeforeClass() {
        usuario = new Usuario();
        autor = new Autor();
        libro = new Libro();
        bibliotecologo = new Bibliotecologo("Valeria", "xx", "ValeriaLeiva", "Nacional", "304940832");
        bibliotecarioData = new BibliotecarioData(bibliotecologo);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public  void testInsertarAutor() {
        autor = new Autor("Ale", "s", "s", "s", "a");
        bibliotecarioData.agregar(autor);
        Autor retorno= listadoAutor.get(bibliotecarioData.buscarPersona(autor));
        assertEquals(autor, retorno);
        
    }
}
