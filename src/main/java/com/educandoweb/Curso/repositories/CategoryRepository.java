package com.educandoweb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
