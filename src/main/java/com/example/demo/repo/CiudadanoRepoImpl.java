package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Ciudadano;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insetar(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);

	}

	@Override
	public Ciudadano encontrar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Ciudadano.class, id);
	}

}
