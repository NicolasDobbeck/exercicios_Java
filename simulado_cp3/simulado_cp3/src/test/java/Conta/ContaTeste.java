package Conta;

import org.example.Contas.Conta;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaTeste {
    @Test
    public void testGetSaldo() {
        Conta conta = new Conta(1000);
        assertEquals(1000, conta.getSaldo(), 0.001);
    }

    @Test
    public void testeDepositar() {
        Conta conta = new Conta(3600);
        conta.depositar(400);
        assertEquals(4000, conta.getSaldo(), 0.001);
    }

    @Test
    public void testeSacar() {
        Conta conta = new Conta(100);
        conta.sacar(50);
        assertEquals(50, conta.getSaldo(), 0.001);
    }

    @Test
    public void testeAtualiza() {
        Conta conta = new Conta(1000);
        conta.atualiza(10);
        assertEquals(1100, conta.getSaldo(), 0.001);
    }
}
