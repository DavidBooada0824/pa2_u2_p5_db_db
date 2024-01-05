package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IHabitacionRepo;
import com.example.demo.repo.modelo.Habitacion;

@Service
public class HabitacionServiceImpl implements IHabitacionService {
	
	@Autowired
	private IHabitacionRepo iHabitacionRepo;

	@Override
	public void ingresar(Habitacion habitacion) {
		this.iHabitacionRepo.crear(habitacion);
		
	}

	@Override
	public Habitacion buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iHabitacionRepo.encontrar(id);
	}

	@Override
	public void actualizar(Habitacion habitacion) {
		this.iHabitacionRepo.modificar(habitacion);
		
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iHabitacionRepo.eliminar(id);
	}

}
