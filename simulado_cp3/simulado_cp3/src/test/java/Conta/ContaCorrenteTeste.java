package Conta;

import org.example.Contas.ContaCorrente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaCorrenteTeste {
    @Test
    public void testeAtualiza() {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        contaCorrente.atualiza(10);
        assertEquals(120, contaCorrente.getSaldo(), 0.001);
    }

    @Test
    public void testeDepositar() {
        ContaCorrente contaCorrente = new ContaCorrente(100);
        contaCorrente.depositar(50);
        assertEquals(149.90, contaCorrente.getSaldo(), 0.001);
    }
}
