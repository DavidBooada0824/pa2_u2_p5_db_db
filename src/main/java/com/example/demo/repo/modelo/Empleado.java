package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
@NamedQuery(name = "Empleado.buscarPorApellido", query = "SELECT e FROM Empleado e WHERE e.ciudadano.apellido=:DatoApellido")
@NamedQuery(name = "Empleado.buscarPorNombre", query = "SELECT e FROM Empleado e WHERE e.ciudadano.nombre=:DatoNombre")
public class Empleado {

	@SequenceGenerator(name = "seq_empleado", sequenceName = "seq_empleado", allocationSize = 1)
	@GeneratedValue(generator = "seq_empleado", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "empl_id")
	private Integer id;

	@Column(name = "empl_salario")
	private BigDecimal salario;

	@Column(name = "empl_fecha_ingreso")
	private LocalDateTime fechaIngreso;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empleado_id_ciudadano")
	private Ciudadano ciudadano;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso + "]";
	}

}
