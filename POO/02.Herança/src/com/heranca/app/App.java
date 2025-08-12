package com.heranca.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //instanciar a classe PessoaFisica
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();


        // definido valores dos atributos do usuario
       System.out.println("Informe o nome do usuario");
       usuario.nome = leia.nextLine();
       System.out.println("Informe o CPF do usuario");
       usuario.CPF = leia.nextLine();
       System.out.println("Informe o e-mail do usuario");
       usuario.email = leia.nextLine();
       System.out.println("Informe o telefone do usuario");
       usuario.telefone = leia.nextLine();
       System.out.println("Informe o endereço do usuario");
       usuario.endereco = leia.nextLine();

       //definindo valores dos atribusto da empresa
        System.out.println("Informe a razão social da empresa");
       empresa.razaoSocial = leia.nextLine();
       System.out.println("Informe o nome fantasia da empresa");
       empresa.nomeFantasia = leia.nextLine();
       System.out.println("Informe o CNPJ da empresa");
       empresa.cnpj = leia.nextLine();
       System.out.println("Informe o e-mail da empresa");
       empresa.email = leia.nextLine();
       System.out.println("Informe o telefone da empresa");
       empresa.telefone = leia.nextLine();
       System.out.println("Informe o endereço da empresa");
       empresa.endereco = leia.nextLine();

       // output
        
        System.out.println("Nome: " + usuario.nome);
        System.out.println("CPF: " + usuario.CPF);
        System.out.println("E-mail: " + usuario.email);
        System.out.println("Telefone: " + usuario.telefone);
        System.out.println("endereço: " + usuario.endereco);
        System.out.println("Razão Social da empresa: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia da empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da empresa: " + empresa.cnpj);
        System.out.println("Telefone da empresa: " + empresa.telefone);
        System.out.println("Endereço da empresa: " + empresa.endereco);
        

    }
}
