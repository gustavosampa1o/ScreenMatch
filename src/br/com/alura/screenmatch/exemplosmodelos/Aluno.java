package br.com.alura.screenmatch.exemplosmodelos;

public class Aluno {
    private String nome;
    private double nota;
    private double totalNotas;
    private double somaDasNotas;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNota(double nota) {
        this.nota = nota;
        somaDasNotas += nota;
        totalNotas++;

    }

    public String getNome() {
        return nome;
    }


    public double calcularMedia(){
        return somaDasNotas/totalNotas;
    }
}
