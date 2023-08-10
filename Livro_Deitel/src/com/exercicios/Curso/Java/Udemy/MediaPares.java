package com.exercicios.Curso.Java.Udemy;

import java.util.Locale;
import java.util.Scanner;

/**
 * @author luiz-
    Problema "media_pares"
    Fazer um programa para ler um vetor de N números inteiros. 
    Em seguida, mostrar na tela a média aritmética somente dos números pares lidos
    com uma casa decimal.
    Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
*/

public class MediaPares
{
    public static void main(String[] args)
    {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos Números Vai Ter o Vetor ? ");
        int quantyty = sc.nextInt();
        int [] vetor = new int[quantyty];
        
        int contador = 0, pares = 0, totalPares = 0;
        double media = 0;
        
        System.out.println("---------------------------------------------");
        
        while(contador < vetor.length)
        {
            System.out.print("Digite o " + (contador + 1) + "° Número: ");
            int value = sc.nextInt();
            vetor[contador] = value;
            contador++;
        }
        
        System.out.println("EXIBINDO O RESULTADO...");
        
        for(contador = 0; contador < vetor.length; contador++)
        {
            if( vetor[contador] % 2 == 0 )
            {
                pares += vetor[contador];
                totalPares++;
                media = pares / totalPares;
            }
        }

        if(pares != 0)
        { 
            System.out.printf("MÉDIA DOS PARES: %.1f%n", media);
        }
        else
        {
            System.out.println("NENHUM VALOR PAR FOI ADCIONADO AO VETOR.");
        }

    }//Fim Metodo  
}//Fim Class
