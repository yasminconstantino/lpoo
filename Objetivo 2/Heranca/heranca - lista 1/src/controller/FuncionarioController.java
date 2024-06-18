package controller;

import java.util.*;

import model.*;

public class FuncionarioController {
    public static void main(String[] args){
    //criar objetos
        Desenvolvedor d1 = new Desenvolvedor();
        Desenvolvedor d2 = new Desenvolvedor("Crowley", 4000);

        //criar objetos
        Gerente g1 = new Gerente();
        Gerente g2 = new Gerente("Castiel", 6000);

        //exibir os objetos
        System.out.println("Funcionarios");
        System.out.println(d1 + "" + d2 + "" + g1 + "" + g2);

        // modificar seus estados
        d1.setNome("Dean");
        d1.setSalario(1000.00);
        g1.setNome("Sam");
        g1.setSalario(2000.00);

        //exibir depois de alterar
        System.out.println("Funcionarios");
        System.out.println(d1 + "" + d2 + "" + g1 + "" + g2);

        // verificar os bonus dos funcionarios
        System.out.println("Bonus dos Funcionarios");
        System.out.println(d1.getBonus());
        System.out.println(d2.getBonus());
        System.out.println(g1.getBonus());
        System.out.println(g2.getBonus());

        /*Respostas das questões:
        1.1 - Não podemos criar instancias da clase funcionario, pois ela é abstrata
        1.2 - Devem ser inseridas na classe modelo Gerente e Desenvolvedor, onde o dominio do problema sera modelado.
        NO controller deve ser evitado colocr as regras de negocio do dominio do problema.
         */

        /*


Calcule e imprima qual é a folha salarial dessa empresa, com e sem bônus, e imprima.

Calcule e imprima o valor do bônus e o salario bruto de cada um dos funcionários
dessa empresa.

Calcule e imprima a nova folha salarial dessa empresa, caso todos os funcionários,
independente de cargo, tenham um reajuste salarial de 5%.*/

        // criar 2 gerentes
        Gerente ger1 = new GerenteGeral("Elena", 6500);
        Gerente ger2 = new GerenteDesenvolvimento("Pippa", 4500);

        // criar 6 dev senior
        Desenvolvedor dev1 = new DesenvolvedorSenior("Thomas", 3500);
        Desenvolvedor dev2 = new DesenvolvedorSenior("Natasha", 3500);
        Desenvolvedor dev3 = new DesenvolvedorSenior("Dan", 3500);
        Desenvolvedor dev4 = new DesenvolvedorSenior("Jack", 3500);
        Desenvolvedor dev5 = new DesenvolvedorSenior("Sebastian", 3500);
        Desenvolvedor dev6 = new DesenvolvedorSenior("Bob", 3500);

        //criar 6 dev Pleno
        Desenvolvedor dev7 = new DesenvolvedorPleno("Lisa", 2500);
        Desenvolvedor dev8 = new DesenvolvedorPleno("Jennie", 2500);
        Desenvolvedor dev9 = new DesenvolvedorPleno("Olivia", 2500);
        Desenvolvedor dev10 = new DesenvolvedorPleno("Kurt", 2500);
        Desenvolvedor dev11 = new DesenvolvedorPleno("Chris", 2500);
        Desenvolvedor dev12 = new DesenvolvedorPleno("Axl", 2500);

        // criar 6 dev Junior
        Desenvolvedor dev13 = new DesenvolvedorJunior("Eddie", 1800);
        Desenvolvedor dev14 = new DesenvolvedorJunior("Lexie", 1800);
        Desenvolvedor dev15 = new DesenvolvedorJunior("Katheryn", 1800);
        Desenvolvedor dev16 = new DesenvolvedorJunior("Dove", 1800);
        Desenvolvedor dev17 = new DesenvolvedorJunior("Damian", 1800);
        Desenvolvedor dev18 = new DesenvolvedorJunior("Cameron", 1800);


        List <Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(ger1);
        funcionarios.add(ger2);
        funcionarios.add(dev1);
        funcionarios.add(dev2);
        funcionarios.add(dev3);
        funcionarios.add(dev4);
        funcionarios.add(dev5);
        funcionarios.add(dev6);
        funcionarios.add(dev7);
        funcionarios.add(dev8);
        funcionarios.add(dev9);
        funcionarios.add(dev10);
        funcionarios.add(dev11);
        funcionarios.add(dev12);
        funcionarios.add(dev13);
        funcionarios.add(dev14);
        funcionarios.add(dev15);
        funcionarios.add(dev16);
        funcionarios.add(dev17);
        funcionarios.add(dev18);
        System.out.println("Funcionarios da empresa" + funcionarios);


        //cáculo da folha salarial com bônus
        /*
        double total_folha_com_bonus = 0.0;
        for (Funcionario funcionario : funcionarios) {
            total_folha_com_bonus += funcionario.getSalario() + funcionario.getBonus();
        }
        System.out.println("\n\n******* Total da Folha COM Bônus *******");
        System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
        System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
        System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
        System.out.println(
                NumberFormat.getCurrencyInstance().format(
                        funcionarios.stream()
                                .mapToDouble(f -> f.getSalario() + f.getBonus())
                                .sum()));


		//cáculo da folha salarial sem bônus
		double total_folha_sem_bonus = 0.0;
		for (Funcionario funcionario : funcionarios) {
			total_folha_sem_bonus += funcionario.getSalario();
		}
		System.out.println("\n\n******* Total da Folha SEM Bônus *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_sem_bonus));
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(NumberFormat.getCurrencyInstance().format(
			funcionarios.stream()
				.mapToDouble(f -> f.getSalario())
				.sum()));


		//cáculo do valor do bônus e do salário bruto de cada funcionário
		System.out.print("\n\n******* Salário bruto, bônus e salário de cada funcionário *******");
		funcionarios.forEach(f -> {
			double salarioBruto = f.getSalario() + f.getBonus();
			System.out.println("\nFuncionário: " + f.getNome());
			System.out.println("Cargo: " + f.getClass().getSimpleName());
			System.out.println("Salário= " + NumberFormat.getCurrencyInstance().format(f.getSalario()));
			System.out.println("Bônus= " + NumberFormat.getCurrencyInstance().format(f.getBonus()));
			System.out.println("Salário bruto= " + NumberFormat.getCurrencyInstance().format(salarioBruto));

		});


		//cálculo do salário com o reajuste de 5%
		total_folha_com_bonus = 0.0;
		for(Funcionario f : funcionarios){
			f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
			total_folha_com_bonus += f.getSalario() + f.getBonus();
		}
		System.out.println("\n\n******* Total da Nova Folha COM Reajuste *******");
		System.out.println("Cálculo com acumulador e forEach (Programação imperativa)");
		System.out.println(NumberFormat.getCurrencyInstance().format(total_folha_com_bonus));
		System.out.println("Cálculo com programação funcional (Streams do Projeto Lambda do Java)");
		System.out.println(
			NumberFormat.getCurrencyInstance().format(
				funcionarios.stream()
					.mapToDouble(f -> {
						f.setSalario(f.getSalario() + (f.getSalario() * 0.05));
						return f.getSalario() + f.getBonus();
					}).sum()
			)
		);

*/
    }
}
