package com.crud.app.models;

import java.io.Serializable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class Pessoa implements Serializable {

    // Atributos
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private Long idPessoa;
    private String nome;
    private String cpf;
    private String email;

    // Construtores
    public Pessoa(Long idPessoa, String nome, String cpf, String email) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
