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
}
