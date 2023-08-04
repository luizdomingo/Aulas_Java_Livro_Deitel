package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class MaiorValor
{
	public static void main(String[] args) 
	{
		/*Faça um programa que leia N números reais e armazene-os em um vetor.
		 Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
		 Mostrar também a posição do maior elemento,
		 considerando a primeira posição como 0 (zero).*/
		MaxValue();

	}

	public static void MaxValue()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos Números Deseja Digitar ? ");
		
		int quantytyNumbers = sc.nextInt();
		int [] values = new int[quantytyNumbers]; //Vetor onde Armaazenamos os Dados
		int maiorValor = 0, value = 0, i = 0, n = 0, posicao = 0 ;
		
		while(i < quantytyNumbers) // Loop Para Percorrer o Vetor
		{
			System.out.print("Digite o " + (i + 1) + "° Valor: ");
			int numbers = sc.nextInt();
			values[i] = numbers;		
			i++;
		}
		
		i = 0;
		
		while(i < quantytyNumbers)
		{
			value = values[i];
			
			while( n < quantytyNumbers)
			{
				if(value < values[n])
				{
					maiorValor = values[n];
					posicao = n;
				}
				n ++;
			}
			i++;
			n = 0;
		}
		
		System.out.println("O maior Valor Digitado Foi: " + maiorValor);
		System.out.println("A Posição Do Maior Valor é: " + posicao);
		sc.close();
	}
}
