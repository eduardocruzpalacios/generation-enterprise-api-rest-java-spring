/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import generation.enterprise.apirest.model.Cargo;
import generation.enterprise.apirest.service.CargoService;

@RestController
public class CargoController {

	@Autowired
	private CargoService cargoService;

	@GetMapping("/cargos")
	public List<Cargo> findAll() {
		return cargoService.findAll();
	}

}
