package model;

import java.util.*;

public class Aluno {
    private long matricula;
    private String nome;
    private String sobrenome;
    private List <Disciplina> disciplina = new ArrayList<>();

    public Aluno(long matricula, String nome, String sobrenome, List<Disciplina> disciplina) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.disciplina = disciplina;
    }

    public Aluno(long matricula, String nome, String sobrenome) {
        this.matricula = matricula;
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Aluno() {
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public String toString() {
        return "\nAluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", disciplina=" + disciplina +
                '}';
    }
}
