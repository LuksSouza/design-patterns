package br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;

public interface Desconto {

	double desconta(Orcamento orcamento);
	
	void setProximo(Desconto d2);

}
