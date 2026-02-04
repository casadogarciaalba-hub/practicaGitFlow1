package edu.casadoGarciaAlba.endes;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("División por cero");
        }
        return a / b;
    }
}