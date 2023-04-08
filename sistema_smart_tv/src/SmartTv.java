public class SmartTv {
    boolean ligada=false;
    int canal = 1;
    int volume = 25;

    /* Botão de mudar de canal  */
    public void mudarCanal (int novoCanal){
        canal = novoCanal;

    }
    
    public void aumentarCanal (){
        canal++;

    }
    public void diminuirCanal (){
        canal--;

    }

/* Botão de aumentar ou diminuir volume  */

    public void aumentarVolume (){
        volume++;
        
        System.out.println("Aumentando o volume para: "+volume);
    }
    
    public void diminuirVolume (){
        volume--;
        System.out.println("Aumentando o volume para: "+ volume);
    }

    /* Botão de ligar e desligar  */
    public void ligar(){
        ligada = true;

    }
    public void desligar(){
            ligada = false;
    }
}
