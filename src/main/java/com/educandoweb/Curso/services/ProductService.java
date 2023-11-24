package com.educandoweb.Curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.Curso.entities.Product;
import com.educandoweb.Curso.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository ; 
	
	public List<Product> findAll() {
		return productRepository.findAll();
	}
	
	public Product findByTd(Long id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.get();
	}	
}
