package com.crud.app.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

@Controller
public class CrudController {

    @Autowired
    private AppRepository csr;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/cadastrar")
    public String cadastrarForm() {
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(Pessoa usuario) {
        csr.save(usuario);
        return "redirect:/";
    }

    @GetMapping("/listarUsuarios")
    public ModelAndView listarUsuarios() {
        ModelAndView mv = new ModelAndView("listarUsuarios");
        mv.addObject("usuarios", csr.findAll());
        return mv;
    }
}