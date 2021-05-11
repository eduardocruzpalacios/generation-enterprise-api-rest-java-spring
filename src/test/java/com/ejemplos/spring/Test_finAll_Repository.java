package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.repository.ProyectoRepositoryImpl;

@SpringBootTest
public class Test_finAll_Repository {
	
	@Test
	void esInstancia() {
		ProyectoRepositoryImpl a = new ProyectoRepositoryImpl();
		if (b instanceof ArrayList) {
			assertThat(true).isTrue();
		} else {
			assertThat(false).isTrue();
		}
	}

	@Test
	void metodoFunciona() {
		ProyectoRepositoryImpl a = new ProyectoRepositoryImpl();
		List<Proyecto> b = a.findAll();
		if (b instanceof ArrayList) {
			assertThat(true).isTrue();
		} else {
			assertThat(false).isTrue();
		}
	}

}
