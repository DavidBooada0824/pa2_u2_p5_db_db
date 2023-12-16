package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IAlumnoRepo;
import com.example.demo.repo.modelo.Alumno;

@Service
public class AlumnoServiceImpl implements IAlumnoService{
	
	@Autowired
	private IAlumnoRepo iAlumnoRepo;

	@Override
	public void insertar(Alumno alumno) {
		this.iAlumnoRepo.crear(alumno);
		
	}

	@Override
	public Alumno encontar(Integer id) {
		// TODO Auto-generated method stub
		return this.iAlumnoRepo.buscar(id);
	}

	@Override
	public void modificar(Alumno alumno) {
		this.iAlumnoRepo.actualziar(alumno);
		
	}

	@Override
	public void borrar(Integer id) {
		this.iAlumnoRepo.eliminar(id);
		
	}

}
