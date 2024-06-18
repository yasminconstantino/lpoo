package controller;

import model.Empresa;
import model.Funcionario;

import java.util.*;

public class EmpresaFuncionarioController {
    public static void main(String[] args) {
        //criar objetos
        Empresa e1 = new Empresa("111111000111", "Stark Industries", "Industrias Stark");
        Empresa e2 = new Empresa("222222000122", "Empire", "Imperio");
        Funcionario f1 = new Funcionario(111, "111111111111", "Jace", "Wayland", 1998);
        Funcionario f2 = new Funcionario(222, "222222222222", "Anna", "Gilbert", 1999);
        Funcionario f3 = new Funcionario(333, "333333333333", "Violet", "Harmon", 1996);
        Funcionario f4 = new Funcionario(444, "444444444444", "Tate", "Langdon", 1989);
        Funcionario f5 = new Funcionario(555, "555555555555", "Aria", "Montgomery", 1992);
        Funcionario f6 = new Funcionario(666, "666666666666", "Ezra", "Fitz", 1990);

        //add funcioanrios nas empresas
        e1.getFuncionarios().add(f1);
        e1.getFuncionarios().add(f2);
        e1.getFuncionarios().add(f3);
        e2.getFuncionarios().add(f4);
        e2.getFuncionarios().add(f5);
        e2.getFuncionarios().add(f6);

        // imprimir empresas e funcionarios em ordem crescente por nome
        System.out.println("Empresas e funcionarios");
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getNome));
        System.out.println(e2);

        //imprimir e ordenar por ordem decrescente de idade
        e1.getFuncionarios().sort(Comparator.comparing(Funcionario::getANoNascimento).reversed());
        System.out.println(e1);
        e2.getFuncionarios().sort(Comparator.comparing(Funcionario::getANoNascimento).reversed());
        System.out.println(e2);
    }
}
