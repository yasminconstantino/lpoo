package model;

import java.util.*;

public class Fornecedor {
    private int cnpj;
    private String nome;
    private String contato;
    private List <Produto> produto = new ArrayList<>();

    public Fornecedor(int cnpj, String nome, String contato, List<Produto> produto) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
        this.produto = produto;
    }

    public Fornecedor(int cnpj, String nome, String contato) {
        this.cnpj = cnpj;
        this.nome = nome;
        this.contato = contato;
    }

    public Fornecedor() {
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public List<Produto> getProduto() {
        return produto;
    }

    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "\nFornecedor{" +
                "cnpj=" + cnpj +
                ", nome='" + nome + '\'' +
                ", contato='" + contato + '\'' +
                ", produto=" + produto +
                '}';
    }
}
