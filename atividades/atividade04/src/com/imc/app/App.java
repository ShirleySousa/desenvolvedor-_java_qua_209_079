package com.imc.app;

import javax.swing.JOptionPane;

import com.imc.model.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa imc = new Pessoa("Usuário", 0, 0);
       

        String[] opcoes = { "Calcular IMC", "Sair" };
        Object opcao;

        double imcValor;

        do {
            opcao = JOptionPane.showInputDialog(null, "Escolha uma opção desejada", "IMC", JOptionPane.QUESTION_MESSAGE,
                    null, opcoes, opcoes[0]);

            if (opcao == "Calcular IMC") {
                imc.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso em kg: ").replace(",", ".")));
                imc.setAltura(Double.parseDouble(JOptionPane.showInputDialog("Informe a sua altura em metros: ").replace(",", ".")));
                imcValor = imc.calcularIMC();
                JOptionPane.showMessageDialog(null, "Valor do IMC: " + String.format("%.2f", imcValor) + "\n" + imc.diagnostico (imcValor),
                "IMC Resultado",
            
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } while (opcao != "Sair");
    }

}
