package br.thyago.ExerciciosLoopesArrays;

import java.util.Scanner;

/*
  *Faça um programa que peça N numeros inteiros,
  Calcule e mostre a quantidde de números pares
  e a quantidade de números impares.  
  */


public class Ex4_ParEImpar {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int count = 0;
        int quantPares =0 ;
        int quantImpares =0 ;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();


        /* ESTRUTURA DE REPETIÇÃO */
        do{
            System.out.println("Numero:");
            numero = scan.nextInt();
            
            if (numero %2 == 0 ) quantPares ++;
            else quantImpares ++;


            count ++;
        } while (count < quantNumeros);

        System.out.println("Quantidade de pares: " + quantPares);
        System.out.println("Quantidade de impares: "+ quantImpares);


    }

}
