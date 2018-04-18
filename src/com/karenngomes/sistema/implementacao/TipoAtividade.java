package com.karenngomes.sistema.implementacao;

public enum TipoAtividade {
	AULA(1), APRESENTACAO(2), LABORATORIO(3);
	
	private final int valor;
	
	TipoAtividade(int valorOpcao) {
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
}
