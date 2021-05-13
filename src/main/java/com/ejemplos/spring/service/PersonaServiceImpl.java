/*
 * 13 mayo 2021
 */
package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Persona;
import com.ejemplos.spring.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository repo;

	// metodo para listar personas
	public List<Persona> findAll() {
		return repo.findAll();
	}
}
