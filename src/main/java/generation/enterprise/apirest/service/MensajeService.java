/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.service;

import java.util.List;

import generation.enterprise.apirest.model.Mensaje;

public interface MensajeService {

	public List<Mensaje> findAll();

	public Mensaje create(Mensaje mensaje);

}
