import java.util.Scanner;

public class Main {
    /*Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua comissão
    * será de 5% do total da venda e que voce tem os seguintes dados:
    * - Indetificação do vendedor
    * - Código da peça
    * - Preço unitario da peça
    * - Mostre o resultado*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Olá, Bem vindo, vamos saber quanto você lucrou esse mes ?");

        System.out.print("Informe o nome do vendedor: ");
        String vendedor = scanner.nextLine();

        System.out.print("Informe o nome do produto: ");
        String produto = scanner.nextLine();

        System.out.printf("Informe o valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.printf("Informe a porcentagem de recebimento: ");
        Double porcentagemComissao = scanner.nextDouble();


        // calculo do sistema
        double valorComissao =((porcentagemComissao / 100) * valorProduto) * 100;
        System.out.println(valorComissao);

        //Sainda solicitada
        System.out.println("-----------INFORME---------------");
        System.out.println("Produto: "+ produto);
        System.out.println("O vendedor: "+ vendedor);
        System.out.println(" Receberá: R$"+ valorComissao);
        System.out.println("-----------INFORME---------------");
    }
}