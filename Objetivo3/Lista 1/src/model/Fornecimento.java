package model;


public class Fornecimento {
    private int ano;
    private double total;
    private Fornecedor fornecedor;
    private Produto produto;

    public Fornecimento(double total, Fornecedor fornecedor, Produto produto) {
        this.total = total;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }

    public Fornecimento() {
    }

    public int getano() {
        return ano;
    }

    public void setano(int ano) {
        this.ano = ano;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecimento{" +
                "ano=" + ano +
                ", valorTotal=" + total +
                ", fornecedor=" + fornecedor +
                ", produto=" + produto +
                '}';
    }
}
