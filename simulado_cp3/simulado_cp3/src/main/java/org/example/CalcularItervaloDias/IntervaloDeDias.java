package org.example.CalcularItervaloDias;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class IntervaloDeDias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data a ser calculada: ");
        String data = scanner.nextLine();

        LocalDate dataFornecida = LocalDate.parse(data);

        LocalDate dataAtual = LocalDate.now();

        long intervaloDeDias = calcularIntervaloDeDias(dataFornecida, dataAtual);

        System.out.println("Intervalo de dias é igual a: " + intervaloDeDias + " dias");

        scanner.close();
    }

    public static long calcularIntervaloDeDias(LocalDate dataInicial, LocalDate dataFinal) {
        return ChronoUnit.DAYS.between(dataInicial, dataFinal);
    }
}
