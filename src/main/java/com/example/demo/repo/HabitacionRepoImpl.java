package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Habitacion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class HabitacionRepoImpl implements IHabitacionRepo {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Habitacion habitacion) {
		this.entityManager.persist(habitacion);
		
	}

	@Override
	public Habitacion encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Habitacion.class, id);
	}

	@Override
	public void modificar(Habitacion habitacion) {
		this.entityManager.merge(habitacion);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.encontrar(id));
	}
	
	

}
