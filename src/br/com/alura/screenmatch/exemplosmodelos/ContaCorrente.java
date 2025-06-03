package br.com.alura.screenmatch.exemplosmodelos;

public class ContaCorrente extends ContaBancaria {
    double tarifa = 30.00;

    public void cobrarTarifaMensal() {
        if (getSaldo() >= 30.00) {
            System.out.println("O valor da tarifa será descontado da sua conta!");
            saca(tarifa);
        } else {
            System.out.println("Saldo insuficiente para manter a conta, procure uma agência!");
        }
    }
}

