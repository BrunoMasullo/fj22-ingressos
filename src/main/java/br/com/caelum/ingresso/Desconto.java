package br.com.caelum.ingresso;

import java.math.BigDecimal;

public interface Desconto {
	public	BigDecimal	aplicarDescontoSobre(BigDecimal	precoOriginal);
}
