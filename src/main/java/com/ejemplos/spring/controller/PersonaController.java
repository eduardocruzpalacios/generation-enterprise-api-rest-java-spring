/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Persona;
import com.ejemplos.spring.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@PostMapping("/personas/create")
	public void create(@RequestBody Persona persona) {
		personaService.save(persona);
	}

	@GetMapping("/personas")
	public List<Persona> readAll() {
		return personaService.findAll();
	}

	@PutMapping("/personas/{idpersona}/update")
	public void update(@RequestBody Persona persona) {
		personaService.save(persona);
	}

	@DeleteMapping("/personas/{id}/delete")
	public void delete(@PathVariable("id") Integer id) {
		personaService.deleteById(id);
	}

}
