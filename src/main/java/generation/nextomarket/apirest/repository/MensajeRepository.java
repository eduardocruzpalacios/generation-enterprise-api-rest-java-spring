/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.nextomarket.apirest.model.Mensaje;

@Repository
public interface MensajeRepository extends JpaRepository<Mensaje, Integer> {

}
