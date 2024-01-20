package com.example.demo.repo;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;

public interface ICiudadanoRepo {

	public void crear(Ciudadano ciudadano);

	public Ciudadano seleccionar(Integer id);

	public void modificar(Ciudadano ciudadano);

	public void eliminar(Integer id);

	public Empleado seleccionarPorCedula(String cedula);

	public Ciudadano selecionarPorCedulaCiu(String cedula);

	// Named
	public Ciudadano selecionarPorApellidoNamed(String apellido);

	public Ciudadano selecionarPorNombreNamed(String nombre);

	public Ciudadano selecionarPorCedulaNamed(String cedula);

	// Native

	public Ciudadano selecionarPorApellidoNative(String apellido);

	public Ciudadano selecionarPorNombreNative(String nombre);

	public Ciudadano selecionarPorEdadNative(String edad);

	public Ciudadano selecionarPorHobbieNative(String hobbie);

	public Ciudadano selecionarPorGeneroNative(String genero);

}
