package br.com.alura.designpatterns.strategy.imposto;

import br.com.alura.designpatterns.strategy.entity.Orcamento;

public interface Imposto {
	
	public double calcula(Orcamento orcamento);

}
