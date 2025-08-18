package com.imc.model;

public class Pessoa {

    private double peso;
    private double altura;


    //constutor 
    public Pessoa(String nome, double peso, double altura) {

        this.peso = peso;
        this.altura = altura;
    }

    // getters e setters

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

public double calcularIMC() {
        return this.peso / (this.altura * this.altura);
    }

    public String diagnostico(double imc) {
        // double imc = calcularIMC();
        // if (imc < 18.5) {
        //     return "Abaixo do peso";
        // } else if (imc < 24.9) {
        //     return "Peso normal";
        // } else if (imc < 29.9) {
        //     return "Sobrepeso";
        // } else {
        //     return "Obesidade";
        return (imc < 18.5)? "Você está abaixo do peso" 
               :(imc < 25) ? "Você está com o peso normal" 
               :(imc < 30) ? "Você está com sobrepeso" 
               :(imc < 35) ? "Você está obeso" 
               :(imc < 40) ? "Você está com obsidade nível II" 
               : "Você está com obesidade mórbida";
        }
    }



