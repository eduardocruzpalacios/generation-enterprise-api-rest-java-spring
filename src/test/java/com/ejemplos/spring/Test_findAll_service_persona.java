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

	@Test
	void interfazContieneCosas() {
		assertThat(service).isNotNull();
	}

	@Test
	void interfazNoDevuelveNada() {
		assertThat(service.findAll()).isNull();
	}

	@Test
	void interfazDevuelveCosas() {
		assertThat(service.findAll()).isNotNull();
	}

	@Autowired
	private PersonaServiceImpl serviceImpl;

	@Test
	void claseContieneCosas() {
		assertThat(serviceImpl).isNotNull();
	}

	@Test
	void claseNoDevuelveNada() {
		assertThat(serviceImpl.findAll()).isNull();
	}

	@Test
	void claseDevuelveCosas() {
		assertThat(serviceImpl.findAll()).isNotNull();
	}

}
