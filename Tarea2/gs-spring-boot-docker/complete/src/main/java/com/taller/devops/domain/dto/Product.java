/**
 * 
 */
package com.taller.devops.domain.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Asus
 *
 */
public class Product {

	  @JsonProperty("id")
	  private Long id = null;
	  
	  @JsonProperty("nombre")
	  private String nombre = null;
	  
	  @JsonProperty("precio")
	  private String precio = null;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
}
