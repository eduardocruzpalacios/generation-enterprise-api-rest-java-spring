/*

*Fecha: 20/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

import com.ejemplos.spring.model.Cargo;

public class Test_cargo {

	Cargo c = new Cargo();

	@Test
	void objetoContieneCosas() {
		assertThat(c).isNotNull();
	}

	@Test
	void objetoNoContieneCosas() {
		assertThat(c).isNull();
	}

}
