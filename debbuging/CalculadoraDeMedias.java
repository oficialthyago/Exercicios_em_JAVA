package br.com.dio.debbuing;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[]args){
     Scanner scan = new Scanner (System.in);
     String[] alunos ={"Camila","Lucas","Bruno","Pedro"};

     int media = calculaMediaDaTurma(alunos, scan);

     Sytem.out.println("Média da turma d", media);
        }


}