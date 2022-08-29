/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

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

	@Override
	public List<Persona> findAll() {
		return repo.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		return repo.save(persona);
	}

	@Override
	public void deleteById(Integer idpersona) {
		repo.deleteById(idpersona);
	}

}
