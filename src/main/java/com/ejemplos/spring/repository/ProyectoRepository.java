/* date: 11 / may / 2021
 * 
 * @author: Edu
 * 
 * version: 1.0
 * 
 */
package com.ejemplos.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepository<Proyecto> extends JpaRepository<Proyecto, Integer> {

}
