package com.atividade03.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados iniciais
        System.out.print("Informe o nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Informe o CPF do titular: ");
        String cpf = sc.nextLine();

        // Criando conta com dados fixos de agência e número
        Conta conta = new Conta(nome, cpf, "0001", "12345-6", 0.0);

        //DECLARAÇÃO DE VARIAVEL

        int opcao;
        do {
            System.out.println("\n=== BANCO JAVA ===");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Fazer saque");
            System.out.println("3 - Fazer depósito");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: R$: ");
                    double saque = sc.nextDouble();
                    if (conta.sacar(saque)) {
                        System.out.println("Saque realizado com sucesso!");
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o valor para depósito: R$ ");
                    double deposito = sc.nextDouble();
                    if (conta.depositar(deposito)) {
                        System.out.println("Depósito realizado com sucesso!");
                    } else {
                        System.out.println("Valor inválido para depósito!");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}
   