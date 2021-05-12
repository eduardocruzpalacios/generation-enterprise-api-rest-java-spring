/*
 * @Author Maria
 * @Version 1.0
 */

package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Cliente;
@Service
public interface ClienteService {

	// metodo para listar clientes
	public List<Cliente> findAll();

}
