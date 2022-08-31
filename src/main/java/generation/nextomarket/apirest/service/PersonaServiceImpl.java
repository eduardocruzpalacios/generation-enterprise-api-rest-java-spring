/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import generation.nextomarket.apirest.model.Persona;
import generation.nextomarket.apirest.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Persona save(Persona persona) {
		return personaRepository.save(persona);
	}

	@Override
	public void deleteById(Integer id) {
		personaRepository.deleteById(id);
	}

}