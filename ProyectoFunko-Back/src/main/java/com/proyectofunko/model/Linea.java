package com.proyectofunko.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "linea")
public class Linea {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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
	public Linea() {

	}

	public Linea(String nombre) {
		this.nombre = nombre;
	}

	public Linea(Long id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

}
