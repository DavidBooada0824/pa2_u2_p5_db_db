package com.example.demo.repo;

import com.example.demo.repo.modelo.Ciudadano;

public interface ICiudadanoRepo {

	public void insetar(Ciudadano ciudadano);

	public Ciudadano encontrar(Integer id);

}
