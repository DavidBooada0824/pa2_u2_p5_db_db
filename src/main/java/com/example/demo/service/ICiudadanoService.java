package com.example.demo.service;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;

public interface ICiudadanoService {

	public void ingresar(Ciudadano ciudadano);

	public Ciudadano buscar(Integer id);

	public void actualizar(Ciudadano ciudadano);

	public void borrar(Integer id);

	public Empleado buscarPorCedula(String cedula);

	public Ciudadano selecionarPorCedulaCiu(String cedula);

	// Named
	public Ciudadano buscarPorApellidoNamed(String apellido);

	public Ciudadano buscarPorNombreNamed(String nombre);

	public Ciudadano buscarPorCedulaNamed(String cedula);

	// Native

	public Ciudadano buscarPorApellidoNative(String apellido);

	public Ciudadano buscarPorNombreNative(String nombre);

	public Ciudadano buscarPorEdadNative(String edad);

	public Ciudadano buscarPorHobbieNative(String hobbie);

	public Ciudadano buscarPorGeneroNative(String genero);

	// criteria

	public Ciudadano buscarPorApellidoCriteria(String apellido);

	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula);

}
