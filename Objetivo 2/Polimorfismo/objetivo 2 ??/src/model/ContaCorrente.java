package model;

import java.io.Serializable;

public class ContaCorrente extends Conta implements Associado {

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente() {
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "saldo=" + saldo +
                '}';
    }
}
