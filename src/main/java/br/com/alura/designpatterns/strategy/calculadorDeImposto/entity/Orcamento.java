package br.com.alura.designpatterns.strategy.calculadorDeImposto.entity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.exception.OrcamentoInvalidoException;

public class Orcamento {
	
	private double valor;
	private List<Item> itens;

	public Orcamento(double valor) throws OrcamentoInvalidoException {
		if (valor <= 0) {
			throw new OrcamentoInvalidoException("O valor do orçamento deve ser maior que 0");
		}
		
		this.valor = valor;
		this.itens = new ArrayList<Item>();
	}

	public double getValor() {
		return valor;
	}
	
	public void adicionaItem(Item item) {
		this.itens.add(item);
	}
	
	public List<Item> getItens() {
		return Collections.unmodifiableList(this.itens);
	}

}
