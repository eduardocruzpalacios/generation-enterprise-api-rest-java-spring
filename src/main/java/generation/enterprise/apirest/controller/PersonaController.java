/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import generation.enterprise.apirest.model.Persona;
import generation.enterprise.apirest.service.PersonaService;

@RestController
public class PersonaController {

	@Autowired
	private PersonaService personaService;

	@PostMapping("/personas/create")
	public void create(@RequestBody Persona persona) {
		personaService.create(persona);
	}

	@GetMapping("/personas")
	public List<Persona> findAll() {
		return personaService.findAll();
	}

	@GetMapping("/personas/{id}")
	public List<Persona> findById(@PathVariable int id) {
		return personaService.findById(id);
	}

	@PutMapping("/personas/{idpersona}/update")
	public void update(@RequestBody Persona persona) {
		personaService.update(persona);
	}

	@DeleteMapping("/personas/{id}/delete")
	public void delete(@PathVariable int id) {
		personaService.delete(id);
	}

}
