package com.taller.devops.services.impl;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taller.devops.domain.dto.Product;
import com.taller.devops.persistence.domain.Producto;
import com.taller.devops.persistence.repository.ProductRepository;
import com.taller.devops.services.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

	private ModelMapper modelMapper = new ModelMapper();
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public List<Product> consultarProductos() throws Exception {
		List<Producto> listaProductos = productRepository.findAll();
		Type listaTemporal = new TypeToken<List<Product>>(){}.getType();
		return modelMapper.map(listaProductos, listaTemporal);
	}

	@Override
	public List<Product> guardarProducto(Product product) throws Exception {
		Producto producto = modelMapper.map(product, Producto.class);		
		Producto productoGuardado = productRepository.save(producto);
		product.setId(productoGuardado.getId());
		List<Product> listaProducto = new ArrayList<>();
		listaProducto.add(product);
		return listaProducto;
	}

}
