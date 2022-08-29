/*

*Fecha: 20/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.ejemplos.spring.model.Cliente;

public class Test_cliente {

	Cliente c = new Cliente();

	@Test
	void objetoContieneCosas() {
		assertThat(c).isNotNull();
	}

	@Test
	void objetoNoContieneCosas() {
		assertThat(c).isNull();
	}

}
