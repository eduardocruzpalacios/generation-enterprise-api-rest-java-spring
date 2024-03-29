/*

*Fecha: 13/05/2021

*@Author NextoMarket

*@Version 1.0

*/
package generation.enterprise.apirest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcliente;
	private String nombre;
	private String descripcion;
	private String logo;

	public Cliente() {
	}

	public Cliente(int idcliente, String nombre, String descripcion, String logo) {
		this.idcliente = idcliente;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.logo = logo;
	}

	public int getIdcliente() {
		return idcliente;
	}

	public void setIdcliente(int idcliente) {
		this.idcliente = idcliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	@Override
	public String toString() {
		return "Cliente [idcliente=" + idcliente + ", nombre=" + nombre + ", description=" + descripcion + ", logo="
				+ logo + "]";
	}

}
