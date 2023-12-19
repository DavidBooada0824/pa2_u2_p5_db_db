package com.example.demo.service;

import com.example.demo.repo.modelo.Ciudadano;

public interface ICiudadanoService {

	public void ingresar(Ciudadano ciudadano);
	
	public Ciudadano buscar(Integer id);

}
