package org.example.Contas;

public class Conta {
    private double saldo;


    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }


    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void atualiza(double percentualRendimento) {
        saldo += saldo * (percentualRendimento / 100);
    }
}
