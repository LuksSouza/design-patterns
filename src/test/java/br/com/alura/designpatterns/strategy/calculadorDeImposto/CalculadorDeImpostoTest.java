package br.com.alura.designpatterns.strategy.calculadorDeImposto;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.alura.designpatterns.strategy.calculadorDeImposto.CalculadorDeImposto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.entity.Orcamento;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.exception.OrcamentoInvalidoException;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.Imposto;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.impl.ICCC;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.impl.ICMS;
import br.com.alura.designpatterns.strategy.calculadorDeImposto.imposto.impl.ISS;

public class CalculadorDeImpostoTest {
	
	private Orcamento orcamento;
	private Imposto icms;
	private Imposto iss;
	private Imposto iccc;
	private CalculadorDeImposto calculadorDeImposto;
	private Double impostoCalculado;

	@Before
	public void configuraTestes() throws OrcamentoInvalidoException {
		orcamento = new Orcamento(500.00d);		
		calculadorDeImposto = new CalculadorDeImposto();
	}
		
	@Test
	public void testeDeveCalcularICMS() {
		icms = new ICMS();
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.icms);
		
		Assert.assertEquals(impostoCalculado, 300.00, 0.01);
	}
	
	@Test
	public void testeDeveCalcularISS() {
		iss = new ISS();
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.iss);
		
		Assert.assertEquals(impostoCalculado, 30.00, 0.01);
	}
	
	@Test
	public void testeDeveCalcularICCCMenorQueMil() {
		iccc = new ICCC();
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.iccc);
		
		Assert.assertEquals(impostoCalculado, 25.00, 0.01);
	}
	
	@Test
	public void testeDeveCalcularICCCEntreMilE3Mil() throws OrcamentoInvalidoException {
		iccc = new ICCC();
		orcamento = new Orcamento(2000.00d);		

	
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.iccc);
		
		Assert.assertEquals(impostoCalculado, 140.00, 0.01);
	}
	
	@Test
	public void testeDeveCalcularICCCMaior3Mil() throws OrcamentoInvalidoException {
		iccc = new ICCC();
		orcamento = new Orcamento(4000.00d);		

	
		this.impostoCalculado = this.calculadorDeImposto.realizaCalculo(this.orcamento, this.iccc);
		
		Assert.assertEquals(impostoCalculado, 350.00, 0.01);
	}

}
