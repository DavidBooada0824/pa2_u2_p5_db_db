package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ILibroRepo;
import com.example.demo.repo.modelo.Libro;

@Service
public class LibroServiceImpl implements ILibroService{
	
	@Autowired
	private ILibroRepo iLibroRepo;

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo.insertar(libro);
		
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepo.seleccionar(id);
	}

	@Override
	public void modificar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepo.actualizar(libro);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepo.eliminar(id);
		
	}
	
	

}
