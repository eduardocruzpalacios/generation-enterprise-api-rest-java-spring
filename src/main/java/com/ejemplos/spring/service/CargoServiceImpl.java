/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Cargo;
import com.ejemplos.spring.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService {

	@Autowired
	CargoRepository repo;

	@Override
	public List<Cargo> findAll() {
		return repo.findAll();
	}

	@Override
	public List<Cargo> findById(int idcargo) {
		return repo.findById(idcargo);
	}

}
