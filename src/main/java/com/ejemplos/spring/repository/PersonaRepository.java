/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*

*/

package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
