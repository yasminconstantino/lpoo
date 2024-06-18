package controller;

import model.Aluno;
import model.Disciplina;

import java.util.*;

public class AlunoDisciplinaController {
    public static void main(String[] args) {
        Aluno a1 = new Aluno(1234, "Mary", "Jane");
        Aluno a2 = new Aluno(4567, "Peter", "Parker");
        Disciplina d1 = new Disciplina(4321, "LPOO");
        Disciplina d2 = new Disciplina(4322, "BD");
        Disciplina d3 = new Disciplina(4323, "LPW");

        //add disciplinas. 2 no a1 e 3 no a2
        a1.getDisciplina().add(d1);
        a1.getDisciplina().add(d2);

        a2.getDisciplina().add(d1);
        a2.getDisciplina().add(d2);
        a2.getDisciplina().add(d3);

        // ordenar e imprimir pelas disciplinas
        System.out.println("Alunos e disciplinas");
        a1.getDisciplina().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplina().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);

        //remover as disciplinas do a2 e reimprimir
        System.out.println("Reimpressão Alunos e disciplinas");
        a2.getDisciplina().clear();
        a1.getDisciplina().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a1);
        a2.getDisciplina().sort(Comparator.comparing(Disciplina::getNome));
        System.out.println(a2);
    }
}
