/*

*Fecha: 20/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.model.Proyecto;

@SpringBootTest
public class Test_proyecto {

	Proyecto p = new Proyecto();

	@Test
	void objetoContieneCosas() {
		assertThat(p).isNotNull();
	}

	@Test
	void objetoNoContieneCosas() {
		assertThat(p).isNull();
	}

}
