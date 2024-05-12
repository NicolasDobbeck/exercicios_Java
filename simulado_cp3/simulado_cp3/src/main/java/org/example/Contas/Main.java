package org.example.Contas;

public class Main {
    public static void main(String[] args) {
        ContaCorrente ContaCorrente = new ContaCorrente(1000);
        ContaPoupanca ContaPoupanca = new ContaPoupanca(1000);

        System.out.println("Saldo inicial da Conta Corrente: " + ContaCorrente.getSaldo());
        System.out.println("Saldo inicial da Conta Poupança: " + ContaPoupanca.getSaldo());

        ContaCorrente.atualiza(10);
        ContaPoupanca.atualiza(10);

        System.out.println("Saldo após rendimento da Conta Corrente: " + ContaCorrente.getSaldo());
        System.out.println("Saldo após rendimento da Conta Poupança: " + ContaPoupanca.getSaldo());

        ContaCorrente.depositar(500);
        ContaPoupanca.depositar(1200);

        System.out.println("Saldo após depósito na Conta Corrente: " + ContaCorrente.getSaldo());
        System.out.println("Saldo após depósito na Conta Poupança: " + ContaPoupanca.getSaldo());
    }
}
