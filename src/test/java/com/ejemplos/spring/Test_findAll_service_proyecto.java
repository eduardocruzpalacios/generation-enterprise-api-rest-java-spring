/*
 * @Author Maria
 * @Version 1.0
 */

package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.service.ProyectoServiceImpl;

@SpringBootTest
public class Test_findAll_service_proyecto {
 
	@Autowired
	private ProyectoServiceImpl proyectoServiceImpl;
	
	@Test
	void existe() {
		assertThat(proyectoServiceImpl).isNotNull();
	}
	
	@Test
	void noDevuelveNada() {
		assertThat(proyectoServiceImpl.findAll()).isNull();
	}
	
	@Test
	void devuelveCosas() {
		assertThat(proyectoServiceImpl.findAll()).isNotNull();
	}
	
}
