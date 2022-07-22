package com.example.demo.repository;

import com.example.demo.model.Entradas;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface EntradasRepository extends CrudRepository<Entradas, Long> {
}
