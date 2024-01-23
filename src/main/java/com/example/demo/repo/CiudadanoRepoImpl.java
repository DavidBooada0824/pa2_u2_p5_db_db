package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Ciudadano;
import com.example.demo.repo.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
		Query myQuery = this.entityManager.createNativeQuery("SELECT * FROM ciudadano c WHERE  c.ciud_cedula=:cedula",
				Ciudadano.class);
		myQuery.setParameter("cedula", cedula);

		return (Ciudadano) myQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteria(String nombre, String apellido, String cedula) {

		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionGenererica = null;

		if (cedula.startsWith("17")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		} else if (cedula.startsWith("05")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionGenererica);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarPorCriteriaAndOr(String nombre, String apellido, String cedula) {

		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionTotal = null;
		Predicate codicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		Predicate codicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(codicionNombre, codicionApellido);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(codicionNombre, codicionApellido);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionTotal);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarEdadGeneroPorCriteria(String edad, String genero, String cedula) {
		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionGenererica = null;

		if (cedula.startsWith("17")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("edad"), edad);
		} else if (cedula.startsWith("05")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("genero"), genero);
		} else {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionGenererica);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarApellidoHobbiePorCriteria(String apellido, String hobbie, String cedula) {
		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionGenererica = null;

		if (cedula.startsWith("17")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		} else if (cedula.startsWith("05")) {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("hobbie"), hobbie);
		} else {
			condicionGenererica = myCriteriaBuilder.equal(myFrom.get("cedula"), cedula);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionGenererica);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarEdadGeneroPorCriteriaAndOr(String edad, String genero, String cedula) {
		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionTotal = null;
		Predicate codicionEdad = myCriteriaBuilder.equal(myFrom.get("edad"), edad);
		Predicate codicionGenero = myCriteriaBuilder.equal(myFrom.get("genero"), genero);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(codicionEdad, codicionGenero);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(codicionEdad, codicionGenero);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionTotal);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarApellidoHobbiePorCriteriaAndOr(String apellido, String hobbie, String cedula) {
		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionTotal = null;
		Predicate codicionApellido = myCriteriaBuilder.equal(myFrom.get("apellido"), apellido);
		Predicate codicionHobbie = myCriteriaBuilder.equal(myFrom.get("hobbie"), hobbie);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(codicionApellido, codicionHobbie);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(codicionApellido, codicionHobbie);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionTotal);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

	@Override
	public Ciudadano seleccionarNombrePorCriteriaAndOr(String nombre, String hobbie, String cedula) {
		// o creamos una instancia de la interface CriteriaBuilder apartir de un
		// EntityManager
		CriteriaBuilder myCriteriaBuilder = this.entityManager.getCriteriaBuilder();
		// paso1 especificar el tipo deretorno de mi Consulta
		CriteriaQuery<Ciudadano> mycCriteriaQuery = myCriteriaBuilder.createQuery(Ciudadano.class);
		// 2.Construir el SQÑ
		// 2.1Determinmos el from (Root)
		// no necesariamente el from no es igual al tipo de retorno
		Root<Ciudadano> myFrom = mycCriteriaQuery.from(Ciudadano.class);
		// 2.2 Construir las condiciones (Where) del sql
		// En Criteria Api Query se les conoce como Predicate

		Predicate condicionTotal = null;
		Predicate codicionNombre = myCriteriaBuilder.equal(myFrom.get("nombre"), nombre);
		Predicate codicionHobbie = myCriteriaBuilder.equal(myFrom.get("hobbie"), hobbie);

		if (cedula.startsWith("17")) {
			condicionTotal = myCriteriaBuilder.or(codicionNombre, codicionHobbie);
		} else if (cedula.startsWith("05")) {
			condicionTotal = myCriteriaBuilder.and(codicionNombre, codicionHobbie);
		}

		// construimos el SQL Final

		mycCriteriaQuery.select(myFrom).where(condicionTotal);

		TypedQuery<Ciudadano> myTypedQuery = this.entityManager.createQuery(mycCriteriaQuery);

		return myTypedQuery.getSingleResult();
	}

}
