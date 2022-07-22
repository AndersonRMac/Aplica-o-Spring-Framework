package com.example.demo.controller;

import com.example.demo.model.Usuario;
import com.example.demo.repository.UsuarioRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    UsuarioRepostory dao;

    Usuario user = new Usuario();

    @GetMapping("/login")
    public String Login (){
        return "login";
    }

    @PostMapping("/login")
    public String logar(Model model, String nome, String email, String senha){
        user.setNome(nome);
        user.setEmail(email);
        user.setSenha(senha);
        dao.save(user);

        return "/index";
    }
}
//ver anotações do spring validation