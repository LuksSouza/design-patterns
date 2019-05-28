package br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl;

import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.Desconto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;

public class DescontoCincoItens implements Desconto {

	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		
		if (orcamento.getItens().size() > 5) {
			return orcamento.getValor() * 0.1;
		}
		
		return this.proximo.desconta(orcamento);
	}

	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
