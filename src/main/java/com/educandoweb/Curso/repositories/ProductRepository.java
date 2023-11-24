package com.educandoweb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
