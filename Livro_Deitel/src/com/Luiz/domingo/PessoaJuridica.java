package com.Luiz.domingo;

public class PessoaJuridica extends Pessoa // Esta class Representa uma pessoa juridica
{
	/* Atributos da class PessoaJuridica */
	String cnpj;
	double faturamento;
	
	/*Criando o construtor da class*/
	public PessoaJuridica(String nome, String endereco, String telefone, String cnpj, double faturamento)
	{
		super(nome, endereco, telefone);
		this.cnpj = cnpj;
		this.faturamento = faturamento;
	}
	
	/* Metodos Getters e Setters da class PessoaJuridica */
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public double getFaturamento() {
		return faturamento;
	}
	
	public void setFaturamento(double faturamento) {
		this.faturamento = faturamento;
	}
	
	/* Implementando os metodos calcularImposto() e Info() */
	@Override
	public double calcularImposto()
	{
		return this.faturamento * 0.10;
	}
	
	@Override
	public String Info()
	{
		return  "Nome: " + this.getName() + "\n"
			  + "Endereco: " + this.getEndereco() +"\n"
			  + "Telefone: " + this.getTelefone() + "\n"
			  + "CNPJ: "  + this.getCnpj() +"\n"
			  + "Faturamento: " + this.faturamento + "\n"
			  + "Imposto: R$" + this.calcularImposto();
	}
	
}//Fim Class
