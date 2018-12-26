package br.com.alura.designpatterns.strategy;

import br.com.alura.designpatterns.strategy.entity.Orcamento;
import br.com.alura.designpatterns.strategy.imposto.Imposto;

public class CalculadorDeImposto {
	
	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}

}
