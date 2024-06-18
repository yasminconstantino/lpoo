package controller;

import model.Cliente;
import model.ItemPedido;
import model.Pedido;
import model.Produto;

import java.util.*;

import java.util.Calendar;

public class ClientePedidoController {
    public static void main(String[] args) {
        //cadastro de cliente
        Cliente cliente1 = new Cliente(1l, "Maise", "Williams", true);
        System.out.println("\nCliente " + cliente1.getNome() + " " + cliente1.getSobrenome() + " Cadastrado com sucesso!");

        //cadastro de produto
        Produto produto1 = new Produto(1l, "Mouse", "Bluetooth", 36, true);

        //cadastro de item
        ItemPedido item = new ItemPedido(1l, 2, 51.0, true, produto1);

        //lista de itens do pedido
        List <ItemPedido> itens = new ArrayList<>();
        itens.add(item);

        //cadastra o pedido pro cliente
        Pedido pedido1 = new Pedido(1l, "a vista", new GregorianCalendar(2022,4,10,11,00), "aberto", new GregorianCalendar(2022,4,10,12,00), 1200.0, true);
        System.out.println("\nDetalhes do pedido: " + pedido1);
        cliente1.getPedidos().add(pedido1);

        pedido1.getItens().add(item);

        //relação de pedido e cliente
        System.out.println("\nPedidos do cliente: " + cliente1.getNome() + " " + cliente1.getSobrenome());
        System.out.println(cliente1.getPedidos());
    }
}
