package br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.impl;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.Imposto;

public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {
		double orcamentoCalculado = 0.0d;
		
		if (orcamento.getValor() < 1000.0) {
			orcamentoCalculado = orcamento.getValor() * 0.05;
		}
		
		if (orcamento.getValor() > 1000.0 && orcamento.getValor() < 3000.0) {
			orcamentoCalculado = orcamento.getValor() * 0.07;
		}
		
		if (orcamento.getValor() > 3000.0) {
			orcamentoCalculado = orcamento.getValor() * 0.08 + 30.0;
		}
		
		return orcamentoCalculado;
	}

}
