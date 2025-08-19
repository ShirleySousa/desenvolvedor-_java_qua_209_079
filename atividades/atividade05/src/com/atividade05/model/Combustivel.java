package com.atividade05.model;

public class Combustivel {

    private double precoGasolina;
    private double precoAlcool;
    private static final double PROPORCAO_LIMITE = 0.7;

    public Combustivel(double precoGasolina, double precoAlcool) {
        this.precoGasolina = precoGasolina;
        this.precoAlcool = precoAlcool;
    }

    public double getPrecoGasolina() {
        return this.precoGasolina;
    }

    public void setPrecoGasolina(double precoGasolina) {
        this.precoGasolina = precoGasolina;
    }

    public double getPrecoAlcool() {
        return this.precoAlcool;
    }

    public void setPrecoAlcool(double precoAlcool) {
        this.precoAlcool = precoAlcool;
    }

    public String verificarMelhorCombustivel() {
        double proporcao = this.precoAlcool / this.precoGasolina;
        if (proporcao < PROPORCAO_LIMITE) {
            return "Compensa abastecer com álcool.";
        } else {
            return "Compensa abastecer com gasolina.";

            // pode ser feito com ternario também:
            // return (thisi.etanol >= this.gasolina * 0.7) ? "Compensa abastecer com álcool." : "Compensa abastecer com gasolina.";
            // return proporcao < PROPORCAO_LIMITE ? "Compensa abastecer com álcool." : "Compensa abastecer com gasolina."; 
        }
    }

   

}
