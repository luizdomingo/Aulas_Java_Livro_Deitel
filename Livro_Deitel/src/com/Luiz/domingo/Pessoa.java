package com.Luiz.domingo;

public abstract class Pessoa {

	private String name;
	private String telefone;
	private String endereco;

	/* Criando o metodo contrutor da class Pessoa */
	public Pessoa(String name, String telefone, String endereco) {
		this.name = name;
		this.telefone = telefone;
		this.endereco = endereco;
	}

	/* Metodos Getters e Setters */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTelefone() {
		return this.telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	public abstract double calcularImposto();// Metodo que ira calcular os imposto
	
	public abstract String Info(); // Metodo que exibira as informacoes 

}
