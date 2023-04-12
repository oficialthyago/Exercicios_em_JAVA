package exercicios.dio.poo;
/*
 * Classe de exemplo para o exercicio da aula 3 de orientação 
 * a objeto 
 */

class Carro {

    /* Dados solicitados na segunda aula  */
    String cor          ;
    String Modelo       ;
    int capacidadeTanque;
    
    // constutor aqui 
    // SET AND GET COR //
    void setCor (String cor){
        this.cor = cor;

    }

    String getCor (){
        return cor;

    }
    // SET AND GET MODELO //
    void setModelo (String Modelo){

        this.Modelo = Modelo;

    }
    
    String getModelo (){
    return Modelo;
    
    }
    // SET AND GET CapacidadeTanque //
        void setcapacidadeTanque (int capacidadeTanque){
        this.capacidadeTanque = capacidadeTanque;
    }

        int getCapacidadeTanque (){
            return capacidadeTanque;
        }

        double totalValorTanque(double valorCombustivel){

            return  capacidadeTanque * valorCombustivel; 


        }

     Carro (String cor, String Modelo, int capacidadeTanque){
        this.cor = cor;
        this.Modelo=Modelo;
        this.capacidadeTanque = capacidadeTanque;

     }

    public Carro() {
    }

     
} 


