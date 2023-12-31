package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class ExercicioAltura
{
	/*Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
	  tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
	  bem como os nomes dessas pessoas caso houver
	*/
	public static void main(String[] args)
	{
		Altura();
	}
	
	public static void Altura()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas Pessoas irá Cadastrar ? ");
		int quantidadePessoas = sc.nextInt();
				
		int [] idade = new int[quantidadePessoas];
		double [] altura = new double[quantidadePessoas];
		String[] nomes = new String[quantidadePessoas];
		
		int i = 0;
		
		//Loop Para Adcionar os Dados Dentro dos Vetores
		while(i < quantidadePessoas)
		{
			System.out.println("Digite os Dados da " + (i + 1) +"° Pessoa");
			
			System.out.print("Nome: ");
			nomes[i] = sc.next();
									
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			i++;
			System.out.println("--------------------------------");
		}
		
		i = 0;
		double alturaMedia =0;
		int idadeMenorQueDizesseis = 0;
		
		//Loop para Exibir os Dados dos Vetores
		while( i < quantidadePessoas) 
		{
			if (idade[i] < 16) // Condicional Que Verifica se Idede é Menor Que 16 Anos
			{
				idadeMenorQueDizesseis ++;
			}
			System.out.println("Dados da "+ (i + 1) +"° Pessoa.");
			System.out.print("Nome: " + nomes[i] + "\n");
			System.out.print("Idade: " + idade[i] + "\n");
			System.out.print("Altura: " + altura[i] + "\n");
			alturaMedia += altura[i]; 
			System.out.println("--------------------------------");
			i++;
		}
		
		double percentual = (100 / quantidadePessoas) * idadeMenorQueDizesseis ;  
		System.out.printf("O Percentual de Pessosas com Idade Menor que 16 Anos é: %.2f%%%n", percentual );
		
		System.out.printf("A média de Altura é: %.2f", (alturaMedia / quantidadePessoas));
		sc.close();
	}

}
