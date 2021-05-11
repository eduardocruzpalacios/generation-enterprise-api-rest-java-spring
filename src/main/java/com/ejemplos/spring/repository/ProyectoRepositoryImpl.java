package com.ejemplos.spring.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Proyecto;

@Repository
public class ProyectoRepositoryImpl implements ProyectoRepository {

	private List<Proyecto> proyectos = new ArrayList<Proyecto>();

	@Override
	public List<Proyecto> findAll() {
		return proyectos;
	}

}
