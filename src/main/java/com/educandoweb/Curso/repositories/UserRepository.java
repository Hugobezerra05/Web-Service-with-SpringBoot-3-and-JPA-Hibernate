package com.educandoweb.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
