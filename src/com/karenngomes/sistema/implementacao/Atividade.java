package com.karenngomes.sistema.implementacao;

import java.util.ArrayList;

public class Atividade {
	protected long codigo;
	protected String titulo;
	protected String descricao;
	protected Usuario responsavel;
	protected ArrayList<Usuario> participantes = new ArrayList<Usuario>();
	protected TipoAtividade tipoAtividade;
	//material de apoio: melhor como classe, enum ou final?
}
