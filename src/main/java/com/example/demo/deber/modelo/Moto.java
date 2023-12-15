package com.example.demo.deber.modelo;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "moto")
public class Moto {

	@SequenceGenerator(name = "seq_moto", sequenceName = "seq_moto", allocationSize = 1)
	@GeneratedValue(generator = "seq_moto", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "moto_id")
	private Integer id;

	@Column(name = "moto_modelo")
	private String modelo;

	@Column(name = "moto_anio_fabricacion")
	private LocalDate anioFabricacion;

	@Column(name = "moto_cilindraje")
	private String cilindraje;

	@Column(name = "moto_estilo")
	private String estilo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

	@Override
	public String toString() {
		return "Moto [id=" + id + ", modelo=" + modelo + ", anioFabricacion=" + anioFabricacion + ", cilindraje="
				+ cilindraje + ", estilo=" + estilo + "]";
	}

}
