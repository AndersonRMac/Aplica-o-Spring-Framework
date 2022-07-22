package com.example.demo.repository;

import com.example.demo.model.Saidas;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface SaidaRepository extends CrudRepository<Saidas, Long> {
}
