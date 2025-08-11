package com.objeto.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //instancia a classe Pessoa
       Pessoa usuario = new Pessoa();
       Scanner leia = new Scanner(System.in);

       // define os valores dos atributos
       System.out.println("Informe o nome:");
       usuario.nome = leia.nextLine();
       System.out.println("informe a idade:");
       usuario.idade = leia.nextInt();
       System.out.println("informe a altura em metros");
       usuario.altura = leia.nextDouble();

       // output
       System.out.println(usuario.cumprimentar());
       usuario.exibirDados();

       leia.close();
    }
}
