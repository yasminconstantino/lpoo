package model;

public abstract class Conta {
    protected double saldo;

    public Conta(double saldo) {}

    public Conta() {
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        double saldoAutal = saldo - valor;
        if(saldoAutal >= 0) {
            saldo -= valor;
        } else {
            System.out.println("Não foi possível realizar o saque.");
        }
    }

    public void atualiza (double taxa) {
        if(taxa > 0) {
            saldo += saldo * (taxa/100);
        } else {
            System.out.println("A taxa deve ser maior que ZERO.");
        }
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                '}';
    }
}
