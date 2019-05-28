package br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl;

import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.Desconto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;

public class SemDesconto implements Desconto {

	public double desconta(Orcamento orcamento) {
		return 0;
	}

	public void setProximo(Desconto proximo) {}

}
