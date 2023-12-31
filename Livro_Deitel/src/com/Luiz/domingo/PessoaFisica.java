package com.Luiz.domingo;

public class PessoaFisica extends Pessoa // Uma subclasse de Pessoa que representa uma pessoa Fisica
{
	/* Atributos Da class Pessoa Fisica */
	private String cpf;
	private double renda;

	/* Construtor da class pessoa fisica */
	public PessoaFisica(String cpf, double renda, String name, String telefone, String endereco) {
		super(name, telefone, endereco); // Chamada ao construtor da super calss Pessoa
		this.cpf = cpf;
		this.renda = renda;
	}

	/* Metodos Getters e setters */

	public String getCpf() {
		return this.cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getRenda() {
		return this.renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	/* Metod para calcular o imposto de renda da pessoa fisica */
	@Override
	public double calcularImposto()
	{

		if (renda <= 20000)
		{
			return 0; // renda menor que 20.000 não ha imposto a ser cobrado
		}
		else if (renda <= 40000)
		{
			return renda * 0.15; // se a renda for maior que 20.000 ou menor que 40.000 imposto de 15%
		} 
		else
		{
			return renda * 0.25; // se a renda for maior que 40.000 o imposto é de 25%
		}
	}

	@Override
	public String Info()
	{
		return "Nome " + this.getName() + "\n"
			   + "CPF " + this.cpf + "\n"
			   + "Endereco " + this.getEndereco() + "\n"
			   + "Telefone " + this.getTelefone() + "\n"
			   + "Renda de: " + renda + "\n"
			   + "imposto: R$" + this.calcularImposto();
	}
}
