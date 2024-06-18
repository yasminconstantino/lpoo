package model;

public class Aluno {
    private int id;
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email;

    // métodos construtores
    public Aluno(int id, int cpf, java.lang.String nome, java.lang.String sobrenome, java.lang.String email) {
        this.id = id;
        this.cpf = cpf;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
    }

    public Aluno(int id, int cpf) {
        this.id = id;
        this.cpf = cpf;
    }
    public Aluno (){
    }

    //metodos acessores
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //metodo utilitario
    @java.lang.Override
    public java.lang.String toString() {
        return "\nAluno{" +
                "id=" + id +
                ", cpf=" + cpf +
                ", nome=" + nome +
                ", sobrenome=" + sobrenome +
                ", email=" + email +
                '}';
    }
}
