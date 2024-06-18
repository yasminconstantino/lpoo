package model;

import java.util.*;

public class Time {
    private long id;
    private String nome;
    private String uf;
    private List <Atleta> atleta = new ArrayList<>();

    public Time(long id, String nome, String uf, List<Atleta> atleta) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
        this.atleta = atleta;
    }

    public Time() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public List<Atleta> getAtleta() {
        return atleta;
    }

    public void setAtleta(List<Atleta> atleta) {
        this.atleta = atleta;
    }

    @Override
    public String toString() {
        return "\nTime{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", uf='" + uf + '\'' +
                ", atleta=" + atleta +
                '}';
    }
}
