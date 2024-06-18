package controller;

import java.util.*;

import model.Automovel;


public class AutomovelController {
    public static void main (String[] args) {

        // constroi instancias de classe utilizando o construtor padrão
        Automovel auto1 = new Automovel();
        Automovel auto2 = new Automovel();
        Automovel auto3 = new Automovel();

        // constroi duas instancias de classe utilizando o construtor parametrizado
        Automovel auto4 = new Automovel(4, "36", "TSS-3636", "vermelho", 4, "gasolina", 3000, "chassi-TSS36", 36);
        Automovel auto5 = new Automovel(5, "51", "YLC-5151", "preto", 4, "gasolina", 5000, "chassi-YLC51", 51);
        Automovel auto6 = new Automovel(6, "88", "TYC-5136", "branco", 4, "gasolina", 8000, "chassi-TYC5136", 88);

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        System.out.println(auto4);
        System.out.println(auto5);
        System.out.println(auto6);

        //alterando os objetos utilizando setters
        auto1.setId(1);
        auto1.setRenavan("28");
        auto1.setPlaca("ICJ-2014");
        auto1.setCor("vermelho");
        auto1.setNumRodas(4);
        auto1.setCombustivel("gasolina");
        auto1.setQuilometragem(2000);
        auto1.setChassi("Chassi-ICJ20");
        auto1.setValorLocacao(28);

        auto2.setId(2);
        auto2.setRenavan("38");
        auto2.setPlaca("IHQ-2328");
        auto2.setCor("verde");
        auto2.setNumRodas(4);
        auto2.setCombustivel("gasolina");
        auto2.setQuilometragem(3800);
        auto2.setChassi("Chassi-IHQ28");
        auto2.setValorLocacao(38);

        auto3.setId(3);
        auto3.setRenavan("68");
        auto3.setPlaca("ICS-6837");
        auto3.setCor("azul");
        auto3.setNumRodas(4);
        auto3.setCombustivel("gasolina");
        auto3.setQuilometragem(6000);
        auto3.setChassi("Chassi-ICS68");
        auto3.setValorLocacao(68);

        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(auto1.getId());
        System.out.println(auto1.getRenavan());
        System.out.println(auto1.getPlaca());
        System.out.println(auto1.getCor());
        System.out.println(auto1.getNumRodas());
        System.out.println(auto1.getCombustivel());
        System.out.println(auto1.getQuilometragem());
        System.out.println(auto1.getChassi());
        System.out.println(auto1.getValorLocacao());

        System.out.println();
        System.out.println(auto2.getId());
        System.out.println(auto2.getRenavan());
        System.out.println(auto2.getPlaca());
        System.out.println(auto2.getCor());
        System.out.println(auto2.getNumRodas());
        System.out.println(auto2.getCombustivel());
        System.out.println(auto2.getQuilometragem());
        System.out.println(auto2.getChassi());
        System.out.println(auto2.getValorLocacao());

        System.out.println();
        System.out.println(auto3.getId());
        System.out.println(auto3.getRenavan());
        System.out.println(auto3.getPlaca());
        System.out.println(auto3.getCor());
        System.out.println(auto3.getNumRodas());
        System.out.println(auto3.getCombustivel());
        System.out.println(auto3.getQuilometragem());
        System.out.println(auto3.getChassi());
        System.out.println(auto3.getValorLocacao());

        System.out.println();
        System.out.println(auto4.getId());
        System.out.println(auto4.getRenavan());
        System.out.println(auto4.getPlaca());
        System.out.println(auto4.getCor());
        System.out.println(auto4.getNumRodas());
        System.out.println(auto4.getCombustivel());
        System.out.println(auto4.getQuilometragem());
        System.out.println(auto4.getChassi());
        System.out.println(auto4.getValorLocacao());

        System.out.println();
        System.out.println(auto5.getId());
        System.out.println(auto5.getRenavan());
        System.out.println(auto5.getPlaca());
        System.out.println(auto5.getCor());
        System.out.println(auto5.getNumRodas());
        System.out.println(auto5.getCombustivel());
        System.out.println(auto5.getQuilometragem());
        System.out.println(auto5.getChassi());
        System.out.println(auto5.getValorLocacao());

        System.out.println();
        System.out.println(auto6.getId());
        System.out.println(auto6.getRenavan());
        System.out.println(auto6.getPlaca());
        System.out.println(auto6.getCor());
        System.out.println(auto6.getNumRodas());
        System.out.println(auto6.getCombustivel());
        System.out.println(auto6.getQuilometragem());
        System.out.println(auto6.getChassi());
        System.out.println(auto6.getValorLocacao());


        // criar uma coleção list e adicionar o objetos a ela
        List <Automovel> automovelList = new ArrayList<>();
        System.out.println("\n----------List----------");
        automovelList.add (auto1);
        automovelList.add (auto2);
        automovelList.add (auto3);
        automovelList.add (auto4);
        automovelList.add (auto5);
        automovelList.add (auto6);
        automovelList.add (auto6); //a pricipio permitiu adicionar o mesmo duas vezes no List
        System.out.println(automovelList);

        // selecionar e imprimir o objeto de id 3 no List
        Automovel automovelFind = automovelList.stream().filter( a -> a.getId() == 3).findAny().orElse(null);
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(automovelFind);

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente List----------");
        automovelList.sort(Comparator.comparing(Automovel::getId).reversed());
        System.out.println(automovelList);



        // criar uma coleção Map e adicionar os objetos a ela
        //ao inves de Integer posso colocar um String, caso se faça necessario
        Map <Integer, Automovel> automovelMap = new HashMap<> ();
        System.out.println("\n----------Map----------");
        automovelMap.put(auto1.getId(),auto1);
        automovelMap.put(auto2.getId(),auto2);
        automovelMap.put(auto3.getId(), auto3);
        //automovelMap.put(auto3.getId(), auto3); mesmo adicionando não apareceu, pois não pode, por causa da função Hash
        automovelMap.put(auto4.getId(), auto4);
        automovelMap.put(auto5.getId(), auto5);
        automovelMap.put(auto6.getId(), auto6);
        System.out.println(automovelMap);

        // selecionar e imprimir o objeto de id 3 no Map
        System.out.println("\n----------Objeto com Id = 3----------");
        System.out.println(automovelMap.get(3));

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente Map----------");
        System.out.println("\n operação proibida com o Map, pois altera o que foi indexado pelo Hash");
        
	}

}








