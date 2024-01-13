package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

public interface ILibroService {

	public void guardar(Libro libro);

	public Libro buscar(Integer id);

	public void actualizar(Libro libro);

	public void eliminar(Integer id);

	public void guardar(Libro2 libro2);

	public Libro2 buscarNombre(String nombre);

	public List<Libro> buscarPorfecha(LocalDate fechaPublicacion);

	public Libro buscarPorTitulo(String titulo);

	public List<Libro> buscarPorFechaTyped(LocalDate fechaPublicacion);

	public Libro buscarPorTituloNamed(String titulo);

	public List<Libro> buscarPorFechaNamed(LocalDate fechaPublicacion);

}
