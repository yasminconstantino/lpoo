package controller;

import java.util.*;

import model.Modelo;


public class ModeloController {
    public static void main (String[] args) {

        // constroi instancias de classe utilizando o construtor padrão
        Modelo model1 = new Modelo();
        Modelo model2 = new Modelo();
        Modelo model3 = new Modelo();

        // constroi duas instancias de classe utilizando o construtor parametrizado
        Modelo model4 = new Modelo(4, "Mustang");
        Modelo model5 = new Modelo(5, "147");
        Modelo model6 = new Modelo(6, "Golf");

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(model1);
        System.out.println(model2);
        System.out.println(model3);
        System.out.println(model4);
        System.out.println(model5);
        System.out.println(model6);

        //alterando os objetos utilizando setters
        model1.setId(1);
        model1.setDescricao("Skyline");

        model2.setId(2);
        model2.setDescricao("Corvette");

        model3.setId(3);
        model3.setDescricao("Supra");

        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(model1.getId());
        System.out.println(model1.getDescricao());

        System.out.println();
        System.out.println(model2.getId());
        System.out.println(model2.getDescricao());

        System.out.println();
        System.out.println(model3.getId());
        System.out.println(model3.getDescricao());

        System.out.println();
        System.out.println(model4.getId());
        System.out.println(model4.getDescricao());

        System.out.println();
        System.out.println(model5.getId());
        System.out.println(model5.getDescricao());

        System.out.println();
        System.out.println(model6.getId());
        System.out.println(model6.getDescricao());


        // criar uma coleção list e adicionar o objetos a ela
        List <Modelo> modeloList = new ArrayList<>();
        System.out.println("\n----------List----------");
        modeloList.add (model1);
        modeloList.add (model2);
        modeloList.add (model3);
        modeloList.add (model4);
        modeloList.add (model5);
        modeloList.add (model6);
        modeloList.add (model6); //a pricipio permitiu adicionar o mesmo duas vezes no List
        System.out.println(modeloList);

        // selecionar e imprimir o objeto de id 3 no List
        Modelo modeloFind = modeloList.stream().filter( a -> a.getId() == 3).findAny().orElse(null);
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(modeloFind);

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente List----------");
        modeloList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println(modeloList);



        // criar uma coleção Map e adicionar os objetos a ela
        //ao inves de Integer posso colocar um String, caso se faça necessario
        Map <Integer, Modelo> modeloMap = new HashMap<> ();
        System.out.println("\n----------Map----------");
        modeloMap.put(model1.getId(),model1);
        modeloMap.put(model2.getId(),model2);
        modeloMap.put(model3.getId(), model3);
        //modeloMap.put(model3.getId(), model3); mesmo adicionando não apareceu, pois não pode, por causa da função Hash
        modeloMap.put(model4.getId(), model4);
        modeloMap.put(model5.getId(), model5);
        modeloMap.put(model6.getId(), model6);
        System.out.println(modeloMap);

        // selecionar e imprimir o objeto de id 3 no Map
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(modeloMap.get(3));

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente Map----------");
        System.out.println("\n operação proibida com o Map, pois altera o que foi indexado pelo Hash");
        
	}

}


/*package controller;

import java.util.*;
import model.Modelo;

public class ModeloController {
    public static void main(String[] args) {

        //constrói duas instâncias da classe utilizando o construtor padrão
        Modelo modelo1 = new Modelo(); //utilizando o construtor padrão
        Modelo modelo2 = new Modelo();

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Modelo modelo3 = new Modelo(3, "Uno branco 4p"); //utilizando o construtor parametrizado
        Modelo modelo4 = new Modelo(4, "Uno azul 4p"); //utilizando o construtor parametrizado

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém três parâmetros, uma variação dos construtores acima
        Modelo modelo5 = new Modelo("Ka preto 4p");
        Modelo modelo6 = new Modelo("Ka branco 4p");


        //coleção do tipo List
        List<Modelo> modelosList = new ArrayList<>(); //2a
        modelosList.add(modelo1); //2d
        modelosList.add(modelo2); //2d
        modelosList.add(modelo3); //2d
        modelosList.add(modelo4); //2d
        modelosList.add(modelo5); //2d
        modelosList.add(modelo6); //2d
        System.out.println("\nColeção do tipo List\n" + modelosList); //2e

        //ordenando a coleçao do tipo List
        System.out.println();
        modelosList.sort(Comparator.comparing(Modelo::getId).reversed());
        System.out.println("\nColeção do tipo List em ordem decrescente, chave id");
        System.out.println(modelosList);

        //Pesquisa por força bruta
        for(Modelo modelo : modelosList){
            if(modelo.getId() == 3){
                System.out.print("\nResultado da pesquisa pelo Modelo de id=3");
                System.out.print(modelo);
            }
        }

        //Método utilizando Fluxos para a estrutura de dados
        System.out.println();
        System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método Fluxos para a estrutura de dados) ...");
        Modelo modeloFind = modelosList.stream().filter(c -> c.getId() == 3).findAny().orElse(null);
        System.out.println(modeloFind);

        //Método utilizando o método binarySearch da classe Collections
        System.out.println();
        System.out.print("\nLocalizando o Modelo pela chave de pesquisa (id=3) na coleção do tipo List (método binarySearch da classe Collections) ...");
        modelosList.sort(Comparator.comparing(Modelo::getId)); //ordena ascendente, conforme exigido na documentação
        modeloFind = modelosList.get(
                Collections.binarySearch(
                        modelosList,
                        modelo3,
                        Comparator.comparing(Modelo::getId)
                )
        );
        System.out.println(modeloFind);

    }

}*/