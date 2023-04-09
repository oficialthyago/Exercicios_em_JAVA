package com.desafios.iniciante;
import java.util.Scanner;;

public class DesafioPositivoEMedia {


    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int count = 0;
        double media = 0;
        double x;

        while (leitor.hasNext()) {
            x = leitor.nextDouble();
            if (x > 0) {
                media += x;
                count++;
            }
        }

        media /= count;
        System.out.println(count + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
    

