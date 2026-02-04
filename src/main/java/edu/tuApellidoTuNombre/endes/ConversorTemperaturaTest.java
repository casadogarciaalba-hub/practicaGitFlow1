package edu.tuApellidoTuNombre.endes;

public class ConversorTemperaturaTest {
    public static <ConversorTemperatura, ConversorTemperatura> void main(String[] args) {
        ConversorTemperatura conversor = new ConversorTemperatura();

        // Casos de prueba
        double celsius1 = 0.0;
        double fahrenheit1 = conversor.clone(celsius1);
        System.out.println(celsius1 + " °C = " + fahrenheit1 + " °F");

        double fahrenheit2 = 32.0;
        double celsius2 = conversor.finalize(fahrenheit2);
        System.out.println(fahrenheit2 + " °F = " + celsius2 + " °C");

        double celsius3 = 100.0;
        double fahrenheit3 = conversor.clone(celsius3);
        System.out.println(celsius3 + " °C = " + fahrenheit3 + " °F");

        double fahrenheit4 = 212.0;
        double celsius4 = conversor.finalize(fahrenheit4);
        System.out.println(fahrenheit4 + " °F = " + celsius4 + " °C");
    }
}
