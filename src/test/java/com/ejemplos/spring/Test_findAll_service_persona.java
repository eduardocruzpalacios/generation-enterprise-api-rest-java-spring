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

import com.ejemplos.spring.service.PersonaService;
import com.ejemplos.spring.service.PersonaServiceImpl;
@SpringBootTest
public class Test_findAll_service_persona {

	@Autowired
	private PersonaService service;
	
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
	
	//Ahora con la clase que implementa la interfaz
	
	@Autowired
	private PersonaServiceImpl serviceImpl;
	
	@Test // comprobamos si service contiene algo
	void claseContieneCosas() {
		assertThat(serviceImpl).isNotNull();
	}
	
	@Test // comprobamos si el método finfAll() no devuelve nada
	void claseNoDevuelveNada() {
		assertThat(serviceImpl.findAll()).isNull();
	}
	
	@Test // comprobamos si el método finfAll() nos devuelve algo
	void claseDevuelveCosas() {
		assertThat(serviceImpl.findAll()).isNotNull();
	}
	
}
