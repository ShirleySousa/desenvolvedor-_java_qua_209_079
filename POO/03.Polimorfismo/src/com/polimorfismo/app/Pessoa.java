package com.polimorfismo.app;

abstract public class pessoa {
    //atributos
    public String email;
    public String telefone;
    public String endereco;


    public pessoa(String email, String telefone, String endereco) {
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    
    public String cumprimentar() {
        return null;
    }
}
