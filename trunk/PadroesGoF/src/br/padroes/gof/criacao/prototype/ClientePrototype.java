package br.padroes.gof.criacao.prototype;

class ClientePrototype {
	 
	static final int DOCUMENTO_TIPO_ASCII = 0;
 
	static final int DOCUMENTO_TIPO_PDF = 1;
 
	private Documento ascii = new ASCII();
 
	private Documento pdf = new PDF();
 
	public Documento criarDocumento(int tipo) {
		if (tipo==ClientePrototype.DOCUMENTO_TIPO_ASCII) {
			return ascii.clone();
		} else {
			return pdf.clone();
		}
 
	}
}