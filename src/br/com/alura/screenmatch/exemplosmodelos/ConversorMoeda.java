package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {

    @Override
    public double converteDolarParaReal(double valor) {
        return valor * 6.26;
    }
}
