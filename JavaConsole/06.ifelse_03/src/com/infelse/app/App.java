package com.infelse.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia do objeto Scanner
         Scanner leia = new Scanner(System.in);
    
    // declaração de variáveis
    String nome;     
    double nota;

    //input
    System.out.println("informe a nome do aluno:");
    nome = leia.nextLine();
    System.out.println("informe a nota do aluno:");
    nota = leia.nextDouble(); 

    // output
    if (nota >= 7){
        System.out.println(nome + " está Aprovado.");
        }

        else if (nota >=5){
            System.out.println(nome + "está de Recuperação.");

        } 
            
        
        else {
            System.out.println(nome + "está Reprovado.");
        }

    // fechar objeto leia
    leia.close();

    }
}
