package com.example.demo.repo;

import com.example.demo.repo.modelo.Empleado;

public interface IEmpleadoRepo {

	public void crear(Empleado empleado);

	public Empleado seleccionar(Integer id);

	public void modificar(Empleado empleado);

	public void eliminar(Integer id);

}
