package org.example.Contas;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void atualiza(double percentualRendimento) {
        super.atualiza(percentualRendimento * 3);
    }
}
