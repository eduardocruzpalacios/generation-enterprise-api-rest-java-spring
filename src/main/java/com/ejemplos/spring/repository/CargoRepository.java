/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplos.spring.model.Cargo;

public interface CargoRepository extends JpaRepository<Cargo, Integer> {

}
