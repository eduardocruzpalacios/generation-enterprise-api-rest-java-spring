/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Persona;

public interface PersonaService {

	public List<Persona> findAll();

	public Persona save(Persona persona);

	public void deleteById(Integer id);

}
