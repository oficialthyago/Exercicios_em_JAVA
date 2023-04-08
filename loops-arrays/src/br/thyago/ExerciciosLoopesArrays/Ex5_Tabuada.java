package br.thyago.ExerciciosLoopesArrays;

import java.util.Scanner;

/*
 * Desenvolva um gerador de tabuada,
 * capax de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * O usuario deve informar de qual numero ele deseja ver a tabuada 
 * a saida deve  ser conforme o exemplo abaixo;
 * tabuada de 5:
 * 
 * 5x1 = 5
 * 5x2 = 10
 * 5x3 = 15
 * 
 */
public class Ex5_Tabuada {
    public static void main(String[] args) {
    /*NOMECLATURAS DE VARIAVEIS  */
    int taboada;

    /*Mensagem de inicialização de programa  */
    System.out.println("Qual taboada deseja ver :  ");

    /*Interação com o usuario  */
    Scanner scan = new Scanner(System.in);
        System.out.println("taboada:");
        taboada = scan.nextInt();

    
    System.out.println("Esta é a taboada de :" + taboada);
    /*Estrutura de repetição  */
        for (int i = 1; i <=10 ;i = i+1  ){
            System.out.println(taboada + "X" + i+ "=" + (taboada  * i));


        }

    }

}