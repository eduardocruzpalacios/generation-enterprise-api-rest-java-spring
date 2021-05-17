/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*

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
	@Override
	public List<Persona> findAll() {
		return repo.findAll();
	}

	// metodo para guardar 1 persona
	@Override
	public Persona save(Persona p) {
		return repo.save(p);
	}

	// metodo para llamar un objeto (para luego modificarlo)
	@Override
	public List<Persona> findById(int idpersona) {
		return repo.findById(idpersona);
	}

}
