package com.atividade06.model;

import com.atividade06.interfaces.IDados;

public class Veiculo implements IDados {
    private String Modelo;
    private String placa;
    private String ano;
    private String fabricante;
    private String cor;    
    private Pessoa proprietario;


    public Veiculo(String Modelo, String placa, String ano, String fabricante, String cor, Pessoa proprietario) {
        this.Modelo = Modelo;
        this.placa = placa;
        this.ano = ano;
        this.fabricante = fabricante;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public String getModelo() {
        return this.Modelo;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getAno() {
        return this.ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Pessoa getProprietario() {
        return this.proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }


   

    @Override
    public String exibirDados() {
        return "Modelo do veículo: " + Modelo + "\n" +
               "Placa  do veículo:  " + placa + "\n" +
               "Ano  do veículo: " + ano + "\n" +
               "Fabricante  do veículo: " + fabricante + "\n" +
               "Cor  do veículo: " + cor + "\n" +
               "Proprietário do veículo: " + proprietario.getNome() + "\n" +
               "CPF do Proprietário: " + proprietario.getCpf() + "\n" +
               "E-mail do Proprietário: " + proprietario.getEmail() + "\n" +
               "Telefone do Proprietário: " + proprietario.getTelefone() + "\n" +
                "Endereço do Proprietário: " + proprietario.getEndereco() + "\n";



    }


}
