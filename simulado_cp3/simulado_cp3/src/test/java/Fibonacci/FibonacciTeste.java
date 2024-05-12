package Fibonacci;

import org.example.Fibonacci.Fibonacci;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTeste {
    @Test
    public void testFibonacci() {
        int[] nValores = {0, 1, 5, 10, 30};
        long[] resultadosEsperados = {0, 1, 5, 55, 832040};

        for (int i = 0; i < nValores.length; i++) {
            long resultadoAtual = Fibonacci.fibonacci(nValores[i]);
            assertEquals(resultadosEsperados[i], resultadoAtual, 0.001);
        }
    }
}
