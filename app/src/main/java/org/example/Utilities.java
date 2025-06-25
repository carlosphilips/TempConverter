package org.example;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Utilities {

    public double celsiusToFahrenheit(double valor) {
        return (valor * 1.8) + 32;
    }

    public double fahrenheitToCelsius(double valor) {
        BigDecimal arredondado = new BigDecimal((valor - 32) * 0.55).setScale(2, RoundingMode.HALF_UP);
        System.out.println(arredondado.doubleValue());

        return arredondado.doubleValue();
    }
}


