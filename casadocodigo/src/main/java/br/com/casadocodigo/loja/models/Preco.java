package br.com.casadocodigo.loja.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

@Embeddable
public class Preco {

	private TipoPreco tipoPreco;
	private BigDecimal preco;

	public Preco() {

	}

	public Preco(TipoPreco tipoPreco, BigDecimal preco) {

	}

	public TipoPreco getTipoPreco() {
		return tipoPreco;
	}

	public void setTipoPreco(TipoPreco tipoPreco) {
		this.tipoPreco = tipoPreco;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Preco [tipoPreco=" + tipoPreco + ", preco=" + preco + "]";
	}

	
}
