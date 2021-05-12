package com.ejemplos.spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.ejemplos.spring.model.Proyecto;

@SpringBootApplication
public class GenerationEnterpriseRestApplication implements CommandLineRunner {

	public static void main(String[] args) {
		// SpringApplication.run(GenerationEnterpriseRestApplication.class, args);
		SpringApplication app = new SpringApplication(GenerationEnterpriseRestApplication.class);
		// app.setWebEnvironment(false); // no entiendo este error, he seguido
		// https://www.arquitecturajava.com/spring-rest-client-con-resttemplates/
		app.run(args);
	}

	@Override
	public void run(String... arg0) throws Exception {

		RestTemplate plantilla = new RestTemplate();
		Proyecto listarProyectos = plantilla.getForObject("http://localhost:8080/listar", Proyecto.class);
		System.out.println(listarProyectos);

	}

}
