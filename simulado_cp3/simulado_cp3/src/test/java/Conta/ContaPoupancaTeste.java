package Conta;

import org.example.Contas.ContaPoupanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContaPoupancaTeste {
    @Test
    public void testAtualiza() {
        ContaPoupanca contaPoupanca = new ContaPoupanca(100);
        contaPoupanca.atualiza(10);
        assertEquals(130, contaPoupanca.getSaldo(), 0.001);
    }
}
