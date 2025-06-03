package br.com.alura.screenmatch.exemplosmodelos;

public class ModeloCarro extends Carro{
    private int ano;
    private String cambio;
    private String tipoCombustivel;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void exibeFichaTecnica(){
        System.out.println("Ano:" + ano);
        System.out.println("Câmbio:" + cambio);
        System.out.println("Tipo de combustível: " + tipoCombustivel);
        System.out.println("Preço médio: " + getPrecoMedio());
    }
}
