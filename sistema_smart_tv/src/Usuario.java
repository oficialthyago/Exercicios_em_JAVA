public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();
        
        /*Sistema contador de canais */
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("canal atual ?" + smartTv.canal);
        
        smartTv.mudarCanal(13);
        
        System.out.println("canal atual ?" + smartTv.canal);

        System.out.println("Volume Atual: " + smartTv.volume );

        System.out.println("Tv Ligada ?" + smartTv.ligada);
        System.out.println("canal atual ?" + smartTv.canal);
        System.out.println("Volume Atual ?" + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status -> TV LIGADA ?:" + smartTv.ligada);
        
        smartTv.desligar ();
        System.out.println("Novo Status -> TV DESLIGADA ?:" + smartTv.ligada);

        
    }
}
