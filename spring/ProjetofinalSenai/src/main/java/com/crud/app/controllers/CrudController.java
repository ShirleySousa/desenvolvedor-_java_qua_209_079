package com.crud.app.controllers;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;


import com.crud.app.models.Pessoa;
import com.crud.app.repository.AppRepository;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



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

    @RequestMapping(value = "/alterarUsuario/{idPessoa}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
    public ModelAndView alterarUsuario(@PathVariable("idPessoa") Long idPessoa) {
        Pessoa usuario = csr.findById(idPessoa).orElse(null);
        ModelAndView mv = new ModelAndView("alterarUsuario");
        mv.addObject("usuario", usuario);
        return mv;
    }

    @RequestMapping(value = "/alterarUsuario/{idPessoa}", method = RequestMethod.POST)
    public String alterarUsuarioPost(@PathVariable("idPessoa") Long idPessoa, @Validated Pessoa usuario, BindingResult result, RedirectAttributes attributes) {
        if (result.hasErrors()) {
            attributes.addFlashAttribute("erro", "Dados inválidos!");
            return "redirect:/alterarUsuario/" + idPessoa;
        }
        usuario.setIdPessoa(idPessoa); // Garante que o id está correto
        csr.save(usuario);
        return "redirect:/listarUsuarios";
    }
    
    @RequestMapping("/confirmarExclusao/{idPessoa}")
    public ModelAndView confirmarExclusao(@PathVariable("idPessoa") long idPessoa) {
        Pessoa usuario = csr.findById(idPessoa).orElse(null);
        ModelAndView mv = new ModelAndView("excluirUsuario");
        mv.addObject("usuario", usuario); 
        return mv;
    }

    @RequestMapping("/excluirUsuario")
    public String excluirUsuario(@RequestParam("idPessoa") long idPessoa) { 
        Pessoa usuario = csr.findById(idPessoa).orElse(null);
        if (usuario != null) {
            csr.delete(usuario);
        }
        return "redirect:/listarUsuarios";
    }

    @GetMapping("/tabelaValoresLavanderia")
public String mostrarTabela(Model model) {
    List<Produtos> produtos = new ArrayList<>();

    produtos.add(new Produtos("Lavagem de Camiseta", 5.00));
    produtos.add(new Produtos("Lavagem de Calça", 8.00));
    produtos.add(new Produtos("Lavagem de Casaco", 15.00));
    produtos.add(new Produtos("Passar Roupa (por peça)", 3.00));
    produtos.add(new Produtos("Lavagem a Seco", 20.00));
    produtos.add(new Produtos("Tratamento de Manchas", 10.00));

    model.addAttribute("produtos", produtos); // ✅ CORRETO

    return "tabelaValoresLavanderia";
}

    
}

