package br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;

public interface Imposto {
	
	public double calcula(Orcamento orcamento);

}
