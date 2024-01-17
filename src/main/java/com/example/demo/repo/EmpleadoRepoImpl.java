package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements IEmpleadoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Empleado empleado) {
		this.entityManager.persist(empleado);
	}

	@Override
	public Empleado seleccionar(Integer id) {

		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void modificar(Empleado empleado) {
		this.entityManager.merge(empleado);

	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.seleccionar(id));

	}

}
