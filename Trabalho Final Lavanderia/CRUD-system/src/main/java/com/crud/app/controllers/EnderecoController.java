package com.crud.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EnderecoController {

    @GetMapping("/endereco")
    public String endereco() {
        return "endereco"; // Nome do arquivo HTML sem .html
    }
}