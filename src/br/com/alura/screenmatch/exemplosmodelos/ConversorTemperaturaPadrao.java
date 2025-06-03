package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    @Override
    public void celsiusParaFahrenheit(double valor) {
        System.out.println("O valor de celsius para Fahrenheit é: " + ((valor*1.8)+32));

    }

    @Override
    public void fahrenheitParaCelsius(double valor) {
        System.out.println("O valor de fahrenheit para celsius é: " + (valor-32)/9*5);

    }
}
