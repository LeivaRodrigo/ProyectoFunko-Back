package com.proyectofunko.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectofunko.services.ListaFunkoService;

@RestController
@RequestMapping("/listaFunko/")
public class ListaFunkoController {

	@Autowired
	private ListaFunkoService listaFunkoService;

}
