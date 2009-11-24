package br.padroes.gof.comportamental.command;

/*the Command for turning on the light*/
public class FlipUpCommand implements Command {
	 
	   private Lampada theLight;
	 
	   public FlipUpCommand(Lampada light) {
	        this.theLight=light;
	   }
	 
	   public void execute(){
	      theLight.ligar();
	   }
	}

