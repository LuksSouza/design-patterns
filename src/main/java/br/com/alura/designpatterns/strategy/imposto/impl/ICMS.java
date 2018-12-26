package br.com.alura.designpatterns.strategy.imposto.impl;

import br.com.alura.designpatterns.strategy.entity.Orcamento;
import br.com.alura.designpatterns.strategy.imposto.Imposto;

public class ICMS implements Imposto {

	public double calcula(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}	

}
