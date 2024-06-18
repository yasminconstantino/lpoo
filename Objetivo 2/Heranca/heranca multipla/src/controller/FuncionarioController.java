package controller;

import model.*;

public class FuncionarioController {
    public static void main(String[] args){
        Desenvolvedor d1 = new Desenvolvedor();

        Gerente g1 = new Gerente();

        Cliente c1 = new Cliente();

        d1.setNome("Daniel");
        d1.setSalario(1000);
        System.out.println(d1);

        g1.setNome("Lucy");
        g1.setSalario(2000);
        g1.setTicker("TOTS3");
        g1.setQuantidade(1000);
        System.out.println(g1);

        c1.setId(1);
        c1.setNome("Cameron");
        c1.setSobrenome("Briel");
        c1.setTicker("TOTS3");
        c1.setQuantidade(1000);
        System.out.println(c1);
    }
}