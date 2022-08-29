/*

*Fecha: 20/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

//import java.util.ArrayList;
//import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

//import com.ejemplos.spring.model.Cliente;
//import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.service.ProyectoService;
import com.ejemplos.spring.service.ProyectoServiceImpl;

@SpringBootTest
public class Test_findAll_service_proyecto {

	@Autowired
	private ProyectoService service;

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
	private ProyectoServiceImpl proyectoServiceImpl;

	@Test
	void claseContieneCosas() {
		assertThat(proyectoServiceImpl).isNotNull();
	}

	@Test
	void claseNoDevuelveNada() {
		assertThat(proyectoServiceImpl.findAll()).isNull();
	}

	@Test
	void claseDevuelveCosas() {
		assertThat(proyectoServiceImpl.findAll()).isNotNull();
	}

}
