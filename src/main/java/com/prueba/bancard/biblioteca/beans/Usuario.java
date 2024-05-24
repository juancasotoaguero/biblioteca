package com.prueba.bancard.biblioteca.beans;

import java.util.ArrayList;
import java.util.List;

public class Usuario {

    public int id;
    public String nombre;
    public List<Libro> librosPrestados;
    public List<Libro> librosReservados;
    public List<String> notificaciones;

    public Usuario() {
    }
    public Usuario(int id, String nombre, List<Libro> librosPrestados, List<Libro> librosReservados, List<String> notificaciones) {
        this.id = id;
        this.nombre = nombre;
        this.librosPrestados = librosPrestados;
        this.librosReservados = librosReservados;
        this.notificaciones = notificaciones;
    }

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.librosPrestados = new ArrayList<>();
        this.librosReservados =  new ArrayList<>();
        this.notificaciones =  new ArrayList<>();
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

    public List<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(List<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }

    public List<Libro> getLibrosReservados() {
        return librosReservados;
    }

    public void setLibrosReservados(List<Libro> librosReservados) {
        this.librosReservados = librosReservados;
    }

    public List<String> getNotificaciones() {
        return notificaciones;
    }

    public void setNotificaciones(List<String> notificaciones) {
        this.notificaciones = notificaciones;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", librosPrestados=" + librosPrestados +
                ", librosReservados=" + librosReservados +
                ", notificaciones=" + notificaciones +
                '}';
    }
}
