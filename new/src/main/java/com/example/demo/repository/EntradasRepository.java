package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface EntradasRepository extends CrudRepository<Id, Long> {
}
