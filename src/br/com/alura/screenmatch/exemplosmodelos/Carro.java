package br.com.alura.screenmatch.exemplosmodelos;

public class Carro {
    private String modelo;
    private double precoPrimeiroAno;
    private double precoSegundoAno;
    private double precoTerceiroAno;




    public double getPrecoPrimeiroAno() {
        return precoPrimeiroAno;
    }

    public double getPrecoSegundoAno() {
        return precoSegundoAno;
    }

    public double getPrecoTerceiroAno() {
        return precoTerceiroAno;
    }

    public double getPrecoMedio(){
        return precoMedio();
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setPrecoPrimeiroAno(double preco1) {
        this.precoPrimeiroAno = preco1;
    }

    public void setPrecoSegundoAno(double preco2) {
        this.precoSegundoAno = preco2;
    }

    public void setPrecoTerceiroAno(double preco3) {
        this.precoTerceiroAno = preco3;
    }

    public double precoMedio() {
        return (precoPrimeiroAno + precoSegundoAno + precoTerceiroAno)/3;

    }
    public void maiorPreco(){
        if(precoPrimeiroAno > precoSegundoAno && precoPrimeiroAno > precoTerceiroAno){
            System.out.println("O maior preço foi no primeiro ano, no valor de:" + precoPrimeiroAno);
        }else if(precoSegundoAno > precoPrimeiroAno && precoSegundoAno > precoSegundoAno){
            System.out.println("O maior preço foi no segundo ano, no valor de:" + precoSegundoAno);
        }else if(precoTerceiroAno > precoPrimeiroAno && precoTerceiroAno > precoSegundoAno){
            System.out.println("O maior preço foi no terceiro ano, no valor de:" + precoTerceiroAno);
        }else{
            System.out.println("Existe valores repetidos!");
        }

    }
    public void menorPreco(){
        if(precoPrimeiroAno < precoSegundoAno && precoPrimeiroAno < precoTerceiroAno){
            System.out.println("O menor preço foi no primeiro ano, no valor de:" + precoPrimeiroAno);
        }else if(precoSegundoAno < precoPrimeiroAno && precoSegundoAno < precoSegundoAno){
            System.out.println("O menor preço foi no segundo ano, no valor de:" + precoSegundoAno);
        }else if(precoTerceiroAno < precoPrimeiroAno && precoTerceiroAno < precoSegundoAno){
            System.out.println("O menor preço foi no terceiro ano, no valor de:" + precoTerceiroAno);
        }else{
            System.out.println("Existe valores repetidos!");
        }

    }
}
