package com.example.demo.repo.modelo;


import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor2")
public class Autor2 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_autor2")
	@SequenceGenerator(name = "seq_autor2",sequenceName = "seq_autor2",allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_nombre")
	private String nombre;
	@Column(name = "auto_nacionalidad")
	private String nacionalidad;
	
	//private List <AutorLibro> autoresLibros;
	
	
	
	//GET Y SET
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
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	@Override
	public String toString() {
		return "Autor [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "]";
	}
	
	

}