/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package com.ejemplos.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplos.spring.model.Proyecto;
import com.ejemplos.spring.repository.ProyectoRepository;

@Service
public class ProyectoServiceImpl implements ProyectoService {

	@Autowired
	ProyectoRepository repo;

	// Metodo para listar
	@Override
	public List<Proyecto> findAll() {
		return repo.findAll();
	}

	// método para guardar
	@Override
	public Proyecto save(Proyecto proyecto) {
		return repo.save(proyecto);
	}

	// metodo para llamar un objeto (para luego modificarlo)
	@Override
	public List<Proyecto> findById(int idproyecto) {
		return repo.findById(idproyecto);
	}

	@Override
	public void deleteById(Integer idproyecto) {
		repo.deleteById(idproyecto);
	}

}
