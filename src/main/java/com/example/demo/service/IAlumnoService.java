package com.example.demo.service;

import com.example.demo.repo.modelo.Alumno;

public interface IAlumnoService {

	public void insertar(Alumno alumno);

	public Alumno encontar(Integer id);

	public void modificar(Alumno alumno);

	public void borrar(Integer id);
}
