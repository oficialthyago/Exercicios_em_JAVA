package br.thyago.ExerciciosLoopesArrays;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;

/*
 * Faça um programa que leia um veto de 6 caracteres, 
 * e diga quantas consoantes foram lidas.
 * imprima as consoantes .
 * 
 */
public class Ex8_Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String [] consoantes = new String[6];
        int quantidadeConsoantes =0;

        int count = 0;
        do {
            System.out.println("Letras");
            String letra = scan.next ();

            if (! (letra.equalsIgnoreCase("a") |
                letra.equalsIgnoreCase("e") |
                letra.equalsIgnoreCase("i") |
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u") ) ) {

                    consoantes [count] = letra;
                    quantidadeConsoantes ++;
                }
            
                count ++;

        }while (count < consoantes.length);
         
        System.out.println("As consoantes digitadas são elas: " );
        for (String consoante : consoantes) {

            if ( consoante != null)

        System.out.print(consoante + " "  );
        
              
        }

        System.out.println(" Voce digitou: " + quantidadeConsoantes + " consoantes");

    }
    
}
