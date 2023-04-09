package br.thyago.ExerciciosLoopesArrays;

import java.util.Random;
import java.util.random.RandomGenerator;

import javax.swing.ButtonModel;

/* 
 * Faça um programa que leia 20 numeros inteiros aleaorios ( entre 0 e 10) amrmazene - os num vetor 
 * Ao final mostre os numeros e seus sucessores. 
 */

public class Ex9_NumerosAleatorios {
    public static void main(String[] args) {
      Random random = new Random();

      int [] numerosAleatorios = new int [20];

      for (int i = 0; i < numerosAleatorios.length ; i ++ ){
        int numero = random.nextInt(100);
        numerosAleatorios [i] = numero;

      }
      
        System.out.print("Numeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print(numero + " ");
        
        }
        
        System.out.print("\n Sucessores dos numeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero +1) + " ");
        
        }
        
        System.out.print("\n Antecessor dos numeros aleatorios: ");
        for (int numero : numerosAleatorios){
            System.out.print((numero -1) + " ");
        
        }



    }

    
}


