//package controller;

import java.util.*;


//import model.Produto;

public class ProdutoController
{

  public static void main (String[]args)
  {

	//cada produto simula um registro em um banco de dados
	Produto produto1 = new Produto ("Arroz", 18.50, 100);	//produto1 C) uma intC"ncia da classe Produto (ou simplemente, um objeto)
	Produto produto2 = new Produto ("Feijao", 8.30, 100);
	Produto produto3 = new Produto ("CafC))", 13.10, 100);
	Produto produto4 = new Produto ("Acucar", 2.20, 100);
	Produto produto5 = new Produto ("Batata", 2.50, 60);

	//criando a coleC'C#o e add objetos na coleC'C#o
	  List < Produto > produtos = new ArrayList < Produto > ();
	  produtos.add (produto1);
	  produtos.add (produto2);
	  produtos.add (produto3);
	  produtos.add (produto4);
	  produtos.add (produto5);
	  System.out.println ("--------- Lista Orinal ---------");
	  System.out.println (produtos);

	//ordena a colecao pelo atributo nome do produto
	  produtos.sort (Comparator.comparing (Produto::getNome));
	  System.out.println ("--------- Lista Ordenada ---------");
	  System.out.println (produtos);

	//pesquisa por forC'a bruta
	  System.out.println ();
	  System.out.print
	  ("Localizando o produto pelo nome AC'ucar (pela chave, usando forC'a bruta) ...");
	  produtos.forEach (p->
						{
						if (p.getNome ().equals ("Acucar"))
						{
						System.out.println (p);}
						//System.out.println(p);
						}
	);

	//pesquisando na coleC'C#o pelo metodo filter
	System.out.println ();
	System.out.print
	  ("Localizando o produto pelo nome AC'ucar (pela chave, usando o filter) ...");
	Produto produtoFind =
	  produtos.stream ().filter (p->p.getNome ().
								 equals ("Acucar")).findAny ().orElse (null);
	System.out.println (produtoFind);

  }

}
