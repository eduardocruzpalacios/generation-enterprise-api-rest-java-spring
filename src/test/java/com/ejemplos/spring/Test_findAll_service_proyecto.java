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
	
	//public List<Proyecto> findAll() {
		//Cliente c = new Cliente(1, "Pedro", "Barrantes", "img/zizou entrenador.jpg");

		//List<Proyecto> listaProyectos = new ArrayList<Proyecto>();
		//listaProyectos.add(new Proyecto(1, "movieflix", "15/03/2021", "CRUD", "aplicación de gestion de películas", "/src/main/resources/static/img/movieflix.jpg", c));
		//return listaProyectos;
	//}
	
	@Test // comprobamos si service contiene algo
	void interfazContieneCosas() {
		assertThat(service).isNotNull();
	}
	
	@Test // comprobamos si el método finfAll() no devuelve nada
	void interfazNoDevuelveNada() {
		assertThat(service.findAll()).isNull();
	}
	
	@Test // comprobamos si el método finfAll() nos devuelve algo
	void interfazDevuelveCosas() {
		assertThat(service.findAll()).isNotNull();
	}
	
	//Ahora con la clase que implementa el método
	
	@Autowired
	private ProyectoServiceImpl proyectoServiceImpl;
	
	@Test // comprobamos si service contiene algo
	void claseContieneCosas() {
		assertThat(proyectoServiceImpl).isNotNull();
	}
	
	@Test // comprobamos si el método finfAll() no devuelve nada
	void claseNoDevuelveNada() {
		assertThat(proyectoServiceImpl.findAll()).isNull();
	}
	
	@Test // comprobamos si el método finfAll() nos devuelve algo
	void claseDevuelveCosas() {
		assertThat(proyectoServiceImpl.findAll()).isNotNull();
	}
	
}
