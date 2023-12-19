package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImple implements IEmpleadoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Empleado empleado) {
		this.entityManager.persist(empleado);
		
	}

}
