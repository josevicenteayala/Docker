/**
 * 
 */
package com.taller.devops.persistence.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.taller.devops.domain.dto.Product;

/**
 * @author Asus
 *
 */
@Service
public class ProductRepositoryImpl {

	/* (non-Javadoc)
	 * @see com.taller.devops.persistence.repository.ProductRepository#consultarProductos()
	 */
	public List<Product> consultarProductos() throws Exception {
		List<Product> listaProductos = new ArrayList<>();
		Product producto = crearProducto();
		listaProductos.add(producto);
		return listaProductos;
	}

	private Product crearProducto() {
		Product producto = new Product();
		producto.setId(1L);
		producto.setNombre("Gorra Nike");
		producto.setPrecio("10");
		return producto;
	}

}
