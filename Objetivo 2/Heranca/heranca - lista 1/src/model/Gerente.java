package model;

public class Gerente extends Funcionario{

    //criar os construtores nas sub classes tbmmm
    public Gerente(String nome, double salario) {
        super (nome, salario);
    }

    public Gerente() {
        super();
    }

    public double getBonus() {
        return getSalario() * 0.20;
    }

    @Override
    public String toString() {
        return "\nGerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
