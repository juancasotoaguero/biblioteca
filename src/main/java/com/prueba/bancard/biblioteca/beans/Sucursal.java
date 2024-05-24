package com.prueba.bancard.biblioteca.beans;

import java.util.List;

public class Sucursal {

    public int id;
    public String nombre;
    public List<Libro> libros;

    public List<Usuario> usuarios;

    public Sucursal() {
    }

    public Sucursal(int id, String nombre, List<Libro> libros, List<Usuario> usuarios) {
        this.id = id;
        this.nombre = nombre;
        this.libros = libros;
        this.usuarios = usuarios;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    @Override
    public String toString() {
        return "Sucursal{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", libros=" + libros +
                ", usuarios=" + usuarios +
                '}';
    }
}
