
package controller;

import java.util.*;

import model.Aluno;


public class AlunoController {
    public static void main (String[] args) {

        /*    private int id;
    private int cpf;
    private String nome;
    private String sobrenome;
    private String email; */

        // constroi instancias de classe utilizando o construtor padrão
        Aluno alun1 = new Aluno();
        Aluno alun2 = new Aluno();

                // constroi duas instancias de classe utilizando o construtor parametrizado com dois parametors
        Aluno alun3 = new Aluno(3, 5151);
        Aluno alun4 = new Aluno(4, 3636);


        // constroi duas instancias de classe utilizando o construtor parametrizado com todos os parametros
        Aluno alun5 = new Aluno(5, 0606, "Rebecca", "Frances", "Becca@gamil.com");
        Aluno alun6 = new Aluno(6, 8888, "Elizabeth", "Gillies", "Liz@gmail.com");

        // Imprime cada objeto com o metodo toString
        System.out.println("Imprimir objetos criados com ambos contrutors, padrão e parametrizado");
        System.out.println(alun1);
        System.out.println(alun2);
        System.out.println(alun3);
        System.out.println(alun4);
        System.out.println(alun5);
        System.out.println(alun6);

        //alterando os objetos utilizando setters
        alun1.setId(1);
        alun1.setCpf(2828);
        alun1.setNome("Ravenna");
        alun1.setSobrenome("Bright");
        alun1.setEmail("Ravenna@gmail.com");

        alun2.setId(2);
        alun2.setCpf(3838);
        alun2.setNome("Dove");
        alun2.setSobrenome("Cameron");
        alun2.setEmail("Dove@gmail.com");


        // Imprimindo os mesmos utilizando os getters
        System.out.println();
        System.out.println(alun1.getId());
        System.out.println(alun1.getCpf());
        System.out.println(alun1.getNome());
        System.out.println(alun1.getSobrenome());
        System.out.println(alun1.getEmail());

        System.out.println();
        System.out.println(alun2.getId());
        System.out.println(alun2.getCpf());
        System.out.println(alun2.getNome());
        System.out.println(alun2.getSobrenome());
        System.out.println(alun2.getEmail());

        /*
        System.out.println();
        System.out.println(alun3.getId());
        System.out.println(alun3.getCpf());
        System.out.println(alun3.getNome());
        System.out.println(alun3.getSobrenome());
        System.out.println(alun3.getEmail());

        System.out.println();
        System.out.println(alun4.getId());
        System.out.println(alun4.getCpf());
        System.out.println(alun4.getNome());
        System.out.println(alun4.getSobrenome());
        System.out.println(alun4.getEmail());

        System.out.println();
        System.out.println(alun5.getId());
        System.out.println(alun5.getCpf());
        System.out.println(alun5.getNome());
        System.out.println(alun5.getSobrenome());
        System.out.println(alun5.getEmail());

        System.out.println();
        System.out.println(alun6.getId());
        System.out.println(alun6.getCpf());
        System.out.println(alun6.getNome());
        System.out.println(alun6.getSobrenome());
        System.out.println(alun6.getEmail());
*/


        // criar uma coleção list e adicionar o objetos a ela
        List <Aluno> alunoList = new ArrayList<>();
        System.out.println("\n----------List----------");
        alunoList.add (alun1);
        alunoList.add (alun2);
        alunoList.add (alun3);
        alunoList.add (alun4);
        alunoList.add (alun5);
        alunoList.add (alun6);
        System.out.println(alunoList);

        // selecionar e imprimir o objeto de id 3 no List
        Aluno alunoFind = alunoList.stream().filter( a -> a.getId() == 5).findAny().orElse(null);
        System.out.println("\n----------Objeto com Id = 5----------");
        System.out.println(alunoFind);

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente List----------");
        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println(alunoList);



        // criar uma coleção Map e adicionar os objetos a ela
        //ao inves de Integer posso colocar um String, caso se faça necessario
        Map <Integer, Aluno> alunoMap = new HashMap<> ();
        System.out.println("\n----------Map----------");
        alunoMap.put(alun1.getId(),alun1);
        alunoMap.put(alun2.getId(),alun2);
        alunoMap.put(alun3.getId(), alun3);
        alunoMap.put(alun4.getId(), alun4);
        alunoMap.put(alun5.getId(), alun5);
        alunoMap.put(alun6.getId(), alun6);
        System.out.println(alunoMap);

        // selecionar e imprimir o objeto de id 5 no Map
        System.out.println("\n----------Objeto com Id = 5----------");
        System.out.println(alunoMap.get(5));

        // inverter para ordem decrescente com base no id e imprimir
        System.out.println("\n----------Ordem decrescente Map----------");
        System.out.println("\n operação proibida com o Map, pois altera o que foi indexado pelo Hash");

    }

}










/*package controller;

import java.util.*;

import model.Aluno;

public class AlunoController {
    public static void main(String[] args){
        //constrói duas instâncias da classe utilizando o construtor padrão
        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém todos os atributos como parâmetro
        Aluno aluno3 = new Aluno(3, 123445661,"Chris", "Cornell", "email@mail.com");
        Aluno aluno4 = new Aluno(4, 432765189,"Luna", "Lovegood","email@mail.com");

        //constrói duas instâncias da classe utilizando o construtor parametrizado que contém dois parâmetros, uma variação dos construtores acima
        Aluno aluno5 = new Aluno(5, 734754156);
        Aluno aluno6 = new Aluno(6, 32567335);

        System.out.println(aluno1);
        System.out.println(aluno2);

        System.out.println(aluno3);
        System.out.println(aluno4);

        System.out.println(aluno5);
        System.out.println(aluno6);

        aluno1.setId(1);
        aluno1.setCpf(111111111);
        aluno1.setNome("Anya");
        aluno1.setSobrenome("Taylor-Joy");
        aluno1.setEmail("email@dominio.com");

        aluno2.setId(2);
        aluno2.setCpf(111111111);
        aluno2.setNome("James");
        aluno2.setSobrenome("McAvoy");
        aluno2.setEmail("email@dominio.com");

        System.out.println(aluno1.getId());
        System.out.println(aluno1.getCpf());
        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getSobrenome());
        System.out.println(aluno1.getEmail());

        System.out.println(aluno2.getId());
        System.out.println(aluno2.getCpf());
        System.out.println(aluno2.getNome());
        System.out.println(aluno2.getSobrenome());
        System.out.println(aluno2.getEmail());

        //manipulando coleções: com List
        List<Aluno> alunoList = new ArrayList<>();
        alunoList.add(aluno1);
        alunoList.add(aluno2);
        alunoList.add(aluno3);
        alunoList.add(aluno4);
        alunoList.add(aluno5);
        alunoList.add(aluno6);
        System.out.println("\nColecao tipo List\n" + alunoList);

        //manipulando coleções: ordenando a coleçao do tipo List crescente
        System.out.println();
        alunoList.sort(Comparator.comparing(Aluno::getId));
        System.out.println("\n coleção list, por chave id crescente");
        System.out.println(alunoList);

        //manipulando coleções: pesquisa por força bruta, pelo id 5
        for(Aluno aluno : alunoList){
            if(aluno.getId() == 5){
                System.out.println();
                System.out.println("pesquisa por id=5");
                System.out.println(aluno);
            }
        }

        //manipulando coleções: ordenando a coleçao do tipo List decrescente
        System.out.println();
        alunoList.sort(Comparator.comparing(Aluno::getId).reversed());
        System.out.println("\n coleção list, por chave id decrescente");
        System.out.println(alunoList);


    }
}*/
