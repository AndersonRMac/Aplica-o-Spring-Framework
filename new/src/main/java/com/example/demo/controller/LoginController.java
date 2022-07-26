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

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String salvaUsuario (Usuario newUser){
        dao.save(newUser);
        return "redirect:/login";
    }


}
