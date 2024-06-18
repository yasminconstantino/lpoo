package model;

public class Desenvolvedor extends Funcionario {

    //criar os construtores nas sub classes tbmmm
    public Desenvolvedor(String nome, double salario) {
        super (nome, salario);
    }

    public Desenvolvedor() {
        super();
    }

    public double getBonus() {
        return getSalario() * 0.05;
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
