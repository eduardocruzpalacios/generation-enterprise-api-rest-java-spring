/*

*Fecha: 20/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.service.ClienteService;
import com.ejemplos.spring.service.ClienteServiceImpl;


@SpringBootTest
public class Test_findAll_service_cliente {
	

	@Autowired
	private ClienteService service;

	@Test // comprobamos si service contiene algo
	void interfazContieneCosas() {
		assertThat(service).isNotNull();
	}
	
	@Test // comprobamos si el método finfAll() no devuelve nada
	void interfazNoDevuelveNada() {
		assertThat(service.findAll()).isNull();
	}
	
	@Test // comprobamos si el método finfAll() nos devuelve algo
	void interfazDevuelveCosas() {
		assertThat(service.findAll()).isNotNull();
	}
	
	//Ahora con la clase que implementa el método
	
	@Autowired
	private ClienteServiceImpl clienteServiceImpl;
	
	@Test // comprobamos si service contiene algo
	void claseContieneCosas() {
		assertThat(clienteServiceImpl).isNotNull();
	}
	
	@Test // comprobamos si el método finfAll() no devuelve nada
	void claseNoDevuelveNada() {
		assertThat(clienteServiceImpl.findAll()).isNull();
	}
	
	@Test // comprobamos si el método finfAll() nos devuelve algo
	void claseDevuelveCosas() {
		assertThat(clienteServiceImpl.findAll()).isNotNull();
	}
		
	
}
