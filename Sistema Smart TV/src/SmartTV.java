public class SmartTV {

    boolean ligada = false;
    int canal = 1;
    int volume = 10;

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++ ;
    }
    public void diminuirCanal(){
        canal-- ;
    }
    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    public void aumentarVolume(){
        System.out.println("Aumentando o volume para: " + volume);
        volume++;
    }
    public void diminuirVolume(){
        System.out.println("Diminuindo o volume para: " + volume);
        volume--;
    }
}
