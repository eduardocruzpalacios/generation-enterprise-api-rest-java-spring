/*
 * 13 mayo 2021
 */
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Cargo;

public interface CargoService {

	// metodo para listar cargos
	public List<Cargo> findAll();

}
