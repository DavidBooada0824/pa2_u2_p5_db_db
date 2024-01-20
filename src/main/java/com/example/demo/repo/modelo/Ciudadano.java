package com.example.demo.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ciudadano")
@NamedQuery(name = "Ciudadano.buscarPorApellido", query = "SELECT c From Ciudadano c WHERE c.apellido=:DatoApellido")
@NamedQuery(name = "Ciudadano.buscarPorNombre", query = "SELECT c From Ciudadano c WHERE c.nombre=:DatoNombre")
@NamedQuery(name = "Ciudadano.buscarPorCedula", query = "SELECT c From Ciudadano c WHERE c.cedula=:DatoCedula")
public class Ciudadano {
	@Id
	@SequenceGenerator(name = "seq_ciudadano", sequenceName = "seq_ciudadano", allocationSize = 1)
	@GeneratedValue(generator = "seq_ciudadano", strategy = GenerationType.SEQUENCE)
	@Column(name = "ciud_id")
	private Integer id;

	@Column(name = "ciud_nombre")
	private String nombre;

	@Column(name = "ciud_apellido")
	private String apellido;

	@Column(name = "ciud_cedula")
	private String cedula;

	@Column(name = "ciud_edad")
	private String edad;

	@Column(name = "ciud_genero")
	private String genero;

	@Column(name = "ciud_hobbie")
	private String hobbie;

	@OneToOne(mappedBy = "ciudadano")
	private Empleado empleado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getHobbie() {
		return hobbie;
	}

	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "Ciudadano [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", edad=" + edad + ", genero=" + genero + ", hobbie=" + hobbie + "]";
	}

}
