/**
 * 
 */
package com.taller.devops.api;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.taller.devops.domain.dto.Product;

/**
 * @author Asus
 *
 */

public interface ProductApi {

	@GetMapping(value = "/productos",produces = { MediaType.APPLICATION_JSON_VALUE })
	ResponseEntity<List<Product>> consultarProductos();
	
	@PostMapping(value="/productos",consumes=MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
	ResponseEntity<List<Product>> insertarProducto(@RequestBody(required=true) Product product);
}
