package br.com.alura.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.designpatterns.strategy.CalculadorDeImposto;
import br.com.alura.designpatterns.strategy.entity.Orcamento;
import br.com.alura.designpatterns.strategy.exception.OrcamentoInvalidoException;
import br.com.alura.designpatterns.strategy.imposto.Imposto;
import br.com.alura.designpatterns.strategy.imposto.impl.ICMS;
import br.com.alura.designpatterns.strategy.imposto.impl.ISS;

public class CalculadorDeImpostoTest {
	
	private Orcamento orcamento;
	private Imposto icms;
	private Imposto iss;
	private CalculadorDeImposto calculadorDeImposto;
	private Double impostoCalculado;

	@Before
	public void configuraTestes() throws OrcamentoInvalidoException {
		orcamento = new Orcamento(500.00d);
		icms = new ICMS();
		iss = new ISS();
		
		calculadorDeImposto = new CalculadorDeImposto();
	}
		
	@Test
	public void testeDeveCalcularICMS() {
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.icms);
		
		Assert.assertEquals(impostoCalculado, 50.00, 0.01);
	}
	
	@Test
	public void testeDeveCalcularISS() {
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.iss);
		
		Assert.assertEquals(impostoCalculado, 30.00, 0.01);
	}

}
