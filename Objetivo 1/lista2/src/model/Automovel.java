package model;

public class Automovel {
    private int id;
    private String renavan;
    private String placa;
    private String cor;
    private int numRodas;
    private String combustivel;
    private int quilometragem;
    private String chassi;
    private double valorLocacao;

    //Construtor, com passagem de parametro
    public Automovel(int id, String renavan, String placa, String cor, int numRodas, String combustivel, int quilometragem, String chassi, double valorLocacao) {
        this.id = id;
        this.renavan = renavan;
        this.placa = placa;
        this.cor = cor;
        this.numRodas = numRodas;
        this.combustivel = combustivel;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.valorLocacao = valorLocacao;
    }

    public Automovel(String placa, String cor) {
        this.placa = placa;
        this.cor = cor;
    }

    // Construtor padrão, sem passagem de parametro
    public Automovel () {}


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // acessores renavan
    public String getRenavan () {
        return renavan;
    }
    public void setRenavan(String renavan) {
        this.renavan = renavan;
    }


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }


    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumRodas() {
        return numRodas;
    }

    public void setNumRodas(int numRodas) {
        this.numRodas = numRodas;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    @Override
    public String toString() {
        return "\nVeiculo [ id= " + id + ", renavan=" + renavan + ", placa=" + placa + ", cor=" + cor + ", num_rodas=" + numRodas
                + ", combustivel=" + combustivel + ", quilometragem=" + quilometragem + ", chassi=" + chassi
                + ", valorLocacao=" + valorLocacao + "]";
    }

}
