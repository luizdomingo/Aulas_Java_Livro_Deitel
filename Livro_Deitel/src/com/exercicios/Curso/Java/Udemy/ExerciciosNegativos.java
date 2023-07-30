package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class ExerciciosNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos números você vai digitar ? ");
		int quantidadeNumeros = sc.nextInt();
		
		int[] numbers = new int[quantidadeNumeros];
		
		//Loop para adiconar os dados dentro do vetor
		for(int i = 0; i < quantidadeNumeros; i++)
		{
			System.out.print("Digite o número: ");
			numbers[i] = sc.nextInt();
		}
		
		System.out.println("----------------------------------");
		
		//Loop para mostrar os dados do Array
		for(int i = 0; i < numbers.length; i++)
		{
			System.out.println(numbers[i]);
		}
		
		System.out.println("----------------------------------");
		
		//Loop Para mostrar os Números Negativos
		for(int i = 0; i < numbers.length; i++)
		{
			if(numbers[i] < 0)
			{
				System.out.println(i + 1 + "° Número negativo: " + numbers[i]);
			}
		}
		
		//Fechando o Scanner
		sc.close();
	}

}
