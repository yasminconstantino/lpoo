package controller;

import java.util.*;

import model.Conta;

public class ContaController {

    public static void main(String[] args) {
        //---------------- Respostas da Questão 1 ----------------
        //constrói duas instâncias da classe utilizando o construtor padrão
        Conta conta1 = new Conta(); //utilizando o construtor padrão
        Conta conta2 = new Conta();

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Conta conta3 = new Conta(3, 3000.00); //utilizando o construtor parametrizado
        Conta conta4 = new Conta(4, 4000.00); //utilizando o construtor parametrizado

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Conta conta5 = new Conta(5000.00);
        Conta conta6 = new Conta(6000.00);

        //imprime todas instâncias (todos os objetos)
        System.out.println("Contas criados com os contrutores padrão e parametrizado");
        System.out.println(conta1); //criado com um contrutor padrão
        System.out.println(conta2); //criado com um contrutor padrão
        System.out.println(conta3); //criado com um contrutor parametrizado, com todos os atrutos nele
        System.out.println(conta4); //criado com um contrutor parametrizado, com todos os atrutos nele
        System.out.println(conta5); //criado com um contrutor parametrizado, uma variação dos dois anteriores
        System.out.println(conta6); //criado com um contrutor parametrizado, uma variação dos dois anteriores

        //alterando o estado dos objetos na memória RAM utilizando setters
		/*
			Para facilitar o debug do código, todos os saldos receberam o dobro.
			Note que o setter, nesse exercício, está disfarçado de deposita.
		*/
        conta1.setId(1);
        conta1.deposita(2000.00);
        conta2.setId(2);
        conta2.deposita(4000.00);

        conta3.setId(3);
        conta3.deposita(5000.00);
        conta4.setId(4);
        conta4.deposita(8000.00);

        conta5.setId(5);
        conta5.deposita(10000.00);
        conta6.setId(6);
        conta6.deposita(12000.00);


        System.out.println(conta1.getId());
        System.out.println(conta1.getSaldo());
        System.out.println(conta2.getId());
        System.out.println(conta2.getSaldo());

        System.out.println(conta3.getId());
        System.out.println(conta3.getSaldo());
        System.out.println(conta4.getId());
        System.out.println(conta4.getSaldo());

        System.out.println(conta5.getId());
        System.out.println(conta5.getSaldo());
        System.out.println(conta6.getId());
        System.out.println(conta6.getSaldo());

        //---------------- Respostas da Questão 2 ----------------
        //coleção do tipo List
        List<Conta> contaList = new ArrayList<>();
        contaList.add(conta1);
        contaList.add(conta2);
        contaList.add(conta3);
        contaList.add(conta4);
        contaList.add(conta5);
        contaList.add(conta6);
        System.out.println("\nColeção do tipo List\n" + contaList);


        //ordenando a coleçao do tipo List
        System.out.println();
        contaList.sort(Comparator.comparing(Conta::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(contaList);

        //Pesquisa por força bruta
        for(Conta conta : contaList){
            if(conta.getId() == 3){
                System.out.print("\nResultado da pesquisa pelo Conta de id=3");
                System.out.print(conta);
            }
        }

        //Método utilizando Fluxos para a estrutura de dados
        System.out.println();
        System.out.print("\nLocalizando o Conta pela chave de pesquisa (id=4) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
        Conta contaFind = contaList.stream().filter(c -> c.getId() == 4).findAny().orElse(null);
        System.out.println(contaFind);

        //Método utilizando o método binarySearch da classe Collections
        System.out.println();
        System.out.print("Localizando o Conta pela chave de pesquisa (id=5) na coleção do tipo List (método binarySearch da classe Collections) ...");
        contaList.sort(Comparator.comparing(Conta::getId)); //ordena ascendente, conforme exigido na documentação
        contaFind = contaList.get(
                Collections.binarySearch(
                        contaList,
                        new Conta(5, 0.0), //o valor do saldo não importa nesta pesquisa
                        Comparator.comparing(Conta::getId)
                )
        );
        System.out.println(contaFind);

        //----------------
        //para coleção do tipo Map
        Map<Integer, Conta> contasMap = new HashMap<>();
        contasMap.put(conta1.getId(), conta1);
        contasMap.put(conta2.getId(), conta2);
        contasMap.put(conta3.getId(), conta3);
        contasMap.put(conta4.getId(), conta4);
        contasMap.put(conta5.getId(), conta5);
        contasMap.put(conta6.getId(), conta6);
        System.out.println("\nColeção do tipo Map\n" + contasMap);

        //ordenando a coleçao do tipo Map (operação proibida, pois mudaria o conteúdo indexado pela função hash)

        //(Note, não há o conceito de pesquisa por força bruta e binária em uma estrutura de dados do tipo Map)
        //pesquisando na coleção (basta entrar com a chave que o objeto já é retornado)
        System.out.println();
        System.out.print("Localizando o Conta pela chave de pesquisa (id=2) na coleção do tipo Map...");
        System.out.println(contasMap.get(2));
    }

}