package com.proyectofunko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "funko")
public class Funko {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Integer numero;
	private String nombre;
	private String estado;
	@ManyToOne
	@JoinColumn(name = "id_franquicia")
	private Franquicia franquicia;
	@ManyToOne
	@JoinColumn(name = "id_linea")
	private Linea linea;

	
	// Setters & Getters
	public Long getId() {
		return id;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Franquicia getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(Franquicia franquicia) {
		this.franquicia = franquicia;
	}

	public Linea getLinea() {
		return linea;
	}

	public void setLinea(Linea linea) {
		this.linea = linea;
	}

	
	// Constructors
	public Funko() {

	}

	public Funko(String nombre, Linea linea, Integer numero, Franquicia franquicia) {
		this.nombre = nombre;
		this.linea = linea;
		this.numero = numero;
		this.franquicia = franquicia;
	}

	public Funko(Long id, String nombre, Linea linea, Integer numero, Franquicia franquicia) {
		this.id = id;
		this.nombre = nombre;
		this.linea = linea;
		this.numero = numero;
		this.franquicia = franquicia;
	}

}
