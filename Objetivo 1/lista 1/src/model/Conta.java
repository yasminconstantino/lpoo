package model;

public class Conta {
    private double saldo;
    private int id;

    // metodos contrutores:

    public Conta(int id, double saldo) {
        this.id = id;
        this.saldo = saldo;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta() {
    }

    // metodos acessores: getter and setter saldo
    public double getSaldo() {
        return saldo;
    }
/*
    public void setSaldo() {
    }*/


    // metodos acessores: getter and setter id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // outros metodos acessores:
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }
/*
    public void sacar (double valor) {
        boolean retorno = false;
        if (saldo<valor) {
            System.out.println("Operação invalida, saldo insuficiente.");
        } else {
            saldo -= valor;
            System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
            retorno= true;
        }
        return retorno;
    }*/

    public void sacar(double valor) {
        double valorTemp = this.saldo - valor;
        if(valorTemp < 0) {
            System.out.println("Operação invalida, saldo insuficiente.= " + this.saldo);
            return;
        }
        this.saldo -= valor;
        System.out.println("\nSaque realizado com sucesso. Saldo atual= " + this.saldo);
    }

    public void atualiza(double taxa) {
        this.saldo += this.saldo * (taxa/100);
//		this.saldo = this.saldo + this.saldo * (taxa/100);
        System.out.println("Saldo atualizado pela taxa. Seu saldo atual=" + this.saldo);
    }

    // metodos utilitarios: to string
    @Override
    public String toString() {
        return "\nConta [id=" + id + ", saldo=" + saldo + "]";
    }

}
