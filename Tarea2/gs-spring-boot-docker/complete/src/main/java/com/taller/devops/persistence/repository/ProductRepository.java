/**
 * 
 */
package com.taller.devops.persistence.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taller.devops.domain.dto.Product;
import com.taller.devops.persistence.domain.Producto;

/**
 * @author Asus
 *
 */
public interface ProductRepository extends JpaRepository<Producto, Serializable>{

	List<Product> consultarProductos() throws Exception;

}
