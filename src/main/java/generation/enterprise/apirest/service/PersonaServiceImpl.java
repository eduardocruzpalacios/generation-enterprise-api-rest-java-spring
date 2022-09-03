/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import generation.enterprise.apirest.model.Persona;
import generation.enterprise.apirest.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	@Override
	public Persona create(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public List<Persona> findById(int id) {
		return personaRepository.findById(id);
	}

	@Override
	public Persona update(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public void delete(int id) {
		personaRepository.deleteById(id);
	}

}
