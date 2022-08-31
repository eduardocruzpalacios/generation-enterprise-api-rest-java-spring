/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Mensaje;
import com.ejemplos.spring.repository.MensajeRepository;

@Service
public class MensajeServiceImpl implements MensajeService {

	@Autowired
	MensajeRepository mensajeRepository;

	@Override
	public Mensaje save(Mensaje mensaje) {
		return mensajeRepository.save(mensaje);
	}

	@Override
	public List<Mensaje> findAll() {
		return mensajeRepository.findAll();
	}

}
