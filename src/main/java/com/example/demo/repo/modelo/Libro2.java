package com.example.demo.repo.modelo;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "libro2")
public class Libro2 {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_libro2")
	@SequenceGenerator(name = "seq_libro2", sequenceName = "seq_libro2", allocationSize = 1)
	@Column(name = "libr_id")
	private Integer id;
	@Column(name = "libr_titulo")
	private String titulo;
	@Column(name = "libr_fecha_publicacion")
	private LocalDate fechaPublicaciom;
	@OneToMany(mappedBy = "libro2", cascade = CascadeType.ALL)
	private List<AutorLibro> autoresLibros;

	// set y get
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getFechaPublicaciom() {
		return fechaPublicaciom;
	}

	public void setFechaPublicaciom(LocalDate fechaPublicaciom) {
		this.fechaPublicaciom = fechaPublicaciom;
	}

	public List<AutorLibro> getAutoresLibros() {
		return autoresLibros;
	}

	public void setAutoresLibros(List<AutorLibro> autoresLibros) {
		this.autoresLibros = autoresLibros;
	}
	
}
