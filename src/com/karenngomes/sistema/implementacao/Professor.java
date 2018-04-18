package com.karenngomes.sistema.implementacao;

import java.util.ArrayList;

public class Professor extends Usuario {
	ArrayList<Recurso> recursosAlocados = new ArrayList<Recurso>(); 
	ArrayList<Atividade> atividades = new ArrayList<Atividade>();
	boolean associadoRecursoEmAndamento = false;//se estiver true ja esta associada, so pode um
	
	public ArrayList<Recurso> getRecursosAlocados() {
		return recursosAlocados;
	}
	public void setRecursosAlocados(ArrayList<Recurso> recursosAlocados) {
		this.recursosAlocados = recursosAlocados;
	}
	public ArrayList<Atividade> getAtividades() {
		return atividades;
	}
	public void setAtividades(ArrayList<Atividade> atividades) {
		this.atividades = atividades;
	} 
	
	
	
}
