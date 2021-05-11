/*
 * class ClienteRest
 * 11/05/2021
 * v 1.0
 * @Miguel
 */

package com.ejemplos.spring.controller;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController
//@RequestMapping("clientes")
@SpringBootApplication
public class ClienteRest implements CommandLineRunner {
	
	private ClienteRepositoryImpl clienteRepository;
	
	//@GetMapping("/listar")
	//public List<Cliente> listarCLientes(){
		
		//return clienteRepository.findAll();
	//}

	SpringApplication app = new SpringApplication(ClienteRest.class);
	
	
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		RestTemplate plantilla = new RestTemplate();
		clienteRepository resultado = plantilla.getForObject("http://localhost:5000/clientes", clienteRepository.class);
		//System.out.println(resultado);
		
	}
	

}
