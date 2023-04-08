package br.thyago.ExerciciosLoopesArrays;

import java.util.Scanner;
 import java.util.Scanner;
/*
Faça um programa que leia 5 numeros
e informe o maior numero

e a média desses numeros.abstract
*/

public class Ex3_MaiorEMedia {

    public static void main(String[] args) {
     System.out.println("Olá, Sejá bem vindo ao boletec o sistema de notas");
     Scanner scan = new Scanner(System.in);
     
        int numero;
        int maior = 0;
        int somar = 0;  
       

        int count = 0;
        do{
            System.out.println("Digite o Numero: ");
            numero = scan.nextInt();

            somar = somar + numero;


            if (numero  > maior) maior = numero;

            count = count + 1 ;

            System.out.println(" O maior numedo digitado foi:" + maior );

        }   while(count < 5 );

        System.out.println(" O maior numero entre todos foi " + maior );  
        System.out.println(" A soma dos numero foi " + somar ); 
        System.out.println(" A média dos numero foi " + (somar/5) ); 

        
    }

}

