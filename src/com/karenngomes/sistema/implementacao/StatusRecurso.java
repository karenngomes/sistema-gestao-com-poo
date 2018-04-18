package com.karenngomes.sistema.implementacao;

public enum StatusRecurso {
	
	EM_PROCESSO(1), ALOCADO(2), ANDAMENTO(3), CONCLUIDO(4);
	
	private final int valor;
	
	StatusRecurso(int valorOpcao) {
		valor = valorOpcao;
	}
	
	int getValor() {
		return valor;
	}
	
}
