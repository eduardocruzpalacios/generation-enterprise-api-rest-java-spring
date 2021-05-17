/*

*13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Cliente;
import com.ejemplos.spring.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements ClienteService {

	@Autowired
	ClienteRepository repo;

	// metodo para listar clientes
	public List<Cliente> findAll() {
		return repo.findAll();
	}

	// metodo para llamar un objeto (para luego modificarlo)
	@Override
	public List<Cliente> findById(int idcliente) {
		return repo.findById(idcliente);
	}

}
