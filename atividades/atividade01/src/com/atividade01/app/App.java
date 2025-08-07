package com.atividade01.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);

        String name;
        int opcao;
        double result, altura, peso;

        do {
            System.out.println("1 - Registra nome usuario.");
            System.out.println("2 - Sair do programa.");
            System.out.println("Informe a opção desejada:");
            opcao = leia.nextInt();
        

            if (opcao == 1) {
        
            leia.nextLine();
            System.out.println("informe o nome:");
            name = leia.nextLine();
            System.out.println("Informe o peso:");
            peso = leia.nextInt();
            System.out.println("informe a altura:");
            altura = leia.nextDouble();

            // calcular IMX
            result = peso / (altura * altura);
        

            // Verificar IMC

            if (result <= 16) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " magreza grave.");
            }
            if (result > 16.11 && result < 17) {
                System.out.println(" o seu IMC é de " +String.format("%.2f" , result) + " magreza moderada.");
            }

            if (result > 17.1 && result < 18.5) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " magreza leve.");
            }

            if (result > 18.51 && result < 25) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " está saudável.");
            }

            if (result > 25.1 && result < 30) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " está com sob peso.");
            }

            if (result > 30.1 && result < 35) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " está com obsidade grau 1.");
            }
            if (result > 35.1 && result < 40) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " está com obsidade grau 2.");
            }
            if (result > 40.1) {
                System.out.println(" o seu IMC é de " + String.format("%.2f" , result) + " está com obsidade grau 3.");
            }
        }

        
        } while (opcao != 2);
        leia.close();
 
         }
         
        }
    
       
        
         
         

