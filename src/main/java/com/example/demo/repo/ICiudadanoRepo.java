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

}
