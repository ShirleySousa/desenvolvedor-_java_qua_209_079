package com.atividade03.app;

class Conta {
    public String titular;     // Nome do titular (público)
    private String cpf;        // CPF do titular (privado)
    public String agencia;
    public String numeroConta;
    public double saldo;

    // Construtor
    public Conta(String titular, String cpf, String agencia, String numeroConta, double saldo) {
        this.titular = titular;
        this.cpf = cpf;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Getter para o CPF
    public String getCpf() {
        return cpf;
    }

    // Método para saque
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    // Método para depósito
    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return true;
        } else {
            return false;
        }
    }

    // Método para exibir dados
    public void exibirDados() {
        System.out.println("Titular: " + titular);
        System.out.println("CPF: " + getCpf());
        System.out.println("Agência: " + agencia);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
    }
}


