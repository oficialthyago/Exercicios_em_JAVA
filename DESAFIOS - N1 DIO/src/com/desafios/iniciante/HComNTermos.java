package com.desafios.iniciante;
import java.util.Scanner;

/*
* Desafio
* Neste desafio, faça um programa que calcule o valor de H com N termos. 
*
* Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N. 
*
* Entrada 
* A entrada consiste em um número inteiro positivo. 
* 
* Saída 
* Na saída será impresso o valor que representa a soma dos termos.
*/


    public class HComNTermos {  
    public static void main(String[] Args) {
      
     Scanner read = new Scanner(System.in);
     
     double n = read.nextDouble(); 
     
     double h = 0;
     
     for (int i = 1; i <= n; ++i) { h += (double) 1/i; }
     
     System.out.printf("%.0f",h);  
   }
}
