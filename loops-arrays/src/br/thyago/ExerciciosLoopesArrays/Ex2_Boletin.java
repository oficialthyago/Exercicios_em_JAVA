package br.thyago.ExerciciosLoopesArrays;
/* Faça um programa que peça uma nota, entre zero e dez
 * Mostre uma mensagem  caso o valor seja inválido
 * e continue pedindo até que o usuário informe um valor válido
 */

import java.util.Scanner;

public class Ex2_Boletin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  /* SEMPRE FAÇA ESSE COMAANDO QUANDO NECESSARIO INSERÇÃO DE DADOS
        POR PARTE DO USER FINAL  */
        int nota ;

        System.out.println("Digite a nota: ");
        nota = scan.nextInt();

        while (nota <0 || nota >10 ){
            System.out.println("Nota Invalida, favor corrigir a nota pois a mesma ultrapassa o valor maximo");
            System.out.println("Digite a nota: ");
            nota = scan.nextInt();
        }
        System.out.println("Nota inserida:" + nota );
        
    }

}
