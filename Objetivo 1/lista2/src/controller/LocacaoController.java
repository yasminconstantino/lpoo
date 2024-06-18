package controller;

import java.util.*;

import java.util.Calendar;

import java.time.LocalDateTime;
 
import model.Locacao;


public class LocacaoController {
    public static void main (String[] args) {

        /*
            private int id;
    private Calendar dataLocacao;
    private Calendar horaLocacao;
    private Calendar dataDevolucao;
    private Calendar horaDevolucao;
    private int quilometragem;
    private double valorCalcao;
    private double valorLocacao;
    private boolean devolvido;
         */
        // constroi instancias de classe utilizando o construtor padrão
        Locacao locac1 = new Locacao();
        Locacao locac2 = new Locacao();
        Locacao locac3 = new Locacao();

        // constroi duas instancias de classe utilizando o construtor parametrizado
        Locacao locac4 = new Locacao(3, LocalDateTime.of(2021, 2, 10, 10, 0), LocalDateTime.of(2021, 2, 15, 10, 0), 200, 30.00, 30.00, false); //utilizando o construtor parametrizado

        //Locacao locac4 = new Locacao(4, "2024-03-12", "15:32", "2024-03-22", "16:28", 12365, 58.00, 108.00, false);
        Locacao locac5 = new Locacao(5, "55555555554", "Stefan", "Salvatore", "Mystic_Falls", "55555-555", "5555-5555", "Stefan@gmail.com");
        Locacao locac6 = new Locacao(6, "66666666666", "Damon", "Salvatore", "Mystic+Falls", "66666-666", "6666-6666", "Damon@gmail.com");

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(locac1);
        System.out.println(locac2);
        System.out.println(locac3);
        System.out.println(locac4);
        System.out.println(locac5);
        System.out.println(locac6);

        //alterando os objetos utilizando setters
        locac1.setId(1);
        locac1.setCpf("11111111111");
        locac1.setNome("Lisa");
        locac1.setSobrenome("Manoban");
        locac1.setEndereco("Seoul");
        locac1.setCep("11111-111");
        locac1.setTelefone("1111-1111");
        locac1.setEmail("Lalalisa@gmail.com");

        locac2.setId(2);
        locac2.setCpf("22222222222");
        locac2.setNome("Chris");
        locac2.setSobrenome("Cornell");
        locac2.setEndereco("LosAngeles");
        locac2.setCep("22222-222");
        locac2.setTelefone("2222-2222");
        locac2.setEmail("CornellChris@gmail.com");

        locac3.setId(3);
        locac3.setCpf("33333333333");
        locac3.setNome("Eddie");
        locac3.setSobrenome("Veder");
        locac3.setEndereco("SanFrancisco");
        locac3.setCep("33333-333");
        locac3.setTelefone("3333-3333");
        locac3.setEmail("EddieV@gmail.com");

        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(locac1.getId());
        System.out.println(locac1.getCpf());
        System.out.println(locac1.getNome());
        System.out.println(locac1.getSobrenome());
        System.out.println(locac1.getEndereco());
        System.out.println(locac1.getCep());
        System.out.println(locac1.getTelefone());
        System.out.println(locac1.getEmail());

        System.out.println();
        System.out.println(locac2.getId());
        System.out.println(locac2.getCpf());
        System.out.println(locac2.getNome());
        System.out.println(locac2.getSobrenome());
        System.out.println(locac2.getEndereco());
        System.out.println(locac2.getCep());
        System.out.println(locac2.getTelefone());
        System.out.println(locac2.getEmail());

        System.out.println();
        System.out.println(locac3.getId());
        System.out.println(locac3.getCpf());
        System.out.println(locac3.getNome());
        System.out.println(locac3.getSobrenome());
        System.out.println(locac3.getEndereco());
        System.out.println(locac3.getCep());
        System.out.println(locac3.getTelefone());
        System.out.println(locac3.getEmail());

        System.out.println();
        System.out.println(locac4.getId());
        System.out.println(locac4.getCpf());
        System.out.println(locac4.getNome());
        System.out.println(locac4.getSobrenome());
        System.out.println(locac4.getEndereco());
        System.out.println(locac4.getCep());
        System.out.println(locac4.getTelefone());
        System.out.println(locac4.getEmail());

        System.out.println();
        System.out.println(locac5.getId());
        System.out.println(locac5.getCpf());
        System.out.println(locac5.getNome());
        System.out.println(locac5.getSobrenome());
        System.out.println(locac5.getEndereco());
        System.out.println(locac5.getCep());
        System.out.println(locac5.getTelefone());
        System.out.println(locac5.getEmail());

        System.out.println();
        System.out.println(locac6.getId());
        System.out.println(locac6.getCpf());
        System.out.println(locac6.getNome());
        System.out.println(locac6.getSobrenome());
        System.out.println(locac6.getEndereco());
        System.out.println(locac6.getCep());
        System.out.println(locac6.getTelefone());
        System.out.println(locac6.getEmail());


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



/*package controller;

import java.time.LocalDateTime;
import java.util.*;

import model.Locacao;

public class LocacaoController {
    public static void main(String[] args) {
        //construtor padrão
        Locacao locacao1 = new Locacao(); //utilizando o construtor padrão
        Locacao locacao2 = new Locacao();

        //construtor parametrizado todos os atributos
        Locacao locacao3 = new Locacao(3, LocalDateTime.of(2021, 2, 10, 10, 0), LocalDateTime.of(2021, 2, 15, 10, 0), 200, 30.00, 30.00, false); //utilizando o construtor parametrizado
        Locacao locacao4 = new Locacao(4, LocalDateTime.of(2023, 2, 10, 10, 0), LocalDateTime.of(2023, 2, 15, 10, 0), 200, 40.00, 40.00, false); //utilizando o construtor parametrizado

        //construtor parametrizado três parâmetros
        Locacao locacao5 = new Locacao(5, false);
        Locacao locacao6 = new Locacao(6, false);


        //coleção do tipo List
        List<Locacao> locacaosList = new ArrayList<>(); 
        locacaosList.add(locacao1);
        locacaosList.add(locacao2);
        locacaosList.add(locacao3);
        locacaosList.add(locacao4);
        locacaosList.add(locacao5);
        locacaosList.add(locacao6);
        System.out.println("\n coleção tipo List\n" + locacaosList);

        //ordenando a coleçao do tipo List
        System.out.println();
        locacaosList.sort(Comparator.comparing(Locacao::getId));
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(locacaosList);

        //Pesquisa por força bruta
        for(Locacao locacao : locacaosList){
            if(locacao.getId() == 3){
                System.out.print("\nResultado da pesquisa pelo Locacao de id=3");
                System.out.print(locacao);
            }
        }

        //Método utilizando Fluxos para a estrutura de dados
        System.out.println();
        System.out.print("\nLocalizando o Locacao pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
        Locacao locacaoFind = locacaosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(locacaoFind);

                //ordenando a coleçao do tipo List decrescente
        System.out.println();
        locacaosList.sort(Comparator.comparing(Locacao::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(locacaosList);
    }

}*/