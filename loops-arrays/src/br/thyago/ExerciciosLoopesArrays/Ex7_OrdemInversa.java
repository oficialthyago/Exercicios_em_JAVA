package br.thyago.ExerciciosLoopesArrays;

import java.util.concurrent.CountDownLatch;

/* 
 * Crie um vetor de 6 numeros inteiros 
 * e mostre os na ordem inversa 
 */


public class Ex7_OrdemInversa {
    public static void main(String[] args) {
        
        int[] vetor = {-5,-7,30,51,20,1};

        int count = 0;

        while(count < (vetor.length)){
                System.out.print(vetor[count] + "  ");
                count ++;
        }

        for (int i = (vetor.length - 1); i >= 0; i -- ){
                System.out.print(vetor[i] + "  ");
        }


    }
}
