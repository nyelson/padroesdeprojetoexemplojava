package br.padroes.gof.comportamental.command;

/*Receiver class*/
public class Lampada {
    public Lampada() {  }
    
    public void ligar() {
       System.out.println("Luz ligada");
    }

    public void desligar() {
       System.out.println("Luz desligada");
    }

}
