package model;


public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int anoFabricacao;


    // metodo construtor: com passagem de parametro
    public Carro(int id, String marca, String modelo, int anoFabricacao) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

     //metodo construtor: sem passagem de parametro
    public Carro() {
    }

    public Carro (int id, String marca, String modelo){
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
    }

    //metodo acessor: gets e setters id
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }

    //metodo acessor: gets e setters marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    //metodo acessor: gets e setters modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    //metodo acessor: gets e setters ano de fabricação
    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }


    // metodo utilitario: to String
    @Override
    public String toString() {
        return "\nVeiculo [id=" + id + ", marca:" + marca + ", modelo:" + modelo + ", Ano:" + anoFabricacao + "]";
    }
}
