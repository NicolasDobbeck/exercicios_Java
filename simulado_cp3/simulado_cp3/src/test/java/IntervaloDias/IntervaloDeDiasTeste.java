package IntervaloDias;

import org.example.CalcularItervaloDias.IntervaloDeDias;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IntervaloDeDiasTeste {
    @Test
    public void testCalcularIntervaloDeDias() {
        LocalDate dataInicial = LocalDate.of(2024, 5, 11);

        LocalDate dataFinal = LocalDate.of(2024, 5, 21);

        long intervaloEsperado = 10;

        long intervaloCalculado = IntervaloDeDias.calcularIntervaloDeDias(dataInicial, dataFinal);

        assertEquals(intervaloEsperado, intervaloCalculado);
    }
}
