package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class CiudadanoRepoImpl implements ICiudadanoRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Ciudadano ciudadano) {
		this.entityManager.persist(ciudadano);

	}

	@Override
	public Ciudadano seleccionar(Integer id) {

		return this.entityManager.find(Ciudadano.class, id);
	}

	@Override
	public void modificar(Ciudadano ciudadano) {
		this.entityManager.merge(ciudadano);

	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.seleccionar(id));

	}

	@Override
	public Empleado seleccionarPorCedula(String cedula) {
		TypedQuery<Empleado> myQuery = this.entityManager
				.createQuery("SELECT e FROM Empleado e WHERE e.ciudadano.cedula=:datoCedula", Empleado.class);
		myQuery.setParameter("datoCedula", cedula);
		return myQuery.getSingleResult();
	}

	@Override
	public Ciudadano selecionarPorCedulaCiu(String cedula) {
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE  c.ciud_cedula=:cedula", Ciudadano.class);
		myQuery.setParameter("cedula", cedula);

		return (Ciudadano) myQuery.getSingleResult();
	}

}
