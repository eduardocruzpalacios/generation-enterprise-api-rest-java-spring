/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import com.ejemplos.spring.model.Cargo;

public interface CargoService {

	public List<Cargo> findAll();

	public List<Cargo> findById(int idcargo);

}
