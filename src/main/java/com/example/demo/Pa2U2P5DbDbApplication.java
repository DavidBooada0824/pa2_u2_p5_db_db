package com.example.demo;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Autor;
import com.example.demo.repo.modelo.Libro;
import com.example.demo.service.ILibroService;

@SpringBootApplication
public class Pa2U2P5DbDbApplication implements CommandLineRunner {

	@Autowired
	private ILibroService iLibroService;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P5DbDbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	

		Set<Autor> autores = new HashSet<Autor>();
		Set<Libro> libros = new HashSet<Libro>();

		Autor autor = new Autor();
		autor.setNacionalidad("Argentino");
		autor.setNombre("Paolo ");
		
		Autor autor2 = new Autor();
		autor2.setNacionalidad("Frances");
		autor2.setNombre("Edwin");	
		
		autores.add(autor);
		autores.add(autor2);		
		
		Libro libro = new Libro();
		libro.setAutores(null);
		libro.setFechaPublicacion(LocalDate.now());
		libro.setTitulo("20 poemas de amor y Una cancvion desesperada");
		libro.setAutores(autores);
		
		libros.add(libro);
		
		autor.setLibro(libros);
		autor2.setLibro(libros);
		
		this.iLibroService.guardar(libro);

	}

}
