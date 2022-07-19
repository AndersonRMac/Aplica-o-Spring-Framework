package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    UsuarioRepostory dao;

    @GetMapping("/login")
    public String Login (){
        return "login";
    }

    @PostMapping("/login")
    public String logar(Model model, String email, String senha){
        return "login";
    }
}
