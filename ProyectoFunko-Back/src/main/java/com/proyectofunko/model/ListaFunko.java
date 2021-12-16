package com.proyectofunko.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "listaFunko")
public class ListaFunko {

	@Id
	private Long id;
	private String nombre;

	// Setters & Getters
	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	// Constructors
	public ListaFunko() {

	}

	public ListaFunko(String nombre) {
		this.nombre = nombre;
	}

	public ListaFunko(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

}
