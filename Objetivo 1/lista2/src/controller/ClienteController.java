package controller;

import java.util.*;

import model.Cliente;


public class ClienteController {
    public static void main (String[] args) {

        // constroi instancias de classe utilizando o construtor padrão
        Cliente client1 = new Cliente();
        Cliente client2 = new Cliente();
        Cliente client3 = new Cliente();

        // constroi duas instancias de classe utilizando o construtor parametrizado
        Cliente client4 = new Cliente(4, "44444444444", "Katheryn", "Pierce", "Mystic-Falls", "44444-444", "4444-4444", "katheryn@gmail.com");
        Cliente client5 = new Cliente(5, "55555555554", "Stefan", "Salvatore", "Mystic_Falls", "55555-555", "5555-5555", "Stefan@gmail.com");
        Cliente client6 = new Cliente(6, "66666666666", "Damon", "Salvatore", "Mystic+Falls", "66666-666", "6666-6666", "Damon@gmail.com");

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
        System.out.println(client5);
        System.out.println(client6);

        //alterando os objetos utilizando setters
        client1.setId(1);
        client1.setCpf("11111111111");
        client1.setNome("Lisa");
        client1.setSobrenome("Manoban");
        client1.setEndereco("Seoul");
        client1.setCep("11111-111");
        client1.setTelefone("1111-1111");
        client1.setEmail("Lalalisa@gmail.com");

        client2.setId(2);
        client2.setCpf("22222222222");
        client2.setNome("Chris");
        client2.setSobrenome("Cornell");
        client2.setEndereco("LosAngeles");
        client2.setCep("22222-222");
        client2.setTelefone("2222-2222");
        client2.setEmail("CornellChris@gmail.com");

        client3.setId(3);
        client3.setCpf("33333333333");
        client3.setNome("Eddie");
        client3.setSobrenome("Veder");
        client3.setEndereco("SanFrancisco");
        client3.setCep("33333-333");
        client3.setTelefone("3333-3333");
        client3.setEmail("EddieV@gmail.com");

        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(client1.getId());
        System.out.println(client1.getCpf());
        System.out.println(client1.getNome());
        System.out.println(client1.getSobrenome());
        System.out.println(client1.getEndereco());
        System.out.println(client1.getCep());
        System.out.println(client1.getTelefone());
        System.out.println(client1.getEmail());

        System.out.println();
        System.out.println(client2.getId());
        System.out.println(client2.getCpf());
        System.out.println(client2.getNome());
        System.out.println(client2.getSobrenome());
        System.out.println(client2.getEndereco());
        System.out.println(client2.getCep());
        System.out.println(client2.getTelefone());
        System.out.println(client2.getEmail());

        System.out.println();
        System.out.println(client3.getId());
        System.out.println(client3.getCpf());
        System.out.println(client3.getNome());
        System.out.println(client3.getSobrenome());
        System.out.println(client3.getEndereco());
        System.out.println(client3.getCep());
        System.out.println(client3.getTelefone());
        System.out.println(client3.getEmail());

        System.out.println();
        System.out.println(client4.getId());
        System.out.println(client4.getCpf());
        System.out.println(client4.getNome());
        System.out.println(client4.getSobrenome());
        System.out.println(client4.getEndereco());
        System.out.println(client4.getCep());
        System.out.println(client4.getTelefone());
        System.out.println(client4.getEmail());

        System.out.println();
        System.out.println(client5.getId());
        System.out.println(client5.getCpf());
        System.out.println(client5.getNome());
        System.out.println(client5.getSobrenome());
        System.out.println(client5.getEndereco());
        System.out.println(client5.getCep());
        System.out.println(client5.getTelefone());
        System.out.println(client5.getEmail());

        System.out.println();
        System.out.println(client6.getId());
        System.out.println(client6.getCpf());
        System.out.println(client6.getNome());
        System.out.println(client6.getSobrenome());
        System.out.println(client6.getEndereco());
        System.out.println(client6.getCep());
        System.out.println(client6.getTelefone());
        System.out.println(client6.getEmail());


        // criar uma coleção list e adicionar o objetos a ela
        List <Cliente> clienteList = new ArrayList<>();
        System.out.println("\n----------List----------");
        clienteList.add (client1);
        clienteList.add (client2);
        clienteList.add (client3);
        clienteList.add (client4);
        clienteList.add (client5);
        clienteList.add (client6);
        clienteList.add (client6); //a pricipio permitiu adicionar o mesmo duas vezes no List
        System.out.println(clienteList);

        // selecionar e imprimir o objeto de id 3 no List
        Cliente clienteFind = clienteList.stream().filter( a -> a.getId() == 3).findAny().orElse(null);
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(clienteFind);

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente List----------");
        clienteList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(clienteList);



        // criar uma coleção Map e adicionar os objetos a ela
        //ao inves de Integer posso colocar um String, caso se faça necessario
        Map <Integer, Cliente> clienteMap = new HashMap<> ();
        System.out.println("\n----------Map----------");
        clienteMap.put(client1.getId(),client1);
        clienteMap.put(client2.getId(),client2);
        clienteMap.put(client3.getId(), client3);
        //clienteMap.put(client3.getId(), client3); mesmo adicionando não apareceu, pois não pode, por causa da função Hash
        clienteMap.put(client4.getId(), client4);
        clienteMap.put(client5.getId(), client5);
        clienteMap.put(client6.getId(), client6);
        System.out.println(clienteMap);

        // selecionar e imprimir o objeto de id 3 no Map
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(clienteMap.get(3));

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente Map----------");
        System.out.println("\n operação proibida com o Map, pois altera o que foi indexado pelo Hash");
        
	}

}
