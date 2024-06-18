package model;

import java.time.LocalDateTime;

public class Corrida {
    private Long id;
    private String metodoPagamento;
    private String statusPagamento;
    private LocalDateTime dataInicio;
    private double valor;
    private int duracao;
    private Usuario usuario;
    private Motorista motorista;

    // Constructor
    public Corrida(Long id, String metodoPagamento, String statusPagamento, LocalDateTime dataInicio, double valor, int duracao, Usuario usuario, Motorista motorista) {
        this.id = id;
        this.metodoPagamento = metodoPagamento;
        this.statusPagamento = statusPagamento;
        this.dataInicio = dataInicio;
        this.valor = valor;
        this.duracao = duracao;
        this.usuario = usuario;
        this.motorista = motorista;
    }

    // Getters and setters
    public Long getId() { return id; }
    public String getMetodoPagamento() { return metodoPagamento; }
    public String getStatusPagamento() { return statusPagamento; }
    public LocalDateTime getDataInicio() { return dataInicio; }
    public double getValor() { return valor; }
    public int getDuracao() { return duracao; }
    public Usuario getUsuario() { return usuario; }
    public Motorista getMotorista() { return motorista; }

    @Override
    public String toString() {
        return "Corrida{" +
                "id=" + id +
                ", metodoPagamento='" + metodoPagamento + '\'' +
                ", statusPagamento='" + statusPagamento + '\'' +
                ", dataInicio=" + dataInicio +
                ", valor=" + valor +
                ", duracao=" + duracao +
                ", usuario=" + usuario.getNome() +  // Avoid deep recursion by only using simple fields
                ", motorista=" + motorista.getNome() +  // Avoid deep recursion by only using simple fields
                '}';
    }
}
