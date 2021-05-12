/*
 * @Author Maria
 * @Version 1.0
 */

package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Proyecto;

@Service
public interface ProyectoService {

	// Metodo para listar proyectos
	public List<Proyecto> findAll();

	// Metodo para guardar un nuevo proyecto
	public Proyecto save(Proyecto p);

}
