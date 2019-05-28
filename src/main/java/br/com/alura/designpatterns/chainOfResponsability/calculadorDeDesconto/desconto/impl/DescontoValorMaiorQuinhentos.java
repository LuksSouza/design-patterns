package br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl;

import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.Desconto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;

public class DescontoValorMaiorQuinhentos implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getValor() > 500.0) {
			return orcamento.getValor() * 0.07;
		}
		
		return this.proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
