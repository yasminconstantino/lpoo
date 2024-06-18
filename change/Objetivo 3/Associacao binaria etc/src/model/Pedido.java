package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

    public class Pedido {

        //atributos
        private Long id;
        private String formaPagamento;
        private String estado;
        private GregorianCalendar dataCriacao;
        private GregorianCalendar dataModificacao;
        private Double totalPedido;
        private Boolean situacao;

        //ligações entre classes
        Cliente cliente;
        //composição com item pedido
        List <ItemPedido> itens = new ArrayList<>();


        //construtores
        public Pedido(Long id, String formaPagamento, GregorianCalendar dataCriacao, String estado, GregorianCalendar dataModificacao, Double totalPedido, Boolean situacao, Cliente cliente, List<ItemPedido> itens) {
            this.id = id;
            this.formaPagamento = formaPagamento;
            this.dataCriacao = dataCriacao;
            this.estado = estado;
            this.dataModificacao = dataModificacao;
            this.totalPedido = totalPedido;
            this.situacao = situacao;
            this.cliente = cliente;
            this.itens = itens;
        }

        //construtores
        public Pedido(Long id, String formaPagamento, GregorianCalendar dataCriacao, String estado, GregorianCalendar dataModificacao, Double totalPedido, Boolean situacao) {
            this.id = id;
            this.formaPagamento = formaPagamento;
            this.dataCriacao = dataCriacao;
            this.estado = estado;
            this.dataModificacao = dataModificacao;
            this.totalPedido = totalPedido;
            this.situacao = situacao;
            /*this.cliente = cliente;
            this.itens = itens;*/
        }

        public Pedido() {
        }

        //gets and setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFormaPagamento() {
            return formaPagamento;
        }

        public void setFormaPagamento(String formaPagamento) {
            this.formaPagamento = formaPagamento;
        }

        public String getEstado() {
            return estado;
        }

        public void setEstado(String estado) {
            this.estado = estado;
        }

        public GregorianCalendar getDataModificacao() {
            return dataModificacao;
        }

        public void setDataModificacao(GregorianCalendar dataModificacao) {
            this.dataModificacao = dataModificacao;
        }

        public GregorianCalendar getDataCriacao() {
            return dataCriacao;
        }

        public void setDataCriacao(GregorianCalendar dataCriacao) {
            this.dataCriacao = dataCriacao;
        }

        public Double getTotalPedido() {
            return totalPedido;
        }

        public void setTotalPedido(Double totalPedido) {
            this.totalPedido = totalPedido;
        }

        public Boolean getSituacao() {
            return situacao;
        }

        public void setSituacao(Boolean situacao) {
            this.situacao = situacao;
        }

        public Cliente getCliente() {
            return cliente;
        }

        public void setCliente(Cliente cliente) {
            this.cliente = cliente;
        }

        public List<ItemPedido> getItens() {
            return itens;
        }

        public void setItens(List<ItemPedido> itens) {
            this.itens = itens;
        }

        @Override
        public String toString() {
            return "\nPedido{" +
                    "id=" + id +
                    ", formaPagamento='" + formaPagamento + '\'' +
                    ", estado='" + estado + '\'' +
                    ", dataCriacao=" + dataCriacao +
                    ", dataModificacao=" + dataModificacao +
                    ", totalPedido=" + totalPedido +
                    ", situacao=" + situacao +
                    ", cliente=" + cliente +
                    ", itens=" + itens +
                    '}';
        }
}
