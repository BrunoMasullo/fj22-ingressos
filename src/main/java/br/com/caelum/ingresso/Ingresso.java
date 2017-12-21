package br.com.caelum.ingresso;

import java.math.BigDecimal;

import br.com.caelum.ingresso.model.Sessao;

public class Ingresso {
	this.sessao = sessao;
	
	private	Sessao	sessao;
	private	BigDecimal	preco;
	
	public	Ingresso(Sessao	sessao,	Desconto	desconto)	{
		this.preco	=	desconto.aplicarDescontoSobre(sessao.getPreco());
}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
}
