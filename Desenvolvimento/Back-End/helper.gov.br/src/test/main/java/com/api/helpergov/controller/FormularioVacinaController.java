package com.api.helpergov.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.api.helpergov.model.FormularioVacina;

import org.springframework.web.bind.annotation.ModelAttribute;


import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.validation.BindingResult; // Importe BindingResult

import javax.validation.Valid; // Importe Valid


@Controller
@RequestMapping("/vacina")
public class FormularioVacinaController {

    private List<FormularioVacina> listaVacinas = new ArrayList<>();

    @GetMapping("/vacina/registro")
    public String exibirFormulario(Model model) {
        model.addAttribute("vacina", new FormularioVacina());
        return "formularioVacina";
    }

    @PostMapping("/vacina/registro")
    public String submeterFormulario(@ModelAttribute FormularioVacina vacina) {
        
        listaVacinas.add(vacina);

        return "redirect:/vacina/confirmacao";
    }
}
