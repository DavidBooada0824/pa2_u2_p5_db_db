package com.example.demo;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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

		System.out.println("Query");
		List<Libro> lista = this.iLibroService.buscarPorfecha(LocalDate.of(2024, 01, 01));
		for (Libro libro : lista) {
			System.out.println(libro);
		}

		System.out.println("TypedQuery");
		Libro li = this.iLibroService.buscarPorTitulo("Web");
		System.out.println(li);

		List<Libro> lista2 = this.iLibroService.buscarPorFechaTyped(LocalDate.of(2024, 01, 01));
		for (Libro libro : lista2) {
			System.out.println(libro);
		}
		
		System.out.println("NamedQuery");
		Libro l2=this.iLibroService.buscarPorTituloNamed("Web");
		System.out.println(l2);
		
		List<Libro> lista3 =this.iLibroService.buscarPorFechaNamed(LocalDate.of(2024, 01, 01));
		for (Libro libro : lista3) {
			System.out.println(libro);
		}
		
		
		

	}

}
