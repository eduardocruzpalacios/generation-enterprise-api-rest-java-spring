/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Persona;

public interface PersonaService {

	// metodo para listar personas
	public List<Persona> findAll();

	// Metodo para guardar una nueva persona
	public Persona save(Persona persona);

	// metodo para llamar un objeto (para luego modificarlo)
	public List<Persona> findById(int idpersona);

	// metodo para borrar un objeto por id
	public void deleteById(Integer idpersona);
}
