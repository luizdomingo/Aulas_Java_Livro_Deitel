package com.exercicios.Curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author luiz-
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas.
 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo,
 * a média de altura das mulheres, e o número de homens.
 */
public class DadosPessoais 
{
    public static void main(String[] args)
    {
        DadosPerson();
    }
    
    static void DadosPerson()
    {
    	Locale.setDefault(Locale.US);
    	Scanner sc = new Scanner(System.in);
    	
    	System.out.print("Quantas Pessoas Irá Cadastrar? ");
    	int quantidade = sc.nextInt();
        System.out.println("-------------------------------");
        
        double maiorAltura = 0, mediaAlturaMulheres = 0, menorAltura = 0;
        int contador = 0, quantidadeHomens = 0, quantidadeMulheres = 0;
        
    	double [] altura = new double[quantidade];
        char [] genero = new char[quantidade];
        
        while(contador < quantidade)
        {
        	System.out.print("Digite a Altura da " + (contador + 1) + "° Pessoa: ");
        	altura[contador] = sc.nextDouble();
        	
        	System.out.print("Digite o gênero da "  + (contador + 1) + "° Pessoa: ");
        	genero[contador] = sc.next().charAt(0);
        	System.out.println("");
        	contador++;
        }
        
        sc.close();
        
        System.out.println("-------------------------------");
        System.out.println("");
        
        for(contador = 0; contador < quantidade; contador++)
        {	
        	if(altura[contador] > maiorAltura)
        	{
        		maiorAltura = altura[contador];
        	}
        	
        	if(genero[contador] == 'M')
        	{
        		quantidadeHomens ++;
        	}
        	else
        	{
        		mediaAlturaMulheres += altura[contador];
        		quantidadeMulheres ++;
        	}
        }
        
        contador = 0;
        
        while(contador < quantidade)
        {
        	menorAltura = altura[contador];
        	for(int cont = 0; cont < quantidade; cont++)
        	{
        		if(altura[cont] < menorAltura)
        		{
        			menorAltura = altura[cont];
        		}
        	}
        	contador ++;
        }
        
        System.out.println("Exibindo os Dados....");
        System.out.printf("A Maior Altura Do Grupo é: %.2f%n", maiorAltura);
        System.out.printf("A Menor Altura Do Grupo é: %.2f%n", menorAltura);
        System.out.println("A Quantidade de Homes no Grupo é De: "  + quantidadeHomens);
        System.out.printf("A Média Das Altura das Mulheres é: %.2f%n", mediaAlturaMulheres / quantidadeMulheres);
        System.out.println("Fim....");
        
    }
}
