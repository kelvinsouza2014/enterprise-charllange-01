package com.api.helpergov.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UsuarioController {

	   @GetMapping("/login")
	    public String exibirFormularioDeLogin() {
	        return "login"; 
	    }

	    @PostMapping("/login")
	    public String enviarFormularioDeLogin(
	        @RequestParam String rh,
	        @RequestParam String senha,
	        Model model
	    ) {
	    
	   

	        return "redirect:/home"; // Redireciona para a página principal (home.html) após o login bem-sucedido
	    }
	}