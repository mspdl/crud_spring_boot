package com.morganespindola.cursomc.enums;

public enum TipoClienteEnum {
	
	PESSOA_FISICA (1, "Pessoa Física"),
	PESSOA_JURIDICA (2, "Pessoa Jurídica");
	
	private int codigo;
	private String descricao;
	
	private TipoClienteEnum(int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static TipoClienteEnum toEnum (Integer codigo) {
		if(codigo == null) {
			return null;
		}
		for(TipoClienteEnum tipoCliente : TipoClienteEnum.values()) {
			if (tipoCliente.getCodigo() == codigo) {
				return tipoCliente;
			}
		}
		throw new IllegalArgumentException("Código inválido: " + codigo);
	}
	
}