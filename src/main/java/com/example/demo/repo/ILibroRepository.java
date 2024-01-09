package com.example.demo.repo;

import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

public interface ILibroRepository {

	public void insertar(Libro libro);
	public Libro seleccionar(Integer id);
	public void actualizar (Libro libro);
	public void eliminar (Integer id);
	
	public void insertar(Libro2 libro2);
	
	//query
	
	public Libro selecionarNombre(String nommbre);
	
	
	
	
}
