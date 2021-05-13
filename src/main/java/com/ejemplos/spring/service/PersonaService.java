/*
 * 13 mayo 2021
 */
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Persona;

public interface PersonaService {

	// metodo para listar personas
	public List<Persona> findAll();

}
