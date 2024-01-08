package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Autor;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepoImpl implements IAutorRepo{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(autor);
		
	}

	@Override
	public Autor seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void actualizar(Autor autor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(autor);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Autor autor = this.seleccionar(id);
		this.entityManager.remove(autor);
		
	}

}
