package com.example.demo.repo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "autor2")
public class Autor2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_autor2")
	@SequenceGenerator(name = "seq_autor2", sequenceName = "seq_autor2", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;
	@Column(name = "auto_nombre")
	private String nombre;
	@Column(name = "auto_nacional")
	private String nacional;
	@OneToMany(mappedBy = "autor2")
	private List<AutorLibro> autoresLibros;

	// set y get
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

	public String getNacional() {
		return nacional;
	}

	public void setNacional(String nacional) {
		this.nacional = nacional;
	}

	public List<AutorLibro> getAutoresLibros() {
		return autoresLibros;
	}

	public void setAutoresLibros(List<AutorLibro> autoresLibros) {
		this.autoresLibros = autoresLibros;
	}

}
