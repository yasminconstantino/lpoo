package model;

public class Marca {
    private int id;
    private String descricao;

    public Marca(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public Marca(String descricao) {
        this.descricao = descricao;
    }

    public Marca() {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "\nMarca [id=" + id + ", descricao=" + descricao + "]";
    }

}
