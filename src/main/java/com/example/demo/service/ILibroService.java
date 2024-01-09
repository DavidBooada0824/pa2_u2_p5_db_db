package com.example.demo.service;

import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

public interface ILibroService {
	
	public void guardar(Libro libro);
	public Libro buscar(Integer id);
	public void actualizar (Libro libro);
	public void eliminar (Integer id);
	
	public void guardar(Libro2 libro2);
	
	public Libro buscarNombre(String nombre);
}
