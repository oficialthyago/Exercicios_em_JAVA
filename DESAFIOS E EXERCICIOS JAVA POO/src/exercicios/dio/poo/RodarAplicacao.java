package exercicios.dio.poo;

/*
 * 
 * Classe de exemplo pra o exercicio da aula2 da orientaão a objetos.
 * 
 */
public class RodarAplicacao {
   
    public static void main(String[] args) {
        Carro bmw = new Carro ();

        bmw.setCor("Azul");
        bmw.setModelo("BMW SERIE 3");
        bmw.setcapacidadeTanque(60);

        System.out.println(bmw.getCor());
        System.out.println(bmw.getModelo());
        System.out.println(bmw.getCapacidadeTanque());
        System.out.println(bmw.totalValorTanque(6.39));


            System.out.println("--------------------------------------------------");
        /* OUTRA MANEIRA DE SE FAZER O MESMO */

        Carro fusca = new Carro("black","platonico",80);

        System.out.println(fusca.getCor());
        System.out.println(fusca.getModelo());
        System.out.println(fusca.getCapacidadeTanque());
        System.out.println(fusca.totalValorTanque(6.39));











    }


}
