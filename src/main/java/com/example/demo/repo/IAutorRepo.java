package com.example.demo.repo;


import com.example.demo.repo.modelo.Autor;

public interface IAutorRepo {
	
	public void insertar (Autor autor);
	public Autor seleccionar (Integer id);
	public void actualizar (Autor autor);
	public void eliminar (Integer id);

}
