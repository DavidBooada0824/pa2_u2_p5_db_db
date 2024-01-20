package com.example.demo.service;

import com.example.demo.repo.modelo.Empleado;

public interface IEmpleadoService {

	public void ingresar(Empleado empleado);

	public Empleado buscar(Integer id);

	public void actualizar(Empleado empleado);

	public void borrar(Integer id);

	// named
	public Empleado buscarPorApellidoNamed(String apellido);
	
	public Empleado buscarPorApellidonNombre(String nombre);

}
