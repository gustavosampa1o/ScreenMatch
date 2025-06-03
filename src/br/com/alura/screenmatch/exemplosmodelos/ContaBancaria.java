package br.com.alura.screenmatch.exemplosmodelos;

public class ContaBancaria {
    private int numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public double deposita(double valor) {
        return saldo += valor;
    }

    public void saca(double valor) {
        if (valor > saldo) {
            System.out.println("Saldo insuficiente!!");
        } else {
            saldo -= valor;
        }
    }


    public void extrato() {
        System.out.println("Titular: " + titular);
        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Saldo: " + saldo);

    }
}

