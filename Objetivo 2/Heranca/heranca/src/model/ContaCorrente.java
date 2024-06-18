package model;

public class ContaCorrente extends Conta{
    @Override
    public void sacar(double valor){
        double saldoAtual = saldo - valor;
        if (saldoAtual >= 200) {
            this.saldo -= valor;
        } else {
            System.out.println("\n Não foi possivel realizar o saque. Saldo insuficiente.");
        }
    }

    @Override
    public String toString() {
        return "\nContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
