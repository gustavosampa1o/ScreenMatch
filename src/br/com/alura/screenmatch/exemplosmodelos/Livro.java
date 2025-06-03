package br.com.alura.screenmatch.exemplosmodelos;

import br.com.alura.screenmatch.calculosexemplos.Calculavel;

public class Livro implements Calculavel {

    private String titulo;
    private String autor;
    private String genero;
    private int anodeLancamento;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setAnodeLancamento(int anodeLancamento) {
        this.anodeLancamento = anodeLancamento;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public int getAnodeLancamento() {
        return anodeLancamento;
    }

    public void exibeFichaLivro() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Gênero: " + genero);
        System.out.println("Ano de lançamento: " + anodeLancamento);

        }

    @Override
    public double calcularPrecoFinal(double preValor) {
        return (preValor*0.7);
    }
}
