package br.com.alura.designpatterns.strategy.calculadorDeImposto.exception;

public class OrcamentoInvalidoException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public OrcamentoInvalidoException() {
		super();
	}
	
	public OrcamentoInvalidoException(String mensagem) {
		super(mensagem);
	}

}
