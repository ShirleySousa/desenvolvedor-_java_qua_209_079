package com.encapsulamento.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Pessoa
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // inputs
        System.out.println("informe o nome:");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe sua Idade");
        usuario.setIdade(leia.nextInt());

        // output
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());

        leia.close();
    }
}
