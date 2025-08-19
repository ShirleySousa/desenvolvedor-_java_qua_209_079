package com.atividade05.app;
import com.atividade05.model.Combustivel;
import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        //if (opcao == "Calcular melhor combistivel") {
        //    combustivel.setPrecoGasolina(Double.parseDouble(JOptionPane.showInputDialog(" Digite o preço da gasolina:").replace(",", ".")));
        //    combustivel.setPrecoAlcool(Double.parseDouble(JOptionPane.showInputDialog(" Digite o preço do álcool:").replace(",", ".")));
        //    String resultado = combustivel.verificarMelhorCombustivel();      
        Combustivel combustivel = new Combustivel(0, 0);

        //String[] opcoes = {"Calcular melhor combistivel", "Sair"};
        //Object opcao;

        //do {
        //combustivel.setPrecoGasolina(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da gasolina:").replace(",", ".")));
        //combustivel.setPrecoAlcool(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do álcool:").replace(",", ".")));
        //opcao = JOptionPane.showInputDialog(null, "Escolha uma opção:", "Menu", JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]);
        
        // output
        //JoptionPane.showMessageDialog(null, "Você escolheu: " + opcao, "Opção Selecionada", JOptionPane.INFORMATION_MESSAGE);
        
        
        // }wile (opcao != "Sair");


        combustivel.setPrecoGasolina(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço da gasolina:").replace(",", ".")));
        combustivel.setPrecoAlcool(Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do álcool:").replace(",", ".")));   
        String resultado = combustivel.verificarMelhorCombustivel();
        JOptionPane.showMessageDialog(null, resultado, "Resultado", JOptionPane.INFORMATION_MESSAGE);

       

    }
}
