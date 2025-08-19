package com.composicao.app;

import javax.swing.JOptionPane;

import com.composicao.model.Conta;
import com.composicao.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa usuario = new Pessoa(
                null,
                null,
                null,
                null,
                null);
        Conta cc = new Conta("1234-5",
                "12345-6",
                0,
                usuario);

        String[] opcoes = {
                "1 - Exibir dados da conta",
                "2 - Fazer depósito",
                "3 - Fazer saque",
                "4 - Sair"
        };

        Object opcao;
        double valor;

        // input do Titular da conta
        usuario.setNome(JOptionPane.showInputDialog("Informe o nome do titular da conta:"));
        usuario.setCpf(JOptionPane.showInputDialog("Informe o CPF do titular da conta:"));
        usuario.setEmail(JOptionPane.showInputDialog("Informe o E-mail do titular da conta:"));
        usuario.setTelefone(JOptionPane.showInputDialog("Informe o Telefone do titular da conta:"));
        usuario.setEndereco(JOptionPane.showInputDialog("Informe o Endereço do titular da conta:"));

        do {
            opcao = JOptionPane.showInputDialog(null,
                    "Escolha a operação desejada:",
                    "Java Bank",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]);
            switch (opcao.toString()) {
                case "1 - Exibir dados da conta":
                    JOptionPane.showMessageDialog(
                            null,
                            cc.exibirDados(),
                            "Dados da Conta",
                            JOptionPane.INFORMATION_MESSAGE);

                case "2 - Fazer depósito":
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do depósito em R$:"));

                    JOptionPane.showMessageDialog(
                            null,
                            cc.fazerDeposito(valor),
                            "Depósito realizado",
                            JOptionPane.INFORMATION_MESSAGE);

                    break;

            }

        } while (opcao != "Sair");

    }
}
