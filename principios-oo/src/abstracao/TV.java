package abstracao;

public class TV {
    private boolean ligada;
    private int volume;
    private int canal;

    public void ligarDesligar(){
        this.ligada = !ligada;
        System.out.println("A tv está " + (ligada ? "ligada" : "desligada"));
    }

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Volume aumentado para " + volume);
    }

    public void diminuirVolume(){
        this.volume--;
        System.out.println("Volume diminuido para: " + volume);
    }

    public void trocarCanal(int novoCanal){
        this.canal = novoCanal;
        System.out.println("Canal alterado para: " + novoCanal);
    }
}
