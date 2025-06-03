package br.com.alura.screenmatch.exemplosmodelos;

public class Animal {
    String nome;
    String tipo;
    int idade;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void emitirSom(){
        System.out.println("Som não definido!");
    }
}
