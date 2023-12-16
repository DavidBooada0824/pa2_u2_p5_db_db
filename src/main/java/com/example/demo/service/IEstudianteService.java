package com.example.demo.service;

import com.example.demo.repo.modelo.Estudiante;

public interface IEstudianteService {
	
	public void insertar(Estudiante estudiante);
	
	public Estudiante encontrar(Integer id);
	

	public void modificar(Estudiante estudiante);
	
	public void borrar(Integer id);
	

}
