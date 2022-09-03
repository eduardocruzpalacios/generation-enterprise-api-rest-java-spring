/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import generation.enterprise.apirest.model.Mensaje;
import generation.enterprise.apirest.repository.MensajeRepository;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	MensajeRepository mensajeRepository;

	@Override
	public Mensaje create(Mensaje mensaje) {
		return mensajeRepository.save(mensaje);
	}

	@Override
	public List<Mensaje> findAll() {
		return mensajeRepository.findAll();
	}

}
