package br.com.alura.designpatterns.strategy.calculadorDeImposto;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.Imposto;

public class CalculadorDeImposto {
	
	public double realizaCalculo(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}

}
