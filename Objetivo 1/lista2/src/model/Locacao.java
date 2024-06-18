package model;

import javax.swing.*;
import java.util.Calendar;

public class Locacao {
    private int id;
    private Calendar dataLocacao;
    private Calendar horaLocacao;
    private Calendar dataDevolucao;
    private Calendar horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private boolean devolvido;

    public Locacao( int id, Calendar dataLocacao, Calendar horaLocacao, Calendar dataDevolucao, Calendar horaDevolucao, int quilometragem, double valorCalcao, double valorLocacao, boolean devolvido) {
        this.id = id;
        this.dataLocacao = dataLocacao;
        this.horaLocacao = horaLocacao;
        this.dataDevolucao = dataDevolucao;
        this.horaDevolucao = horaDevolucao;
        this.quilometragem = quilometragem;
        this.valorCalcao = valorCalcao;
        this.valorLocacao = valorLocacao;
        this.devolvido = devolvido;
    }

    public Locacao(Integer id, Boolean devolvido) {
        this.id = id;
        this.devolvido = devolvido;
    }

    public Locacao() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Calendar getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(Calendar dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

    public Calendar getHoraLocacao() {
        return horaLocacao;
    }

    public void setHoraLocacao(Calendar horaLocacao) {
        this.horaLocacao = horaLocacao;
    }

    public Calendar getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public Calendar getHoraDevolucao() {
        return horaDevolucao;
    }

    public void setHoraDevolucao(Calendar horaDevolucao) {
        this.horaDevolucao = horaDevolucao;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public double getValorCalcao() {
        return valorCalcao;
    }

    public void setValorCalcao(double valorCalcao) {
        this.valorCalcao = valorCalcao;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public boolean isDevolvido() {
        return devolvido;
    }

    public void setDevolvido(boolean devolvido) {
        this.devolvido = devolvido;
    }

    @Override
    public String toString() {
        return "\nLocacao [id=" + id + ", dataLocacao e horaLocacao=" + dataLocacao
                + ", dataDevolucao e horaDevolucao=" + dataDevolucao + ", quilometragem="
                + quilometragem + ", valorCalcao=" + valorCalcao + ", valorLocacao=" + valorLocacao + ", devolvido="
                + devolvido + "]";
    }

}
