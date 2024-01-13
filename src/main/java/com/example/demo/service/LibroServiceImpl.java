package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ILibroRepository;
import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

@Service
public class LibroServiceImpl implements ILibroService {

	@Autowired
	private ILibroRepository iLibroRepository;

	@Override
	public void guardar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro);
	}

	@Override
	public Libro buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionar(id);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.iLibroRepository.actualizar(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iLibroRepository.eliminar(id);
	}

	@Override
	public void guardar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.iLibroRepository.insertar(libro2);
	}

	@Override
	public Libro2 buscarNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.selecionarNombre(nombre);
	}

	@Override
	public List<Libro> buscarPorfecha(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorfecha(fechaPublicacion);
	}

	@Override
	public Libro buscarPorTitulo(String titulo) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorTitulo(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaTyped(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorFechaTyped(fechaPublicacion);
	}

	@Override
	public Libro buscarPorTituloNamed(String titulo) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorTituloNamed(titulo);
	}

	@Override
	public List<Libro> buscarPorFechaNamed(LocalDate fechaPublicacion) {
		// TODO Auto-generated method stub
		return this.iLibroRepository.seleccionarPorFechaNamed(fechaPublicacion);
	}

}
