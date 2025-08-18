package com.atividade05.app;

public class App {
    public static void main(String[] args) throws Exception {
        // TODO: atividade 05
        /*
         * crie um app para verificar qual o melhor combustível para abastecer um carro
         * flex.
         * NOTE: compensa mais abastecer com etanol coaso o valor dele seja
         * até 70% do valo da gasolina.
         */
        System.out.println("Verificando o melhor combustível para abastecer um carro flex...");
        // Exemplo de valores
        // Você pode substituir esses valores por entradas do usuário, se desejar.

        double gasolina = 5.79;
        double etanol = 4.19;

        double proporcao = etanol / gasolina;
        if (proporcao < 0.7) {
            System.out.println("Compensa abastecer com etanol.");
        } else {
            System.out.println("Compensa abastecer com gasolina.");
        }
        System.out.println("Gasolina: R$ " + gasolina);
        System.out.println("Etanol: R$ " + etanol);         
    }
}
