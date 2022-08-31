/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Mensaje;

public interface MensajeService {

	public List<Mensaje> findAll();

	public Mensaje save(Mensaje mensaje);

}
