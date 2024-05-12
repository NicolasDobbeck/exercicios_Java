package org.example.Fibonacci;

public class Fibonacci {

    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n deve ser maior ou igual a 0.");
        }

        if (n == 0 || n == 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}