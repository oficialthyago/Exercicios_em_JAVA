
import java.util.Scanner;

public class Calculadora {

/* FAÇA UM PROGRAMA PARA CALCULAR O ESTOQUE MÉDIO DE UMA PEÇA, SENDO QUE :
ESTOQUE MEDIO = (QUANTIDADE MINIMA = QUANTIDADE MAXIMA)
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual peça deseja por em estoque: ");
        String produto = scanner.next();

        System.out.println("Informe a quantia maxima de " + produto + " deve conter em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.println("Informe a quantia minima que não de " + produto + " não pode faltar em seu estoque:");
        int quantidadeMinima = scanner.nextInt();


        int estoqueMedio = (quantidadeMinima + quantidadeMaxima) /2;


        System.out.println("---SISTEMA DE ESTOQUE-------------");
        System.out.println("A MEDIA DE " + produto +" É: " + estoqueMedio);

        System.out.println("----------------------------------");


    }

}