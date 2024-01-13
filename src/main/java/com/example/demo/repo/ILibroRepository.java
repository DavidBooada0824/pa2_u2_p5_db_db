package com.example.demo.repo;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

public interface ILibroRepository {

	public void insertar(Libro libro);

	public Libro seleccionar(Integer id);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	public void insertar(Libro2 libro2);

	// query

	public Libro2 selecionarNombre(String nommbre);

	public List<Libro> seleccionarPorfecha(LocalDate fechaPublicacion);

	public Libro seleccionarPorTitulo(String titulo);
	
	public List<Libro> seleccionarPorFechaTyped(LocalDate fechaPublicacion);
	
	//namedQuery
	public Libro seleccionarPorTituloNamed(String titulo);
	
	public List<Libro> seleccionarPorFechaNamed(LocalDate fechaPublicacion);
	
	

}
