package com.proyectofunko.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectofunko.model.Funko;

public interface FunkoRepository extends JpaRepository<Funko, Long> {

}
