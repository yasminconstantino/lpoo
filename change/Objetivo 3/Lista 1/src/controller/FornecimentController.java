package controller;

import model.Fornecimento;
import model.Produto;
import model.Fornecedor;

import java.text.NumberFormat;
import java.util.*;

public class FornecimentController {
    public static void main(String[] args) {
        Fornecedor f1 = new Fornecedor(1111110001, "Blueish", "contact");
        Fornecedor f2 = new Fornecedor(222220002, "Black", "contato");

        Produto p1 = new Produto(01, "Mouse", 36, 51, f1);
        Produto p2 = new Produto(02, "Teclado", 25, 86, f2);
        Produto p3 = new Produto(03, "Headphone", 12, 236, f1);


        //calcula o total
        double total = p1.getPreco() * 50;
        //baixa o estoque
        p1.setQuantidade(p1.getQuantidade()-20);
        Fornecimento fr1 = new Fornecimento(total, f1, p1);

        //calcula o total
        total = p2.getPreco() * 50;
        // baixa o estoque
        p2.setQuantidade(p1.getQuantidade() - 15);
        Fornecimento fr2 = new Fornecimento( total, f1, p2);

        //calcula o total
        total = p3.getPreco() * 20;
        // baixa o estoque
        p3.setQuantidade(p1.getQuantidade() - 8);
        Fornecimento fr3 = new Fornecimento( total, f2, p3);

        List<Fornecimento> fornecimentos = new ArrayList<>();
        fornecimentos.add(fr1);
        fornecimentos.add(fr2);
        fornecimentos.add(fr3);
        System.out.print("\n***** Lista de Fornecimentos");
        System.out.println(fornecimentos);

        System.out.println();
        System.out.print("\nTotal Fornecido = " +
                NumberFormat.getCurrencyInstance().format(
                        fornecimentos.stream()
                                .mapToDouble(f -> f.getTotal())
                                .sum()));

    }
}
