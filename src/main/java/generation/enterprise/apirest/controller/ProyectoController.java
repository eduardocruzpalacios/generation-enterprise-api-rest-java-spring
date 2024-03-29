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

import generation.enterprise.apirest.model.Proyecto;
import generation.enterprise.apirest.service.ProyectoService;

@RestController
public class ProyectoController {

	@Autowired
	private ProyectoService proyectoService;

	@PostMapping("/proyectos/create")
	public void create(@RequestBody Proyecto proyecto) {
		proyectoService.create(proyecto);
	}

	@GetMapping("/proyectos")
	public List<Proyecto> findAll() {
		return proyectoService.findAll();
	}

	@GetMapping("/proyectos/{id}")
	public List<Proyecto> finadById(@PathVariable int id) {
		return proyectoService.findById(id);
	}

	@GetMapping("/proyectos/cliente/{id}")
	public List<Proyecto> readByCliente(@PathVariable int id) {
		return proyectoService.findByCliente(id);
	}

	@PutMapping("/proyectos/{id}/update")
	public void update(@RequestBody Proyecto proyecto) {
		proyectoService.update(proyecto);
	}

	@DeleteMapping("/proyectos/{id}/delete")
	public void delete(@PathVariable int id) {
		proyectoService.delete(id);
	}

}
