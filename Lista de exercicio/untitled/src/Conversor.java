/*2 FAÇA UM PROGRAMA QUE:
 * - LEIA COTAÇÃO DO DOLAR
 * -LEIA UM VALOR EM DOLAR
 * CNVERTA ESSSE VALOR PARA REAL
 * MOSTRE O RESULTADO*/

import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a cotação do dólar: ");
        double cotacao = scanner.nextDouble();

        System.out.print("Digite o valor em dólar: ");
        double valorDolar = scanner.nextDouble();

        double valorReal = valorDolar * cotacao;

        System.out.println("O valor em reais é: " + valorReal);
    }
}