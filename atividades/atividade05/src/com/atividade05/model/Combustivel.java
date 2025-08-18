package com.atividade05.model;
import java.util.Scanner;

public class Combustivel {
    

public class CombustivelMelhor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço do litro da gasolina: R$ ");
        double precoGasolina = scanner.nextDouble();

        System.out.print("Digite o preço do litro do álcool: R$ ");
        double precoAlcool = scanner.nextDouble();

        double proporcao = precoAlcool / precoGasolina;

        if (proporcao < 0.7) {
            System.out.println("Compensa abastecer com álcool.");
        } else {
            System.out.println("Compensa abastecer com gasolina.");
        }
        System.out.println("Preço da gasolina: R$ " + precoGasolina);
        System.out.println("Preço do álcool: R$ " + precoAlcool);       

        scanner.close();
    }
}


}
