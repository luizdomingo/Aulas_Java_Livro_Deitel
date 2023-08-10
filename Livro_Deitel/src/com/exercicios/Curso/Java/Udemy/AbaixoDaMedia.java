package com.exercicios.Curso.Java.Udemy;

import java.util.Scanner;

public class AbaixoDaMedia {

	public static void main(String[] args) {
		/* Problema "abaixo_da_media"
		Fazer um programa para ler um número inteiro N e depois um vetor de N números reais.
		Em seguida mostrar na tela a média aritmética de todos elementos com três casas decimais.
		Depois mostrar todos os elementos do vetor que estejam abaixo da média, com uma casa decimal cada.
		*/
		AbaixoMedia();
	}

	public static void AbaixoMedia()
	{
		Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos Elementos Vai Ter o Vetor ? ");
        int quantyty = sc.nextInt();
        int [] vetor =  new int[quantyty];
        int contador = 0, soma = 0;
        double media = 0, abaixoMedia = 0 ;
        
        System.out.println("-------------------------------\n");
        
        while(contador < quantyty )
        {
            System.out.print("Digite o " + (contador + 1) + "° Número: ");
            int valor = sc.nextInt();
            vetor [contador] = valor ;
            contador++;
        }
        
        //Loop Para Realizar o Calculo da Média 
        for(contador = 0; contador < quantyty; contador ++)
        {
            soma += vetor[contador];
        }
        
        media = soma / quantyty;
        System.out.println("-------------------------------\n");
        
        System.out.println("A Soma dos Números no Vetor é: " + soma);
        System.out.printf("A Média dos Números no Vetor é %.3f%n", media );
        
        //Loop Para Verificar Quais Números Estão Abaixo da Média
        System.out.println("Elementos Abaixo da Média..");

        for(contador = 0; contador < quantyty; contador++)
        {
            if(vetor[contador] < media)
            {
                System.out.println(vetor[contador]);
            }
        }
        sc.close();
	}
}
