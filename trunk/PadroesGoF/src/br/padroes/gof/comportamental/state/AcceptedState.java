package br.padroes.gof.comportamental.state;

public class AcceptedState implements State {
	 public void grantPermission(StateContext ctx) {
	  
	 }
	 public void requestPermission(StateContext ctx){
	   System.out.println("Requesting permission");
	   ctx.setState(ctx.getRequestedState());
	 }

	 public String getStatus() {
	   return "Request Received";
	 }
	}
