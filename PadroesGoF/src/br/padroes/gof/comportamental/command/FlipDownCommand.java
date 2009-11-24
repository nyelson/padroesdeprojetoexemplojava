package br.padroes.gof.comportamental.command;

/*the Command for turning off the light*/
public class FlipDownCommand implements Command {
 
   private Lampada theLight;
 
   public FlipDownCommand(Lampada light) {
        this.theLight=light;
   }
 
   public void execute() {
      theLight.desligar();
   }
}
