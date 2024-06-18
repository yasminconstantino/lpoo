package model;

import java.util.ArrayList;
import java.util.List;

public class Motorista {
    private Long id;
    private String nome;
    private String email;
    private String telefone;
    private Veiculo veiculo;
    private List<Corrida> corridas;

    // Constructor
    public Motorista(Long id, String nome, String email, String telefone, Veiculo veiculo) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.veiculo = veiculo;
        this.corridas = new ArrayList<>();
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public String getTelefone() { return telefone; }
    public Veiculo getVeiculo() { return veiculo; }
    public List<Corrida> getCorrida() { return corridas; }

    @Override
    public String toString() {
        return "Motorista{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone='" + telefone + '\'' +
                ", veiculo=" + veiculo +
                '}';
    }
}
