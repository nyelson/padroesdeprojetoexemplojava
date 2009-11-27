package br.padroes.gof.comportamental.state;

public class GrantedState implements State {
	 public void grantPermission(StateContext ctx) {
	  System.out.println("Invalid state");
	 }
	 public void requestPermission(StateContext ctx){
	  System.out.println("Invalid state");
	 }
	 
	 public String getStatus() {
	  return "Granted";
	 }
	}
