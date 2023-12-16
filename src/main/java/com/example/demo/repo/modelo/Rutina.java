package com.example.demo.repo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "rutina")
public class Rutina {

	@SequenceGenerator(name = "seq_ruti", sequenceName = "seq_ruti", allocationSize = 1)
	@GeneratedValue(generator = "seq_ruti", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "ruti_id")
	private Integer id;

	@Column(name = "ruti_objetivo")
	private String objetivo;

	@Column(name = "ruti_duracion")
	private String duracion;

	@Column(name = "ruti_tipo_ejercicio")
	private String tipoEjercicio;

	@Column(name = "ruti_nivel_intensidad")
	private String nivelIntensidad;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public String getTipoEjercicio() {
		return tipoEjercicio;
	}

	public void setTipoEjercicio(String tipoEjercicio) {
		this.tipoEjercicio = tipoEjercicio;
	}

	public String getNivelIntensidad() {
		return nivelIntensidad;
	}

	public void setNivelIntensidad(String nivelIntensidad) {
		this.nivelIntensidad = nivelIntensidad;
	}

	@Override
	public String toString() {
		return "Rutina [id=" + id + ", objetivo=" + objetivo + ", duracion=" + duracion + ", tipoEjercicio="
				+ tipoEjercicio + ", nivelIntensidad=" + nivelIntensidad + "]";
	}

}
