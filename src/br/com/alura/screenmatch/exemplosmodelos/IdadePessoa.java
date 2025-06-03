package br.com.alura.screenmatch.exemplosmodelos;

public class IdadePessoa {
    private String nome;
    private int idade;


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void verificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Situação: Maior de idade.");
        } else {
            System.out.println("Situação: Menor de idade.");
        }
    }
}

