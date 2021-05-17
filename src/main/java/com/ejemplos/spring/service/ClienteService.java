/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Cliente;

public interface ClienteService {

	// metodo para listar clientes
	public List<Cliente> findAll();

	// metodo para llamar un objeto (para luego modificarlo)
	public List<Cliente> findById(int idcliente);

}
