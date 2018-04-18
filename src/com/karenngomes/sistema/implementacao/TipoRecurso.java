package com.karenngomes.sistema.implementacao;

public enum TipoRecurso {
	
	LABORATORIO(1), AUDITORIO(2), SALA(3), PROJETOR(4);
	
	private final int valor;
	
	TipoRecurso(int valorOpcao) {
		valor = valorOpcao;
	}
	
	public int getValor() {
		return valor;
	}
}
