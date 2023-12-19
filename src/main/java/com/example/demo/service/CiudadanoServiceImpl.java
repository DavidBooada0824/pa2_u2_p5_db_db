package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICiudadanoRepo;
import com.example.demo.repo.modelo.Ciudadano;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService{

	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;
	@Override
	public void ingresar(Ciudadano ciudadano) {
		// TODO Auto-generated method stub
		this.iCiudadanoRepo.insetar(ciudadano);
	}
	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.encontrar(id);
	}
	
	

}
