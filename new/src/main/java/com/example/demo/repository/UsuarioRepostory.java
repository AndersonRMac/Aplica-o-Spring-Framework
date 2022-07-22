package com.example.demo.repository;

import com.example.demo.model.Usuario;
import org.springframework.data.repository.CrudRepository;

import javax.persistence.Id;

public interface UsuarioRepostory extends CrudRepository<Usuario, Long> {
}
