package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    UsuarioRepostory dao;

    @GetMapping("/login")
    public String Login (){
        return "login";
    }

    @PostMapping("/login")
    public Usuario salvaUsuario (@RequestBody Usuario newUser){
        Usuario resultado = dao.save(newUser);
        return resultado;
    }

    @GetMapping("/{id}")
    public Usuario finById (@PathVariable Long id){
        Usuario resultado = dao.findById(id).get();
        return resultado;
    }
}
//ver anotações do spring validation