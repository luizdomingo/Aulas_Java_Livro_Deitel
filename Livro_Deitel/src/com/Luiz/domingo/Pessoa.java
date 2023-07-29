package com.Luiz.domingo;

public abstract class Pessoa {
	
	private String name;
	private String telefone;
	private String endereco;
	
	/* Criando o metodo contrutor da class Pessoa */
	public Pessoa(String name, String telefone, String endereco)
	{
		this.name = name;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	
	
	//Metodo que ira calcular os imposto
	public abstract double calcularImposto();
	
}
