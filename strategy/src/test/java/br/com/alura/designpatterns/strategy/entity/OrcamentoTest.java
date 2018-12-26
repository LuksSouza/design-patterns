package br.com.alura.designpatterns.strategy.entity;

import static org.hamcrest.CoreMatchers.is;

import org.junit.Assert;
import org.junit.Test;

import br.com.alura.designpatterns.strategy.entity.Orcamento;
import br.com.alura.designpatterns.strategy.exception.OrcamentoInvalidoException;

public class OrcamentoTest {
	
	@Test
	public void testeDeveCriarOrcamento() throws OrcamentoInvalidoException {
		Orcamento orcamento = new Orcamento(300.00d);
		
		Assert.assertEquals(orcamento.getValor(), 300.00, 0.01);
	}
	
	@Test
	public void testeDeveLancarExcecaoValorNegativo() {		
		try {
			new Orcamento(-50.00d);
			Assert.fail();
		} catch (OrcamentoInvalidoException e) {
			Assert.assertThat(e.getMessage(), is("O valor do orçamento deve ser maior que 0"));
		}
	}
	
	@Test
	public void testeDeveLancarExcecaoValorZerado() {		
		try {
			new Orcamento(0.00d);
			Assert.fail();
		} catch (OrcamentoInvalidoException e) {
			Assert.assertThat(e.getMessage(), is("O valor do orçamento deve ser maior que 0"));
		}
	}

}
