/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import generation.nextomarket.apirest.model.Proyecto;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {

	public List<Proyecto> findById(int idproyecto);

}
