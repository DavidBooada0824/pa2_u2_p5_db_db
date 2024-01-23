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

	// criteria

	public Ciudadano seleccionarPorApellidoCriteria(String apellido);

	// necesitro una funcionalidad cuando sea de pichincha lo busque por nombre
	// cuando sea de cotopaxi lo busque por apellido
	// cuando no sea ninguna de las dos lo busque por cedula

	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula);

}
