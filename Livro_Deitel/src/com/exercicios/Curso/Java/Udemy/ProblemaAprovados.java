package com.exercicios.Curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author luiz-
 * Fazer um programa para ler um conjunto de N nomes de alunos,
 * bem como as notas que eles tiraram no 1º e 2º semestres. 
 * Cada uma dessas informações deve ser armazenada em um vetor.
 * Depois, imprimir os nomes dos alunos aprovados. 
 * considerando aprovados aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 */
public class ProblemaAprovados 
{
    public static void main(String[] args)
    {
        Aprovados();
    }
    
    static void Aprovados()
    {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.println("Digite Nome, Primeira e Segunda Nota Do Aluno. ");
        System.out.print("Quantos Alunos Serão Cadastrados ? ");
        int quantidadeAlunos = sc.nextInt();
        
        double [] notasPrimeiroSemestre = new double[quantidadeAlunos];
        double [] notasSegundoSemestre = new double[quantidadeAlunos];
        String nomes [] = new String [quantidadeAlunos];
        
        int contador = 0;
        double media = 0, soma = 0;
        
        System.out.println("--------------------------------");
        
        while( contador < quantidadeAlunos)
        {
            System.out.print("Digite o Nome Do " + (contador + 1) + "° Aluno: ");
            sc.nextLine();
            String nome = sc.nextLine();
            
            System.out.print("Digite a Nota Do 1° Semestre: ");
            double primeiroSemestre = sc.nextDouble();
            
            System.out.print("Digite a Nota Do 2° Semestre: ");
            double segundoSemestre = sc.nextDouble();
            System.out.println("");
            
            nomes[contador] = nome;
            notasPrimeiroSemestre[contador] = primeiroSemestre;
            notasSegundoSemestre[contador] = segundoSemestre;
            contador++;
            
            System.out.println("--------------------------------");
            System.out.println("");
        }
        sc.close();
        
        System.out.println("Alunos Aprovados....");
        System.out.println("");
        
        for(contador = 0; contador < quantidadeAlunos; contador++) 
        {
        	soma =+ (notasPrimeiroSemestre[contador] + notasSegundoSemestre[contador]);
        	media = soma / 2;
        	
        	if(media >= 6)
        	{
        		System.out.println(nomes[contador]);
        	}
        }
        
        System.out.println("Fim");  
    }
}
