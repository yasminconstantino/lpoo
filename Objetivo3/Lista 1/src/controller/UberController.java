package controller;

import model.Corrida;
import model.Motorista;
import model.Usuario;
import model.Veiculo;

import java.time.LocalDateTime;
import java.util.*;
import java.text.NumberFormat;

public class UberController {
    public static void main(String[] args) {
        // criar objects
        Usuario usuario1 = new Usuario(1L, "Julia", "julia@gmail.com", "1111-1111");
        Veiculo veiculo1 = new Veiculo(1L, "Sedan", "SMT3651", 1995);
        Motorista motorista1 = new Motorista(1L, "Jack", "jack@gmail.com", "2222-2222", veiculo1);

        // Creating + objects
        Corrida corrida1 = new Corrida(1L, "Pix", "Aprovado", LocalDateTime.of(2024, 6, 18, 10, 0), 12.0, 12, usuario1, motorista1);
        Corrida corrida2 = new Corrida(2L, "Credito", "Aprovado", LocalDateTime.of(2023, 6, 18, 12, 0), 8.0, 12, usuario1, motorista1);

        // add corrida a lista e a usuario e motorista
        usuario1.getCorrida().addAll(Arrays.asList(corrida1, corrida2));
        motorista1.getCorrida().addAll(Arrays.asList(corrida1, corrida2));

        // imprimi as corridas por usuario e na ordem reversa
        System.out.println("\n***** Corridas por Usuário *****");
        usuario1.getCorrida().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        usuario1.getCorrida().forEach(System.out::println);

        // imprimi as corridas por motorista e na ordem reversa
        System.out.println("\n***** Corridas por Motorista *****");
        motorista1.getCorrida().sort(Comparator.comparing(Corrida::getDataInicio).reversed());
        motorista1.getCorrida().forEach(System.out::println);

        // Calcula o valor total da corrida do motorista
        System.out.print("\n***** Total das corridas do motorista " + motorista1.getNome() + " = ");
        double totalValue = motorista1.getCorrida().stream().mapToDouble(Corrida::getValor).sum();
        System.out.println(NumberFormat.getCurrencyInstance().format(totalValue));
    }
}
