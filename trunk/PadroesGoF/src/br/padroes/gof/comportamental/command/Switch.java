package br.padroes.gof.comportamental.command;

/*the Invoker class*/
public class Switch {
 
    private Command flipUpCommand;
    private Command flipDownCommand;
 
    public Switch(Command flipUpCmd, Command flipDownCmd) {
         this.flipUpCommand = flipUpCmd;
         this.flipDownCommand = flipDownCmd;
    }
 
    public void flipUp() {
         flipUpCommand.execute();
    }
 
    public void flipDown() {
         flipDownCommand.execute();
    }
}