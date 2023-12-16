package com.example.demo.repo.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

	@SequenceGenerator(name = "seq_ani", sequenceName = "seq_ani", allocationSize = 1)
	@GeneratedValue(generator = "seq_ani", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "anim_id")
	private Integer id;
	@Column(name = "anim_nombre_comun")
	private String nombreComun;
	@Column(name = "anim_nombre_cientifico")
	private String nombreCientifico;
	@Column(name = "anim_peso")
	private Double peso;
	@Column(name = "anim_fecha_nacimiento")
	private LocalDate fechaNacimiento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombreComun() {
		return nombreComun;
	}

	public void setNombreComun(String nombreComun) {
		this.nombreComun = nombreComun;
	}

	public String getNombreCientifico() {
		return nombreCientifico;
	}

	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Animal [id=" + id + ", nombreComun=" + nombreComun + ", nombreCientifico=" + nombreCientifico
				+ ", peso=" + peso + ", fechaNacimiento=" + fechaNacimiento + "]";
	}

}
