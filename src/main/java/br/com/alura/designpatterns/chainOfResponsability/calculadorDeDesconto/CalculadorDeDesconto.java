package br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto;

import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.Desconto;
import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl.DescontoCincoItens;
import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl.DescontoValorMaiorQuinhentos;
import br.com.alura.designpatterns.chainOfResponsability.calculadorDeDesconto.desconto.impl.SemDesconto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Item;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.exception.OrcamentoInvalidoException;

public class CalculadorDeDesconto {
	
	public static double calcula(Orcamento orcamento) {
		
		Desconto d1 = new DescontoCincoItens();
		Desconto d2 = new DescontoValorMaiorQuinhentos();
		Desconto d3 = new SemDesconto();
		
		d1.setProximo(d2);
		d2.setProximo(d3);
		
		double descontoAplicado = d1.desconta(orcamento);
		
		System.out.printf("Desconto aplicado %f", descontoAplicado);
		
		return descontoAplicado;
	}
	
	public static void main(String[] args) {
		
		Orcamento orcamento = null;
		try {
			orcamento = new Orcamento(501.0);
			
			orcamento.adicionaItem(new Item("CANETA", 250.0));
	        orcamento.adicionaItem(new Item("LAPIS", 250.0));
		} catch (OrcamentoInvalidoException e) {
			e.printStackTrace();
		}
		
		calcula(orcamento);
	}

}
