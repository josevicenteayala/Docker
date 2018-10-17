/**
 * 
 */
package com.taller.devops.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.taller.devops.api.ProductApi;
import com.taller.devops.domain.dto.Product;
import com.taller.devops.services.ProductService;

/**
 * @author Asus
 *
 */
@CrossOrigin
@RestController
public class ProductApiController implements ProductApi {

	
	@Autowired
	private ProductService productService;
	
	/* (non-Javadoc)
	 * @see com.taller.devops.api.ProductApi#consultarProductos()
	 */
	@Override
	public ResponseEntity<List<Product>> consultarProductos() {		
		try {
			List<Product> listaProductos = productService.consultarProductos();
			return new ResponseEntity<List<Product>>(listaProductos,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@Override
	public ResponseEntity<List<Product>> insertarProducto(@RequestBody(required=true) Product product) {
		try {
			List<Product> listaProductos = productService.guardarProducto(product);
			return new ResponseEntity<List<Product>>(listaProductos,HttpStatus.OK);
		}catch(Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<List<Product>>(HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
