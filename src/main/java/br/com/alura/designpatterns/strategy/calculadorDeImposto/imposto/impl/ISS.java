package br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.impl;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.Imposto;

public class ISS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}

}
