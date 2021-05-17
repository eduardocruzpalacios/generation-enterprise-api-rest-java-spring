/*

*Fecha: 14/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Proyecto;

public interface ProyectoService {

	// Metodo para listar proyectos
	public List<Proyecto> findAll();

	// Metodo para guardar un nuevo proyecto
	public Proyecto save(Proyecto p);

	// metodo para llamar un objeto (para luego modificarlo)
	public List<Proyecto> findById(int idproyecto);
	
	// metodo para borrar un objeto por id
	public void deleteById(Integer idproyecto);
}
