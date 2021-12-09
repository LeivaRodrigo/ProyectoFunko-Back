package com.proyectofunko.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofunko.model.Linea;
import com.proyectofunko.services.LineaService;

@RestController
@RequestMapping("/linea/")
public class LineaController {

	@Autowired
	private LineaService lineaService;

	@GetMapping
	private ResponseEntity<List<Linea>> getAllLineas() {
		return ResponseEntity.ok(lineaService.findAll());
	}

}
