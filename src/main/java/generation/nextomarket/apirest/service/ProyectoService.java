/*

*Fecha: 14/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.nextomarket.apirest.service;

import java.util.List;

import generation.nextomarket.apirest.model.Proyecto;

public interface ProyectoService {

	public List<Proyecto> findAll();

	public List<Proyecto> findById(int id);

	public Proyecto save(Proyecto proyecto);

	public void deleteById(Integer id);

}