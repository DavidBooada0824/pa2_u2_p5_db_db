package com.example.demo.repo;

import com.example.demo.repo.modelo.Habitacion;

public interface IHabitacionRepo {
	
	public void crear (Habitacion habitacion);
	
	public Habitacion encontrar(Integer id);
	
	public void modificar(Habitacion habitacion);
	
	public void eliminar (Integer id);
	
	

}
