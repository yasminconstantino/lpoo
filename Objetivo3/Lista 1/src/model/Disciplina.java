package model;

public class Disciplina {
    private long cod;
    private String nome;

    public Disciplina(long cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public Disciplina() {
    }

    public long getCod() {
        return cod;
    }

    public void setCod(long cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "\nDisciplina{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                '}';
    }
}
