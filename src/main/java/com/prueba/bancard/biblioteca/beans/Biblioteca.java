package com.prueba.bancard.biblioteca.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class Biblioteca {

    public List<Sucursal> sucursales;
    public Map<Usuario, Double> multas;

    public Biblioteca() {
        this.sucursales = new ArrayList<>();
    }

    public Biblioteca(List<Sucursal> sucursales, Map<Usuario, Double> multas) {
        this.sucursales = sucursales;
        this.multas = multas;
    }

    public void agregarSucursal(Sucursal sucursal){
        this.sucursales.add(sucursal);
    }

    public void agregarLibro(int idSucursal, Libro libro){
        this.sucursales.stream().filter(sucur -> sucur.getId() == idSucursal).findFirst().get().getLibros().add(libro);
    }

    public void registrarUsuario(int idSucursal, Usuario usuario){
        this.sucursales.stream().filter(sucur -> sucur.getId() == idSucursal).findFirst().get().getUsuarios().add(usuario);
    }

    public void prestarLibro(int idSucursal, int idUsuario, int idLibro){
        Optional<Libro> libroAPrestar =
                this.sucursales.stream().filter(sucur -> sucur.getId() == idSucursal).findFirst().get().getLibros().
                stream().filter( libro -> libro.getId() == idLibro).findFirst();
        if (libroAPrestar.isPresent()){// se verifica si existe el libro
            if(!libroAPrestar.get().getPrestado()){// se verifica si el libro ya esta prestado
                this.sucursales.stream().filter(sucur -> sucur.getId() == idSucursal).findFirst().get().getUsuarios().
                        stream().filter(usuario -> usuario.getId() == idUsuario).findFirst().get().getLibrosPrestados().add(libroAPrestar.get());
            }//se cambia estado a prestado
            libroAPrestar.get().setPrestado(true);

        }

    }

    @Override
    public String toString() {
        return "Biblioteca{" +
                "sucursales=" + sucursales +
                ", multas=" + multas +
                '}';
    }
}
