/*

*13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Proyecto;

public interface ProyectoService {

	// Metodo para listar proyectos
	public List<Proyecto> findAll();

	// Metodo para guardar un nuevo proyecto
	public Proyecto save(Proyecto p);

}
