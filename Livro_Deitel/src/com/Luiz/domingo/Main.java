package com.Luiz.domingo;

import java.util.ArrayList;
import java.util.List;

public class Main
{

	public static void main(String[] args)
	{
		//Criando uma lista para adcionar as pessoas
		List<Pessoa> pessoas = new ArrayList<>();
		
		Pessoa p = new PessoaFisica("056.986.896-52", 30.000, "Luiz domingo.Java", "087-99865.5689", "Rua Tal");
		Pessoa p_new = new PessoaJuridica("Luiz Madeirinha", "Rua Xvideos", "084 9 99307493","012-5689.6589.214", 50.000);
		pessoas.add(p);
		pessoas.add(p_new);	
		
		for (Pessoa pe : pessoas)
		{
			System.out.println("----------------------");
			System.out.println(pe.Info());
		}
	}

}
