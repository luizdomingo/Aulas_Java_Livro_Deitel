package com.Luiz.domingo;

public class Main
{

	public static void main(String[] args)
	{
		Pessoa p = new PessoaFisica("056.986.896-52", 30.000, "Luiz domingo.Java", "087-99865.5689", "Rua Tal");
		System.out.println(p.Info());
	}

}
