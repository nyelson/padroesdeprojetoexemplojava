package br.padroes.gof.comportamental.command;

public class ClienteCommand {
	public static void main(String[] args) {
	       Lampada lamp = new Lampada();
	       Command switchUp = new FlipUpCommand(lamp);
	       Command switchDown = new FlipDownCommand(lamp);
	 
	       // See criticism of this model above:
	       // The switch itself should not be aware of lamp details (switchUp, switchDown) either directly or indirectly
	       Switch s = new Switch(switchUp,switchDown);
	       s.flipDown();
	}

}
