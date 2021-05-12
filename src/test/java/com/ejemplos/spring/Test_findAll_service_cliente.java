package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.service.ClienteServiceImpl;

@SpringBootTest
public class Test_findAll_service_cliente {
	/*

	@Autowired
	private ClienteServiceImpl clienteServiceImpl;

	@Test
	void existe() {
		assertThat(clienteServiceImpl).isNotNull();
	}

	@Test
	void noDevuelveNada() {
		assertThat(clienteServiceImpl.findAll()).isNull();
	}

	@Test
	void devuelveCosas() {
		assertThat(clienteServiceImpl.findAll()).isNotNull();
	}
	*/
}
