package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.model.Persona;

@SpringBootTest
public class Test_persona {

	Persona p = new Persona();
	
	@Test // comprobamos si el objeto contiene ALGO
	void objetoContieneCosas() {
		assertThat(p).isNotNull();
	}
	
	@Test // comprobamos si el objeto NO contiene NADA
	void objetoNoContieneCosas() {
		assertThat(p).isNull();
	}
	
}
