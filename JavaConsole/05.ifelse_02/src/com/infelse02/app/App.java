package com.infelse02.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    //instancia a classe Scanner
    Scanner leia = new Scanner(System.in);
    
    // declaração de variáveis
    String nome;
    int idade;
    double altura;

    // input
    System.out.println("informe seu nome:");
    nome =  leia. nextLine();
    System.out.println("informe a sua idade:");
    idade = leia.nextInt();
    System.out.println("informe sua altura:");
    altura = leia.nextDouble();

    // estrutura de decisão
    if (idade >= 12 && altura >= 1.15){
        System.out.println(nome + " não esta autorizado.");
    }

    // fecha objeto leia
    leia.close();

        
    }
}
