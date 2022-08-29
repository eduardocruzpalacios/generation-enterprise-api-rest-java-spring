/*

*Fecha: 14/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Proyecto;

public interface ProyectoService {

	public List<Proyecto> findAll();

	public Proyecto save(Proyecto proyecto);

	public List<Proyecto> findById(int idproyecto);

	public void deleteById(Integer idproyecto);

}
