package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class NumerosPares
{
	public static void main(String[] args)
	{
		/* Faça um programa que leia N números inteiros e armazene-os em um vetor.
		 * Em seguida, mostre na tela todos os números pares
		 * e também a quantidade de números pares.
		*/
		NumbersPares();
	}
	
	public static void NumbersPares()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a Quantidade de Números: ");
		int quantyty = sc.nextInt();
		
		int [] numbers = new int[quantyty];
		int [] numbersPares = new int[quantyty];
		int pares = 0 , i = 0;
		
		while(i < quantyty) //Adcioando os Dados Dentro Dos Vetores
		{
			System.out.print("Digite o " + (i + 1) + "° Número: ");
			int n = sc.nextInt();
			numbers[i] = n;
			
			if(n % 2 == 0)
			{
				numbersPares[i] = n;
				pares++;
			}
			
			i++;
		}
		
		System.out.println("Exibindo os Dados...");
		System.out.println("Vetor de Números...");
		System.out.println("---------------------------");
		
		//Exibindo Os dados Dos Vetores
		for(int v = 0; v < quantyty; v++)
		{
			System.out.println(numbers[v]);
		}
		
		System.out.println("-------------------------");
		System.out.println("Números Pares...");
		for(int v = 0; v < quantyty; v++)
		{
			if(numbersPares[v] != 0)
				System.out.println(numbersPares[v]);
		}
		
		System.out.print("O Total de Numeros Par: " + pares);
		sc.close();
	}
}
