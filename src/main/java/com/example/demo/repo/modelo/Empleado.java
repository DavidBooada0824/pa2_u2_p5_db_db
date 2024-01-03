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
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {

	@SequenceGenerator(name = "seq_emple", sequenceName = "seq_emple", allocationSize = 1)
	@GeneratedValue(generator = "seq_emple", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "emple_id")
	private Integer id;
	@Column(name = "emple_salario")
	private BigDecimal salario;
	@Column(name = "emple_fecha_ingreso")
	private LocalDateTime fechaIngreso;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "empleado_id_ciudadano")
	
	private Ciudadano ciudadano;

	public Ciudadano getCiudadano() {
		return ciudadano;
	}

	public void setCiudadano(Ciudadano ciudadano) {
		this.ciudadano = ciudadano;
	}

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

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", salario=" + salario + ", fechaIngreso=" + fechaIngreso + ", ciudadano="
				+ ciudadano + "]";
	}

}
