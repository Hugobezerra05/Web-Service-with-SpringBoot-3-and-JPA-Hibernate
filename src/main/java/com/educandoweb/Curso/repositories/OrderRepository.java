package com.educandoweb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
