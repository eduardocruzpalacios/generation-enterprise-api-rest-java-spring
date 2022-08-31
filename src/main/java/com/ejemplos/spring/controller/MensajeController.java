/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Mensaje;
import com.ejemplos.spring.service.MensajeService;

@RestController
public class MensajeController {

	@Autowired
	private MensajeService mensajeService;

	@PostMapping("/mensajes/create")
	public void create(@RequestBody Mensaje mensaje) {
		System.out.println("OOOOOOOOOOOOOOOOOOO       OOO " + mensaje);
		mensajeService.save(mensaje);
	}

	@GetMapping("/mensajes")
	public List<Mensaje> readAll() {
		return mensajeService.findAll();
	}

}
