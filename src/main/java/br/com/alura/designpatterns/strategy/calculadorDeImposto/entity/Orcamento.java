package br.com.alura.designpatterns.strategy.calculadorDeImposto.entity;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.exception.OrcamentoInvalidoException;

public class Orcamento {
	
	private double valor;

	public Orcamento(double valor) throws OrcamentoInvalidoException {
		if (valor <= 0) {
			throw new OrcamentoInvalidoException("O valor do orçamento deve ser maior que 0");
		}
		
		this.valor = valor;	
	}

	public double getValor() {
		return valor;
	}

}
