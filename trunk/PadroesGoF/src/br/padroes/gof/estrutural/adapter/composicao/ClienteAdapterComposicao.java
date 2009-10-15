package br.padroes.gof.estrutural.adapter.composicao;

public class ClienteAdapterComposicao {
	
	public static void main(String[] args) {
		// Taking output from the Socket
		Socket socket = new Socket();
		String outputFromSocket = socket.getOutput();

		// Giving away input to the Plug
		ConnectorAdapter adapter = new ConnectorAdapter(new Plug5AMP());
		String inputToPlug = adapter.getAdapterOutput(outputFromSocket);
		System.out.println("New output by adapter is: "+inputToPlug);
	}

}
