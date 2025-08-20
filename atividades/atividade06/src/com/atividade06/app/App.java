package com.atividade06.app;

import javax.swing.JOptionPane;

import com.atividade06.model.Pessoa;
import com.atividade06.model.Veiculo;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa(null, null, null, null, null);
        Veiculo veiculo = new Veiculo(null, null, null, null, null, null);
        pessoa.setNome(JOptionPane.showInputDialog("Digite o nome do proprietario:"));
        pessoa.setCpf(JOptionPane.showInputDialog("Digite o CPF do proprietario:"));    
        pessoa.setEmail(JOptionPane.showInputDialog("Digite o email do proprietario:"));
        pessoa.setTelefone(JOptionPane.showInputDialog("Digite o telefone do proprietario:"));
        pessoa.setEndereco(JOptionPane.showInputDialog("Digite o endereco do proprietario:"));
        veiculo.setModelo(JOptionPane.showInputDialog("Digite o modelo do veiculo:"));
        veiculo.setPlaca(JOptionPane.showInputDialog("Digite a placa do veiculo:"));
        veiculo.setAno(JOptionPane.showInputDialog("Digite o ano do veiculo:"));
        veiculo.setFabricante(JOptionPane.showInputDialog("Digite o fabricante do veiculo:"));
        veiculo.setCor(JOptionPane.showInputDialog("Digite a cor do veiculo:"));
        veiculo.setProprietario(pessoa);
        JOptionPane.showMessageDialog(null, veiculo.exibirDados());
            
    }
}
