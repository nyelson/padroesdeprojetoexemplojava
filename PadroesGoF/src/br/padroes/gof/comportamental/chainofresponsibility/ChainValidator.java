package br.padroes.gof.comportamental.chainofresponsibility;

abstract class ChainValidator implements Valiable {
	 
    protected ChainValidator nextValidator;
 
    public void setSuccessor(ChainValidator nextValidator){
        this.nextValidator = nextValidator;
    }
 
    public boolean validate(String valor) {
    	if (isValid(valor)) {
			//passa para o próximo validator se o returnato é TRUE
			if (nextValidator != null) {
				return nextValidator.validate(valor);
			}
		}else{
			return false;
		}
		return true;
    }
}
