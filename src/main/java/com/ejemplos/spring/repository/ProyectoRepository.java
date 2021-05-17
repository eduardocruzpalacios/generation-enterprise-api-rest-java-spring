/*

*13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/
package com.ejemplos.spring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

	// metodo para llamar un objeto (para luego modificarlo)
	public List<Proyecto> findById(int idproyecto);
}
