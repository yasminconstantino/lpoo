package model;

public abstract class Conta {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        //regra de negocio que não permite que o cliente tenha saldo negativo
        double saldoAtual = this.saldo - valor;
        if (saldoAtual > 0) {
            this.saldo -= valor;
        } else {
            System.out.println("\n Não foi possivel realizar o saque. Saldo insuficiente.");
        }
    }

    public void atualizar (double taxa) {
        if (taxa>0) {
            this.saldo += this.saldo * (taxa/100);
        } else {
            System.out.println("\nA taxa deve ser maior que ZERO");
        }
    }

}
