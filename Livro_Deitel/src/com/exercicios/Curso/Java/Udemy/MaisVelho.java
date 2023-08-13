package com.exercicios.Curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author luiz-
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades.
 * Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
 * Depois, mostrar na tela o nome da pessoa mais velha.
 */
public class MaisVelho 
{

    public static void main(String[] args)
    {
        PessoaMaisVelha();
    }
    
    public static void PessoaMaisVelha()
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas Pessoas Irá Cadastrar ? ");
        int quantyty = sc.nextInt();
        System.out.println("-------------------------------");
                
        String [] nomes = new String[quantyty];
        int [] idades = new int[quantyty];
        int contador = 0, maisVelho = 0, i = 0, nomeMaisVelho = 0;
        
        while(contador < quantyty)
        {
            System.out.print("Digite o Nome da " + (contador + 1) + "° Pessoa: ");
            sc.nextLine(); // Este Comando é Necessário Para Limpar o Buffer da Linha Seguinte
            String nome = sc.nextLine();
            
            System.out.println("");
            
            System.out.print("Digite a Idade da " + (contador + 1) + "° Pessoa: ");
            int idade = sc.nextInt();
   
            System.out.println("-------------------------------");
            System.out.println("");
   
            idades[contador] = idade;
            nomes[contador] = nome;    
            contador++;
        }
               
        for(contador = 0; contador < nomes.length; contador++)
        {
            System.out.println("Nome: " + nomes[contador]);
            System.out.println("Idade: " + idades[contador]);
            System.out.println("-------------------------------");
            System.out.println("");
        }
          
        for(contador = 0; contador < quantyty; contador++)
        {
            maisVelho = idades[contador];
            i = 0;
            
            while(i < quantyty)
            {
                if(maisVelho < idades[i])
                {
                    maisVelho = idades[i]; 
                    nomeMaisVelho = i;
                }   
                i++;
            }
        }
        
        System.out.println("A Pessoa Mais Velha é -> " + nomes[nomeMaisVelho] + " e Tem -> " + maisVelho + " Anos\n");
        sc.close();
        
    }//FIM METODO
    
}//FIM CLASS
