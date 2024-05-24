package com.prueba.bancard.biblioteca.beans;

import java.time.LocalDate;

public class Libro {

    public int id;
    public String titulo;
    public String autor;
    public Boolean prestado;
    public LocalDate fechaPrestamo;

    public String Sucursal;

    public Libro() {
         this.prestado = false;
    }

    public Libro(int id, String titulo, String autor, Boolean prestado, LocalDate fechaPrestamo, String sucursal) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.prestado = prestado;
        this.fechaPrestamo = fechaPrestamo;
        Sucursal = sucursal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Boolean getPrestado() {
        return prestado;
    }

    public void setPrestado(Boolean prestado) {
        this.prestado = prestado;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String sucursal) {
        Sucursal = sucursal;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", prestado=" + prestado +
                ", fechaPrestamo=" + fechaPrestamo +
                ", Sucursal='" + Sucursal + '\'' +
                '}';
    }
}
