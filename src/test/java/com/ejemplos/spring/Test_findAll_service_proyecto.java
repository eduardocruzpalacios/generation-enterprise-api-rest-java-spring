/*
 * @Author Maria
 * @Version 1.0
 */

package com.ejemplos.spring;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.service.ProyectoServiceImpl;

@SpringBootTest
public class Test_findAll_service_proyecto {
	
 
	@Autowired
	private ProyectoServiceImpl proyectoServiceImpl;
	
	public List<Proyecto> findAll() {
		List<Proyecto> listaProyectos = new ArrayList<Proyecto>();
		//listaProyectos.add(new Proyecto(1, "movieflix", "15/03/2021", "CRUD", "aplicación de gestion de películas", "/src/main/resources/static/img/movieflix.jpg", 1));
		return listaProyectos;
	}
	
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
