/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.if3000.tarea2.data;

import cr.ac.ucr.if3000.tarea2.domain.Autor;
import cr.ac.ucr.if3000.tarea2.domain.Bibliotecologo;
import cr.ac.ucr.if3000.tarea2.domain.Persona;
import cr.ac.ucr.if3000.tarea2.domain.Libro;
import cr.ac.ucr.if3000.tarea2.domain.Usuario;
import java.util.ArrayList;

/**
 *
 * @author ValeriaLeivaQuirós
 */
public class BibliotecarioData {

    Bibliotecologo bibliotecologo;

    public BibliotecarioData(Bibliotecologo bibliotecologo) {
        this.bibliotecologo = bibliotecologo;

    }

    public Persona agregar(Object persona) {
        if (persona instanceof Autor) {
            bibliotecologo.getListadoAutor().add((Autor) persona);
       } else if (persona instanceof Usuario) {
            bibliotecologo.getListadoUsuario().add((Usuario) persona);
        }
return null;
    }

    public void agregarLibro(Libro libro) {

        bibliotecologo.getListadoLibro().add(libro);

        if (buscarPersona(libro.getAutor()) != -1) {
            int posicion = buscarPersona(libro.getAutor());
            bibliotecologo.listadoAutor.get(posicion).getObrasEscritas().add(libro);

        } else {
            agregar(libro.getAutor());

        }

    }

    public void agregarObrasPrestadas(Persona usuario, Libro libro) {

        int posicion = buscarPersona(usuario);
        if (posicion != -1) {
            bibliotecologo.getListadoUsuario().get(posicion).getLibrosPrestados().add(libro);

        } else {

            System.out.println("El usuario no existe");
        }

    }

    public void suprimirPersona(Object persona) {

        if (persona instanceof Autor) {
            bibliotecologo.getListadoAutor().remove((Autor) persona);
        } else if (persona instanceof Usuario) {
            bibliotecologo.getListadoUsuario().remove((Usuario) persona);
        }

    }

    public void suprimirPersona(Libro libro) {

        bibliotecologo.getListadoLibro().remove(libro);

    }

    public void modificarPersona(Object persona, Object personaModificada) {

        if (persona instanceof Autor) {
            bibliotecologo.getListadoAutor().set(buscarPersona(persona), (Autor) personaModificada);
        } else if (persona instanceof Usuario) {
            bibliotecologo.getListadoUsuario().set(buscarPersona(persona), (Usuario) personaModificada);
        }

    }

    public void modificarLibro(Libro libro, Libro libroModificada) {

        bibliotecologo.getListadoLibro().set(buscarLibro(libro), (Libro) libroModificada);

    }

    public int buscarPersona(Object persona) {
        int posicion = -1;
        if (persona instanceof Autor) {
            posicion = bibliotecologo.getListadoAutor().indexOf((Autor) persona);

        } else if (persona instanceof Usuario) {
            posicion = bibliotecologo.getListadoUsuario().indexOf((Usuario) persona);

        }
        return posicion;
    }

    public int buscarLibro(Libro libro) {
        int posicion = -1;

        posicion = bibliotecologo.getListadoLibro().indexOf(libro);

        return posicion;
    }

    public static void main(String[] args) {
        Persona bi = new Bibliotecologo("a", "a", "a", "a", "a");
        BibliotecarioData bibliotecarioData = new BibliotecarioData((Bibliotecologo) bi);

        Persona a = new Autor("a", "a", "a", "a", "a");
        Persona aM = new Autor("lechuga", "a", "a", "a", "a");
        Persona u = new Usuario("u", "a", "a", "a", "a");
        Persona b = new Usuario("b", "b", "b", "b", "b");
        ArrayList<Autor> autors;
        bibliotecarioData.agregar(u);
        bibliotecarioData.agregar(a);
        bibliotecarioData.agregar(b);
        int p = bibliotecarioData.buscarPersona(a);
        System.out.println(bibliotecarioData.bibliotecologo.getListadoUsuario().get(0).toString());
        bibliotecarioData.modificarPersona(a, aM);

    }

}
