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

	// criteria

	public Ciudadano buscarPorCriteria(String nombre, String apellido, String cedula);

	public Ciudadano buscarPorCriteriaAndOr(String nombre, String apellido, String cedula);

	// deber

	public Ciudadano buscarEdadGeneroPorCriteria(String edad, String genero, String cedula);

	public Ciudadano buscarApellidoHobbiePorCriteria(String apellido, String hobbie, String cedula);

	public Ciudadano buscarEdadGeneroPorCriteriaAndOr(String edad, String genero, String cedula);

	public Ciudadano buscarApellidoHobbiePorCriteriaAndOr(String apellido, String hobbie, String cedula);

	public Ciudadano buscarNombrePorCriteriaAndOr(String nombre, String hobbie, String cedula);
}
