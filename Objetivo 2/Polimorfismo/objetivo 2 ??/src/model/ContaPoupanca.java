package model;

public class ContaPoupanca extends Conta{
    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca() {
    }

    @Override
    public String toString() {
        return "\nContaPoupanca{" +
                "saldo=" + saldo +
                '}';
    }
}