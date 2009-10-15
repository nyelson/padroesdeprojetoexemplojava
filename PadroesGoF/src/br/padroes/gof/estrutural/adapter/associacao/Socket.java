package br.padroes.gof.estrutural.adapter.associacao;

/**
 * The socket class has a specs for 15 AMP.
 */
public interface Socket {
	/**
	 * This method is used to match the input to be
	 * given to the Plug
	 *
	 * @return Output of the Plug (Client)
	 */
	public String getOutput();
}
