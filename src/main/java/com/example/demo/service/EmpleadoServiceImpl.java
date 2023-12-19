package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IEmpleadoRepo;
import com.example.demo.repo.modelo.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpledoService{

	@Autowired
	private IEmpleadoRepo empleadoRepo;
	@Override
	public void ingresar(Empleado empleado) {
		this.empleadoRepo.insertar(empleado);
		
	}

}
