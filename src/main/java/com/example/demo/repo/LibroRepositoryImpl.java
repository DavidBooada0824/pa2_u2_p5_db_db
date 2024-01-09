package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Libro;
import com.example.demo.repo.modelo.Libro2;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class LibroRepositoryImpl implements ILibroRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro);
	}

	@Override
	public Libro seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Libro.class, id);
	}

	@Override
	public void actualizar(Libro libro) {
		// TODO Auto-generated method stub
		this.entityManager.merge(libro);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		Libro l1 = this.seleccionar(id);
		this.entityManager.remove(l1);
	}

	@Override
	public void insertar(Libro2 libro2) {
		// TODO Auto-generated method stub
		this.entityManager.persist(libro2);
	}

	@Override
	public Libro selecionarNombre(String nommbre) {
		// select * from libro l Where l.libr_nombre = ?
		// SELECT l FROM Libro l WHERE l.titulo :variable
		Query myQuery = this.entityManager.createQuery("SELECT l FROM Libro l WHERE l.titulo :variable");
		myQuery.setParameter("variable", nommbre);
		return (Libro) myQuery.getSingleResult();
	}

}
