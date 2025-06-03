package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.CalculoGeometrico;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    int area;
    int perimetro;

    @Override
    public void calcularArea(int altura, int largura) {
        area = altura * largura;
        System.out.println("A área é: " + area);

    }

    @Override
    public void calcularPerimetro(int altura, int largura) {
        perimetro = (altura*2) + (largura*2);
        System.out.println("O perimetro é: " + perimetro);

    }
}
