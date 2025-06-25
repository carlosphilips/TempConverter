package org.example;

import java.util.Scanner;

public class App {

    Utilities util = new Utilities();

    public String convertTemperature(String option, double value) {
        if (option.equalsIgnoreCase("f")) {
            return String.valueOf(util.celsiusToFahrenheit(value));
        } else if (option.equalsIgnoreCase("c")) {
            return String.valueOf(util.fahrenheitToCelsius(value));
        } else {
            return "Invalid option";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        App app = new App();

        System.out.println("A conversão do valor será feita para Fahrenheit(F) ou Graus Celsius(C)?");
        System.out.println("Digite 'F' para Fahrenheit ou 'C' para Celsius: ");
        String conversao = sc.nextLine();

        System.out.print("Digite o valor a ser convertido: ");
        double valor = sc.nextDouble();

        String resultado = app.convertTemperature(conversao, valor);

        System.out.println("Resultado: " + resultado);

        sc.close();
    }
}
