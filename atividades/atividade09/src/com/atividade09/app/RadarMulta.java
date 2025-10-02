package com.atividade09.app;

import javax.swing.JOptionPane;

public class RadarMulta {
    public static void main(String[] args) {
        String modelo = JOptionPane.showInputDialog("digite o modelo do veiculo");

        double distancia = Double.parseDouble(
                JOptionPane.showInputDialog("Digite a distância entre os pardais (em km):"));
        double tempoSegundos = Double.parseDouble(
                JOptionPane.showInputDialog("Digite o tempo gasto entre os pardais (em segundo):"));

        double tempoHoras = tempoSegundos / 3600.0;

        double velocidade = distancia / tempoHoras;

        String mensagem;
        if (velocidade > 80) {
            mensagem = "O veiculo " + modelo + " estava a " + String.format("%.2f", velocidade) +
                    "km/h.\nMULTADO! Limite da via: 80 km/h ";

        } else {
            mensagem = "O veiculo " + modelo + " estava a " + String.format("%.2f", velocidade)
                    + "km/h.\nDentro do limite permitido. ";
        }

        JOptionPane.showMessageDialog(null,  mensagem);
    }

}
