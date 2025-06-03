package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    @Override
    public void mostrarTabuada(int valor) {
        for(int i = 1; i <=10; i++){
            System.out.println(valor +  "*" + i + " = " + valor*i);
        }


    }
}
