package com.taller.devops.services;

import java.util.List;

import com.taller.devops.domain.dto.Product;

public interface ProductService {

	public List<Product> consultarProductos() throws Exception;

	public List<Product> guardarProducto(Product product) throws Exception;
	
}
