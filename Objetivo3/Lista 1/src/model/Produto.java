package model;

public class Produto {
    private int cod;
    private String nome;
    private int quantidade;
    private double preco;
    private Fornecedor fornecedor;

    public Produto(int cod, String nome, int quantidade, double preco, Fornecedor fornecedor) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }

    public Produto(int cod, String nome, int quantidade, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto() {
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    //public boolean manterProduto (int cod){}

    @Override
    public String toString() {
        return "\nProduto{" +
                "cod=" + cod +
                ", nome='" + nome + '\'' +
                ", quantidade='" + quantidade + '\'' +
                ", preco=" + preco +
                ", fornecedor=" + fornecedor +
                '}';
    }
}
