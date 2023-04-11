package com.desafios.iniciante;
import java.util.Scanner;;
/*
 * Desafio 
 * Leia 6 valores. Em seguida, mostre quantos destes valores digitados
 * foram positivos. Na próxima linha, deve-se mostrar a média de todos
 * os valores positivos digitados, com um dígito após o ponto decimal.

 * Entrada
 * A entrada contém 6 números que podem ser valores inteiros ( int ) ou
 * de ponto flutuante ( float ou double ). Pelo menos um destes números
 * será positivo.

 * Saída
 * O primeiro valor de saída é a quantidade de valores positivos. A próxima
 *  linha deve mostrar a média dos valores positivos digitados.
 */
public class DesafioPositivoEMedia {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            int custoFabrica = scan.nextInt();
            int porcentagemDistribuidor = scan.nextInt();
            int percentualImpostos = scan.nextInt();
            
            int valorImpostos = custoFabrica*(porcentagemDistribuidor+percentualImpostos)/100;
            int valorFinal = (custoFabrica+valorImpostos);
            System.out.println(valorFinal);
        }
}
    

