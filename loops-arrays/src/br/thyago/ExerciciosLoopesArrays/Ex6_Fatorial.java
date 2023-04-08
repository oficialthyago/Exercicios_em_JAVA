package br.thyago.ExerciciosLoopesArrays;

import java.util.Scanner;

/*Faça um programa que calcule o fatorial de um numero inteiro fernecido pelo usuario */

public class Ex6_Fatorial {
    public static void main(String[] args) {
        System.out.println("Olá, Bem vindo ao sistema, favor inserir os dados ");

        int fatorial; 
        int multiplicacao = 1;
        
        /* LOCAL DE INTERAÇÃO DO USUARIO  */

        Scanner scan = new Scanner(System.in);

        System.out.println("Valor do Fatorial: ");
        fatorial = scan.nextInt();

        System.out.println(fatorial +"! = ");

        for (int i = fatorial; i >= 1 ; i --  ){
            multiplicacao = multiplicacao * i ;

        }

        System.out.println("valor :" + multiplicacao );
    }
    
}
