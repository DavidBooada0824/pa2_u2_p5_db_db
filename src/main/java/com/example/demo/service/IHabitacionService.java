package com.example.demo.service;

import com.example.demo.repo.modelo.Habitacion;

public interface IHabitacionService {
	
	public void ingresar (Habitacion habitacion);
	
	public Habitacion buscar(Integer id);
	
	public void actualizar(Habitacion habitacion);
	
	public void borrar (Integer id);
	

}
