package com.karenngomes.sistema.implementacao;

public class Recurso {
	//protected String nome;
	protected long codigo;
	protected StatusRecurso statusRecurso;
	protected TipoRecurso tipoRecurso;
	protected DataHora inicio;
	protected DataHora termino;
	protected Usuario responsavel;//so pode ser professor,pesquisador ou adm
	
	public StatusRecurso getStatusRecurso() {
		return statusRecurso;
	}
	public void setStatusRecurso(StatusRecurso statusRecurso) {
		this.statusRecurso = statusRecurso;
	}
	public TipoRecurso getTipoRecurso() {
		return tipoRecurso;
	}
	public void setTipoRecurso(TipoRecurso tipoRecurso) {
		this.tipoRecurso = tipoRecurso;
	}
	public DataHora getInicio() {
		return inicio;
	}
	public void setInicio(DataHora inicio) {
		this.inicio = inicio;
	}
	public DataHora getTermino() {
		return termino;
	}
	public void setTermino(DataHora termino) {
		this.termino = termino;
	}
	public Usuario getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Usuario responsavel) {
		this.responsavel = responsavel;
	}
	
	
	
}
