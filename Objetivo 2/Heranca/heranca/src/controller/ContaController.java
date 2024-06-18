package controller;

import model.ContaConjunta;
import model.ContaCorrente;
import model.ContaPoupanca;
import model.ContaPoupancaSalario;

public class ContaController {
    public static void main(String[] args){

        ContaCorrente cc1 = new ContaCorrente();

        ContaPoupanca cp1 = new ContaPoupanca();

        ContaConjunta cj1 = new ContaConjunta();

        ContaPoupancaSalario cps1 = new ContaPoupancaSalario();


        //depositos

        System.out.println(cc1);
        cc1.depositar(1000);
        System.out.println("Saldo conta corrente " + cc1.getSaldo());

        System.out.println(cp1);
        cp1.depositar(800);
        System.out.println("Saldo conta poupança " + cp1.getSaldo());

        System.out.println(cj1);
        cj1.depositar(500);
        System.out.println(cj1);

        System.out.println(cps1);
        cps1.depositar(2000);
        System.out.println(cps1.toString());

        //saques
        cc1.sacar(1200);
        cc1.sacar(800);
        System.out.println(cc1);

        //atualizações
        cc1.atualizar(20);
        System.out.println(cc1);

    }
}
