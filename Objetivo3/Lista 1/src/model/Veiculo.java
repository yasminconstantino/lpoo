package model;

public class Veiculo {
    private Long id;
    private String tipo;
    private String placa;
    private int ano;

    // Constructor
    public Veiculo(Long id, String tipo, String placa, int ano) {
        this.id = id;
        this.tipo = tipo;
        this.placa = placa;
        this.ano = ano;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getTipo() { return tipo; }
    public String getPlaca() { return placa; }
    public int getAno() { return ano; }

    @Override
    public String toString() {
        return "Veiculo{" +
                "id=" + id +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", ano=" + ano +
                '}';
    }
}
