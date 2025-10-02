package com.crud.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.crud.app.controllers.Produtos;
import com.crud.app.controllers.produtoService;
import com.crud.app.models.Pessoa;

import ch.qos.logback.core.model.Model;

@Repository
public interface AppRepository extends CrudRepository<Pessoa, Long> {
    Pessoa findAllByIdPessoa(Long idPessoa);

    Pessoa findByIdPessoa(Long idPessoa);
    // Use Long como tipo do ID se o ID da sua entidade Pessoa for Long

    @GetMapping("/tabelaValoresLavanderia")
    default String mostrarTabela(Model model) {
    List<Produtos> produtos = produtoService.buscarTodos();
    ((RedirectAttributes) model).addAttribute("produtos", produtos);
    return "tabelaValoresLavanderia"; // nome do template HTML sem extensão
    }
}