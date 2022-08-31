/*

*Fecha: 30/08/2022

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.service;

import java.util.List;

import generation.nextomarket.apirest.model.Mensaje;

public interface MensajeService {

	public List<Mensaje> findAll();

	public Mensaje save(Mensaje mensaje);

}
