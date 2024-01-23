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

	@Override
	public Ciudadano buscarPorApellidoNamed(String apellido) {

		return this.iCiudadanoRepo.selecionarPorApellidoNamed(apellido);
	}

	@Override
	public Ciudadano buscarPorNombreNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorNombreNamed(nombre);
	}

	@Override
	public Ciudadano buscarPorCedulaNamed(String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorCedulaNamed(cedula);
	}

	@Override
	public Ciudadano buscarPorApellidoNative(String apellido) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorApellidoNative(apellido);
	}

	@Override
	public Ciudadano buscarPorNombreNative(String nombre) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorNombreNative(nombre);
	}

	@Override
	public Ciudadano buscarPorEdadNative(String edad) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorEdadNative(edad);
	}

	@Override
	public Ciudadano buscarPorHobbieNative(String hobbie) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorHobbieNative(hobbie);
	}

	@Override
	public Ciudadano buscarPorGeneroNative(String genero) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.selecionarPorGeneroNative(genero);
	}

	@Override
	public Ciudadano buscarPorApellidoCriteria(String apellido) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.seleccionarPorApellidoCriteria(apellido);
	}

	@Override
	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.seleccionarPorCriteria(nombre, apellido, cedula);
	}

	@Override
	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula) {
		// TODO Auto-generated method stub
		return this.iCiudadanoRepo.seleccionarPorCriteriaAndOr(nombre, apellido, cedula);
	}

}
