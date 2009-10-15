package br.padroes.gof.estrutural.adapter.composicao;

/**
 * @author  root
 */
public class ConnectorAdapter {
	/**
	 * @uml.property  name="plug5"
	 * @uml.associationEnd  
	 */
	Plug5AMP plug5;

	public ConnectorAdapter(Plug5AMP plug) {
		this.plug5 = plug;
	}

	public String getAdapterOutput(String outputFromScoket) {
		/*
		 * if output is same, return
		 */
		if (outputFromScoket.equals(plug5.getInput())) {
			return outputFromScoket;
		}
		/*
		 * Else, override the value by adapterOutput
		 */
		else {
			String adapterOutput = plug5.getInput();
			return adapterOutput;
		}
	}
}