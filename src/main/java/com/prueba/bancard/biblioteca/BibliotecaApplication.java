package com.prueba.bancard.biblioteca;

import com.prueba.bancard.biblioteca.beans.Biblioteca;
import com.prueba.bancard.biblioteca.beans.Libro;
import com.prueba.bancard.biblioteca.beans.Sucursal;
import com.prueba.bancard.biblioteca.beans.Usuario;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BibliotecaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibliotecaApplication.class, args);
		//se declara una biblioteca
		System.out.println("se declara una biblioteca");
		Biblioteca biblioteca = new Biblioteca();
		System.out.println(biblioteca.toString());
		//se agrega una sucursal
		System.out.println("se agrega una sucursal");
		biblioteca.agregarSucursal(new Sucursal(1, "Sucursal1", new ArrayList<>(), new ArrayList<>()));
		System.out.println(biblioteca.toString());
		//se agrega un usuario a a una sucursal
		System.out.println("se agrega un usuario a a una sucursal");
		biblioteca.registrarUsuario(1, new Usuario(1, "Juan Carlos "));
		System.out.println(biblioteca.toString());
		//se crea un libro y se agrega
		Libro libroPrueba = new Libro();
		libroPrueba.setTitulo("Libro prueba");
		libroPrueba.setId(1);
		//se agrega un libro
		System.out.println("se agrega un libro");
		biblioteca.agregarLibro(1, libroPrueba);
		System.out.println(biblioteca.toString());
		//se presta un libro
		System.out.println("se presta un libro");
		biblioteca.prestarLibro(1,1, 1);
		System.out.println(biblioteca.toString());
	}

}
