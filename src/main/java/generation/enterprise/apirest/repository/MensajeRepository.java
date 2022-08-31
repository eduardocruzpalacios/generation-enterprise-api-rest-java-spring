/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.enterprise.apirest.model.Mensaje;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

}
