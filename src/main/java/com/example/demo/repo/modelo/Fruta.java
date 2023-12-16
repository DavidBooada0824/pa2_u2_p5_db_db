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
@Table(name = "fruta")
public class Fruta {

	@SequenceGenerator(name = "seq_frut", sequenceName = "seq_frut", allocationSize = 1)
	@GeneratedValue(generator = "seq_frut", strategy = GenerationType.SEQUENCE)
	@Id
	@Column(name = "frut_id")
	private Integer id;

	@Column(name = "frut_tipo_fruta")
	private String tipoFruta;

	@Column(name = "frut_color")
	private String color;

	@Column(name = "frut_sabor")
	private String sabor;

	@Column(name = "frut_origen")
	private String origen;

	@Column(name = "frut_fecha_cosecha")
	private LocalDate fechaCosecha;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTipoFruta() {
		return tipoFruta;
	}

	public void setTipoFruta(String tipoFruta) {
		this.tipoFruta = tipoFruta;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public LocalDate getFechaCosecha() {
		return fechaCosecha;
	}

	public void setFechaCosecha(LocalDate fechaCosecha) {
		this.fechaCosecha = fechaCosecha;
	}

	@Override
	public String toString() {
		return "Fruta [id=" + id + ", tipoFruta=" + tipoFruta + ", color=" + color + ", sabor=" + sabor + ", origen="
				+ origen + ", fechaCosecha=" + fechaCosecha + "]";
	}

}
