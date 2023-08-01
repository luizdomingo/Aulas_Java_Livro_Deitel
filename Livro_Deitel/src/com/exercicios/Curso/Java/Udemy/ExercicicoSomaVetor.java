package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class ExercicicoSomaVetor
{
	/*Faça um programa que leia N números reais e armazene-os em um vetor.
	  Em seguida:
	- Imprimir todos os elementos do vetor
	- Mostrar na tela a soma e a média dos elementos do vetor */
	public static void main(String[] args){
		SomarVetor();
	}
	
	public static void SomarVetor(){
		
		Scanner sc = new Scanner(System.in);
		double soma = 0, media = 0;
		int numero = 0;
		
		System.out.print("Quantos Números você vai Digitar ? ");
		int quantidadeNumeros = sc.nextInt();
		
		System.out.println("----------------------------------");
		
		int[] somaNumbers = new int[quantidadeNumeros];
			
		while( numero < quantidadeNumeros)
		{
			System.out.print("Digite Um Número: "); 
			somaNumbers[numero] = sc.nextInt();
			soma += somaNumbers[numero];
			numero++;
		}
		
		System.out.println("----------------------------------");
		
		numero = 0;
		
		while(numero < quantidadeNumeros) 
		{
			System.out.println(somaNumbers[numero]);
			numero++;
		}
		
		media = soma / quantidadeNumeros;
		System.out.println("------------------------------------");
		System.out.print("A soma é: " + soma + "\n");
		System.out.printf("A média é: %.2f \n",  media);
		System.out.printf("A raiz quadrada da média é: %.2f", Math.sqrt(media));
		sc.close();
	}//Fim Metodo SomarVetor
}//Fim Class