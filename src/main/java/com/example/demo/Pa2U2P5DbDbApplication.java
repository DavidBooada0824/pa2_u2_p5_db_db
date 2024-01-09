package com.example.demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.Autor2;
import com.example.demo.repo.modelo.AutorLibro;
import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;
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

		// libro con autores
		Libro2 l1 = new Libro2();
		l1.setTitulo("JAVA2");
		l1.setFechaPublicaciom(LocalDate.now());

		Autor2 a1 = new Autor2();
		a1.setNombre("Jose Rios2");
		a1.setNacional("peruano2");

		Autor2 a2 = new Autor2();
		a2.setNombre("Juan Montalvo2");
		a2.setNacional("ecuatoriano2");

		List<Autor2> autores = new ArrayList<Autor2>();
		autores.add(a2);
		autores.add(a1);

		AutorLibro autorLibro1 = new AutorLibro();
		autorLibro1.setLibro2(l1);
		autorLibro1.setAutor2(a1);

		AutorLibro autorLibro2 = new AutorLibro();
		autorLibro2.setLibro2(l1);
		autorLibro2.setAutor2(a2);

		List<AutorLibro> lista = new ArrayList<AutorLibro>();
		lista.add(autorLibro2);
		lista.add(autorLibro1);

		l1.setAutoresLibros(lista);

		// this.iLibroService.guardar(l1);

		Libro lib = this.iLibroService.buscarNombre("JAVA2");
		System.out.println(lib);

	}

}
