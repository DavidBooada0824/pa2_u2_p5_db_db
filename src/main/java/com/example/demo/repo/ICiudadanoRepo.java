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

	// necesitro una funcionalidad cuando sea de pichincha lo busque por nombre
	// cuando sea de cotopaxi lo busque por apellido
	// cuando no sea ninguna de las dos lo busque por cedula

	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula);

	// Deber

	public Ciudadano seleccionarEdadGeneroPorCriteria(String edad, String genero, String cedula);

	public Ciudadano seleccionarApellidoHobbiePorCriteria(String apellido, String hobbie, String cedula);

	public Ciudadano seleccionarEdadGeneroPorCriteriaAndOr(String edad, String genero, String cedula);

	public Ciudadano seleccionarApellidoHobbiePorCriteriaAndOr(String apellido, String hobbie, String cedula);

	public Ciudadano seleccionarNombrePorCriteriaAndOr(String nombre, String hobbie, String cedula);

}
