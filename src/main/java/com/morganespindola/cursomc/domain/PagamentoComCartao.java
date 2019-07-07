package com.morganespindola.cursomc.domain;

import javax.persistence.Entity;

import com.morganespindola.cursomc.enums.EstadoPagamentoEnum;

@Entity
public class PagamentoComCartao extends Pagamento {
	private static final long serialVersionUID = 1L;

	private Integer numeroParcelas;
	
	public PagamentoComCartao() {
	}

	public PagamentoComCartao(Integer id, EstadoPagamentoEnum estadoPagamento, Pedido pedido, Integer parcelas) {
		super(id, estadoPagamento, pedido);
		this.numeroParcelas = parcelas;
	}

	public Integer getParcelas() {
		return numeroParcelas;
	}

	public void setParcelas(Integer parcelas) {
		this.numeroParcelas = parcelas;
	}
	
}