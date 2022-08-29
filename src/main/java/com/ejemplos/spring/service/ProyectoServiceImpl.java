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
	ProyectoRepository proyectoRepository;

	@Override
	public List<Proyecto> findAll() {
		return proyectoRepository.findAll();
	}

	@Override
	public List<Proyecto> findById(int id) {
		return proyectoRepository.findById(id);
	}

	@Override
	public Proyecto save(Proyecto proyecto) {
		return proyectoRepository.save(proyecto);
	}

	@Override
	public void deleteById(Integer id) {
		proyectoRepository.deleteById(id);
	}

}
