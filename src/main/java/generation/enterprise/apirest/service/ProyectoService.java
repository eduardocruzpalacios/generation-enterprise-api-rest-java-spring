/*

*Fecha: 14/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.service;

import java.util.List;

import generation.enterprise.apirest.model.Proyecto;

public interface ProyectoService {

	public Proyecto create(Proyecto proyecto);

	public List<Proyecto> findAll();

	public List<Proyecto> findById(int id);

	public List<Proyecto> findByCliente(int id);

	public Proyecto update(Proyecto proyecto);

	public void delete(int id);

}
