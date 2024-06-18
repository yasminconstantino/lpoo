package controller;

import java.util.*;

import model.Marca;

public class MarcaController {
    public static void main (String[] args) {

        // constroi instancias de classe utilizando o construtor padrão
        Marca marc1 = new Marca();
        Marca marc2 = new Marca();
        Marca marc3 = new Marca();

        // constroi duas instancias de classe utilizando o construtor parametrizado
        Marca marc4 = new Marca(4, "Ford");
        Marca marc5 = new Marca(5, "Fiat");
        Marca marc6 = new Marca(6, "Volkswagen");

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(marc1);
        System.out.println(marc2);
        System.out.println(marc3);
        System.out.println(marc4);
        System.out.println(marc5);
        System.out.println(marc6);

        //alterando os objetos utilizando setters
        marc1.setId(1);
        marc1.setDescricao("Nissan");

        marc2.setId(2);
        marc2.setDescricao("Chevrolet");

        marc3.setId(3);
        marc3.setDescricao("Toyota");

        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(marc1.getId());
        System.out.println(marc1.getDescricao());

        System.out.println();
        System.out.println(marc2.getId());
        System.out.println(marc2.getDescricao());

        System.out.println();
        System.out.println(marc3.getId());

        System.out.println();
        System.out.println(marc4.getId());
        System.out.println(marc4.getDescricao());

        System.out.println();
        System.out.println(marc5.getId());
        System.out.println(marc5.getDescricao());

        System.out.println();
        System.out.println(marc6.getId());
        System.out.println(marc6.getDescricao());


        // criar uma coleção list e adicionar o objetos a ela
        List <Marca> marcaList = new ArrayList<>();
        System.out.println("\n----------List----------");
        marcaList.add (marc1);
        marcaList.add (marc2);
        marcaList.add (marc3);
        marcaList.add (marc4);
        marcaList.add (marc5);
        marcaList.add (marc6);
        marcaList.add (marc6); //a pricipio permitiu adicionar o mesmo duas vezes no List
        System.out.println(marcaList);

        // selecionar e imprimir o objeto de id 3 no List
        Marca marcaFind = marcaList.stream().filter( a -> a.getId() == 3).findAny().orElse(null);
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(marcaFind);

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente List----------");
        marcaList.sort(Comparator.comparing(Marca::getId).reversed());
        System.out.println(marcaList);



        // criar uma coleção Map e adicionar os objetos a ela
        //ao inves de Integer posso colocar um String, caso se faça necessario
        Map <Integer, Marca> marcaMap = new HashMap<> ();
        System.out.println("\n----------Map----------");
        marcaMap.put(marc1.getId(),marc1);
        marcaMap.put(marc2.getId(),marc2);
        marcaMap.put(marc3.getId(), marc3);
        //marcaMap.put(marc3.getId(), marc3); mesmo adicionando não apareceu, pois não pode, por causa da função Hash
        marcaMap.put(marc4.getId(), marc4);
        marcaMap.put(marc5.getId(), marc5);
        marcaMap.put(marc6.getId(), marc6);
        System.out.println(marcaMap);

        // selecionar e imprimir o objeto de id 3 no Map
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(marcaMap.get(3));

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente Map----------");
        System.out.println("\n operação proibida com o Map, pois altera o que foi indexado pelo Hash");
        
	}

}
