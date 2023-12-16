package com.example.demo.repo;

import com.example.demo.repo.modelo.Alumno;

public interface IAlumnoRepo {
	
	public void crear(Alumno alumno);
	
	public Alumno buscar(Integer id);
	

	public void actualziar(Alumno alumno);
	
	public void eliminar(Integer id);
	

}
