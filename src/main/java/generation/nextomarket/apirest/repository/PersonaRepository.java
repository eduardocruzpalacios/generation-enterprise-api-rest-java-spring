/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.nextomarket.apirest.model.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer> {

}
