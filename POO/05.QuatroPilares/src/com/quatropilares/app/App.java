package com.quatropilares.app;

import java.util.Scanner;
import com.quatropilares.model.PessoaFisica;
import com.quatropilares.model.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica(null, null, null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null, null, null);

        //input do usuario
        System.out.println("Iforme os dados do usuario:\n");
        System.out.println("informe o nome");
        usuario.setNome(leia.nextLine());
        System.out.println("informe o CPF");
        usuario.setCpf(leia.nextLine());
        System.out.println("informe a data de nascimento");
        usuario.setDataNascimento(leia.nextLine());
        System.out.println("informe o e-mail");
        usuario.setEmail(leia.nextLine());
        System.out.println("informe o telefone");
        usuario.setTelefone(leia.nextLine());
        System.out.println("informe o Endereço");
        usuario.setEndereco(leia.nextLine());


        //input do empresa
        System.out.println("Iforme os dados do empresa:\n");
        System.out.println("informe a Razão Social");
        empresa.setRazaosocial(leia.nextLine());
        System.out.println("informe o CNPJ");
        empresa.setCnpj(leia.nextLine());
        System.out.println("informe o nome Fantasia");
        empresa.setNomefantasia(leia.nextLine());
        System.out.println("informe o e-mail da empresa");
        empresa.setEmail(leia.nextLine());
        System.out.println("informe o telefone da empresa");
        empresa.setTelefone(leia.nextLine());
        System.out.println("informe o Endereço da empresa");
        empresa.setEndereco(leia.nextLine());

        // output do usuario
        System.out.println("informações do usuário:\n");
        System.out.println("nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("Data de Nascimento: " + usuario.getDataNascimento());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("telefone: " + usuario.getTelefone());
        System.out.println("Endereço: " + usuario.getEndereco());

        // output do empresa
        System.out.println("\n Informações da empresa:\n");
        System.out.println("informações do usuário");
        System.out.println("Razão Social: " + empresa.getRazaosocial());
        System.out.println("Nome da Empresa: " + empresa.getNomefantasia());
        System.out.println("CNPJ: " + empresa.getCnpj());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("telefone da empresa: " + empresa.getTelefone());
        System.out.println("Endereço da empresa: " + empresa.getEndereco());

        leia.close();

    }
}
