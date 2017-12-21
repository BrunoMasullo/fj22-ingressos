package br.com.caelum.ingresso;

import java.math.BigDecimal;

public class DescontoParaEstudantes implements Desconto {
	private BigDecimal metade = new BigDecimal(2.0);

	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOriginal) {
		return precoOriginal.divide(metade);
	}
}
