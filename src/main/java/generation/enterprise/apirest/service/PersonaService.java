/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.service;

import java.util.List;

import generation.enterprise.apirest.model.Persona;

public interface PersonaService {

	public Persona create(Persona persona);

	public List<Persona> findAll();

	public List<Persona> findById(int id);

	public Persona update(Persona persona);

	public void delete(int id);

}
