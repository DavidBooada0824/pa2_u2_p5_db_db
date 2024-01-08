package com.example.demo.repo;


import com.example.demo.repo.modelo.Libro;

public interface ILibroRepo {
	
	public void insertar (Libro libro);
	public Libro seleccionar (Integer id);
	public void actualizar (Libro libro);
	public void eliminar (Integer id);

}
