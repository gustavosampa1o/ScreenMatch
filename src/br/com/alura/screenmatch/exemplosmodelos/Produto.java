package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.Calculavel;
import br.com.alura.screenmatch.calculosexemplos.Vendavel;

public class Produto implements Calculavel, Vendavel {
    private String nome;
    private double preco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void aplicarDesconto(boolean pagamentoPix){
        if(pagamentoPix){
            System.out.println("No Pix tem desconto de 10%, o novo valor é de: " + preco*0.9);
        }else{
            System.out.println("Pagamento sem desconto por não ter sido no Pix.");
        }
    }

    @Override
    public double calcularPrecoFinal(double preValor) {
        return (preValor*1.3);
    }

    @Override
    public void precoTotal(int qteComprada, double valorItem) {
        if(qteComprada <= 5){
            System.out.println("Valor cheio, total: " + qteComprada*valorItem);
        }
        if(qteComprada > 5){
            System.out.println("Tem 10% de desconto, valor total: " + (qteComprada * valorItem) * 0.9);
        }

    }
}
