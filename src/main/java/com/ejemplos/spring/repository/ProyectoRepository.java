/* date: 11 / may / 2021
 * 
 * @author: Edu
 * 
 * version: 1.0
 * 
 */
package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplos.spring.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

}
