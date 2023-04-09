package com.desafios.iniciante;

import java.util.Scanner;

/*Desafio
O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor
e dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa
para calcular o preço de um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens
referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o valor
final do carro.
 */
 public class FabricaDeCarro{
 
     public static void main(String[] args) {
 
         Scanner scan = new Scanner(System.in);
 
         int custoFabrica = scan.nextInt();
         int porcentagemDistribuidor = scan.nextInt();
         int percentualImpostos = scan.nextInt();

          /* soma do custo de fábrica com a (porcentagem do distribuidor e(+) dos impostos)/100) */
         int valorImpostos = custoFabrica*(porcentagemDistribuidor+percentualImpostos)/100;
         
         int valorFinal = (custoFabrica+valorImpostos);
         System.out.println(valorFinal);
     }
 } 
 











