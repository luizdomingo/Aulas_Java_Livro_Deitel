package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class SomarVetor {

	public static void main(String[] args) 
	{
		/* Faça um programa para ler dois vetores A e B, contendo N elementos cada.
		 * Em seguida, gere um terceiro vetor C onde cada elemento de C 
		 * é a soma dos elementos correspondentes de A e B.
		 * Imprima o vetor C gerado.
		 */

		SomaEntreVetores();
	}
	
	public static void SomaEntreVetores()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite a Quantidade De Valores De Cada Vetor: ");
		int quantyty = sc.nextInt();
		
		int [] vetorA = new int [quantyty]; 
		int [] vetorB = new int [quantyty];
		int [] vetorC = new int [quantyty];
		
		int contador = 0, soma = 0;
		
		while(contador < quantyty)
		{
			System.out.print("Digite o " + (contador + 1) + "° Valor Para O Vetor A: ");
			vetorA[contador] = sc.nextInt();
			System.out.println("------------------------------");
			
			System.out.print("Digite o " + (contador + 1) + "° Valor Para O Vetor B: ");
			vetorB[contador] = sc.nextInt();
			vetorC[contador] = (vetorA[contador] + vetorB[contador]);
			
			contador++;
			System.out.println("------------------------------");
		}
		sc.close();
		
		System.out.println("As Soma Entre Os Vetores A e B é:");
		contador = 0;
		
		for(soma = 0; soma < quantyty; soma++)
		{
			System.out.println(vetorC[soma]);
		}
		
	}
	
}
