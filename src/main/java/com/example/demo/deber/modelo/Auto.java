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
@Table(name = "auto")
public class Auto {

	@SequenceGenerator(name = "seq_ani", sequenceName = "seq_ani", allocationSize = 1)
	@GeneratedValue(generator = "seq_ani", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_modelo")
	private String modelo;
	@Column(name = "auto_marca")
	private String marca;
	@Column(name = "auto_anio_fabricacion")
	private LocalDate anioFabricacion;
	@Column(name = "auto_cilindraje")
	private String cilidraje;
	@Column(name = "auto_transmision")
	private String transmision;

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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public LocalDate getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(LocalDate anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

	public String getCilidraje() {
		return cilidraje;
	}

	public void setCilidraje(String cilidraje) {
		this.cilidraje = cilidraje;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}

	@Override
	public String toString() {
		return "Auto [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", anioFabricacion=" + anioFabricacion
				+ ", cilidraje=" + cilidraje + ", transmision=" + transmision + "]";
	}

}
