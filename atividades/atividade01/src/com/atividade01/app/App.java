package com.atividade01.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String name;
        int opcao;
        double result, altura, peso;

        // faça...enquanto
        System.out.println("1 Registra nova entrada");
        System.out.println("2 - Sair do programa.");
        System.out.println("unfrme  opção desejada:");

        if (opcao == 1) {
            leia.nextLine();
            System.out.println("informe o nome:");
            name = leia.nextLine();
            System.out.println("Informe o peso");
            peso = leia.nextInt();
            System.out.println("informe a altura");
            altura = leia.nextDouble();
            

            // calcular IMX
            result = peso / (altura * altura);

            // Verificar IMC

            if (result >= 16) {
                System.out.println("o seu IMC é de " + result);

            } else {
                System.out.println(name + "não esta autrizado");

                leia.close();

            }

        }
    }
}
