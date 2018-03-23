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
public class Bibliotecologo extends Persona {

    public static ArrayList<Autor> listadoAutor= new ArrayList<>();
    public static  ArrayList<Bibliotecologo> listadoBibliotecologos= new ArrayList<>();
    public static ArrayList<Libro> listadoLibro= new ArrayList<>();
    public static  ArrayList<Usuario> listadoUsuario= new ArrayList<>();

    public Bibliotecologo() {

    }

    public Bibliotecologo(String nombreUnico, String contrasena, String nombreCompleto, String tipoIdentificacion, String identificacion) {
        super(nombreUnico, contrasena, nombreCompleto, tipoIdentificacion, identificacion);

        this.listadoAutor = new ArrayList<>();
        this.listadoLibro = new ArrayList<>();
        this.listadoUsuario = new ArrayList<>();
        this.listadoBibliotecologos = new ArrayList<>();
    }

    public ArrayList<Autor> getListadoAutor() {
        return listadoAutor;
    }

    public void setListadoAutor(ArrayList<Autor> listadoAutor) {
        this.listadoAutor = listadoAutor;
    }

    public ArrayList<Bibliotecologo> getListadoBibliotecologos() {
        return listadoBibliotecologos;
    }

    public void setListadoBibliotecologos(ArrayList<Bibliotecologo> listadoBibliotecologos) {
        this.listadoBibliotecologos = listadoBibliotecologos;
    }

    public ArrayList<Libro> getListadoLibro() {
        return listadoLibro;
    }

    public void setListadoLibro(ArrayList<Libro> listadoLibro) {
        this.listadoLibro = listadoLibro;
    }

    public ArrayList<Usuario> getListadoUsuario() {
        return listadoUsuario;
    }

    public void setListadoUsuario(ArrayList<Usuario> listadoUsuario) {
        this.listadoUsuario = listadoUsuario;
    }

}
