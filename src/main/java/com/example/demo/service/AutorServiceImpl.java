package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IAutorRepo;
import com.example.demo.repo.modelo.Autor;

@Service
public class AutorServiceImpl implements IAutorService {

	@Autowired
	private IAutorRepo iAutorRepo;

	@Override
	public void guardar(Autor autor) {
		this.iAutorRepo.insertar(autor);

	}

	@Override
	public Autor buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAutorRepo.seleccionar(id);
	}

	@Override
	public void modificar(Autor autor) {
		this.iAutorRepo.actualizar(autor);
	}

	@Override
	public void borrar(Integer id) {
		this.iAutorRepo.eliminar(id);

	}

}
