package com.example.demo.repo;

import com.example.demo.repo.modelo.Estudiante;

public interface IEstudianteRepo {
	
	
	public void crear(Estudiante estudiante);
	
	public Estudiante buscar(Integer id);
	

	public void actualziar(Estudiante estudiante);
	
	public void eliminar(Integer id);
	
	

}
