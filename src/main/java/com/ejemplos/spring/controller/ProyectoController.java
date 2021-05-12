/*
 * class ClienteRest
 * 11/05/2021
 * v 1.0
 * @Miguel
 */

package com.ejemplos.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.ejemplos.spring.model.Cliente;
import com.ejemplos.spring.repository.ClienteRepository;

@RestController
public class ProyectoController {

	@Autowired
	private ClienteRepository<Cliente> clienteRepository;

	@GetMapping("/listar")
	public List<Cliente> listarCLientes() {

		return clienteRepository.findAll();
	}

}
