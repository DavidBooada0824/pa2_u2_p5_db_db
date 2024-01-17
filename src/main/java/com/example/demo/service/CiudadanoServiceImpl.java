package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICiudadanoRepo;
import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {

	@Autowired
	private ICiudadanoRepo iCiudadanoRepo;

	@Override
	public void ingresar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.crear(ciudadano);

	}

	@Override
	public Ciudadano buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.seleccionar(id);
	}

	@Override
	public void actualizar(Ciudadano ciudadano) {
		this.iCiudadanoRepo.modificar(ciudadano);
	}

	@Override
	public void borrar(Integer id) {
		this.iCiudadanoRepo.eliminar(id);

	}

	@Override
	public Empleado buscarPorCedula(String cedula) {

		return this.iCiudadanoRepo.seleccionarPorCedula(cedula);
	}

	@Override
	public Ciudadano selecionarPorCedulaCiu(String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorCedulaCiu(cedula);
	}

}
