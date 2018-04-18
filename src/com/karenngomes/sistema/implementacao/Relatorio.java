package com.karenngomes.sistema.implementacao;

import java.util.ArrayList;

public class Relatorio {
	
	private int alocado = 0;
	StatusRecurso statusRecurso;
	TipoAtividade tipoAtividade;
	
	public void gerarRelatorioRecurso(ArrayList<Recurso> recursos) {
		
		int emProcesso = 0, alocado = 0, emAndamento = 0, concluido = 0;
		
		for(int i = 0; i < recursos.size(); i++) {
			statusRecurso = recursos.get(i).statusRecurso;
			switch(statusRecurso) {
				case EM_PROCESSO:
					emProcesso++;
					break;
				case ALOCADO:
					alocado++;
					break;
				case ANDAMENTO:
					emAndamento++;
					break;
				case CONCLUIDO:
					concluido++;
					break;
			}
		}
		this.alocado = alocado;
		System.out.println("Numero de recursos 'em processo de alocacao': " + emProcesso);
		System.out.println("Numero de recursos 'alocado': " + alocado);
		System.out.println("Numero de recursos 'em andamento': " + emAndamento);
		System.out.println("Numero de recursos 'concluido': " + concluido);
		
	}
	
	public void gerarRelatorioTotalAlocacoes(ArrayList<Recurso> recursos) {
		System.out.println("Total de alocacoes: " + this.alocado);
	}
	
	public void gerarRelatorioAtividadePorTipo(ArrayList<Atividade> atividades)  {
		int aula = 0, apresentacao = 0, laboratorio = 0;
		
		for(int i = 0; i < atividades.size(); i++) {
			tipoAtividade = atividades.get(i).tipoAtividade;
			switch(tipoAtividade) {
				case AULA:
					aula++;
					break;
				case APRESENTACAO:
					apresentacao++;
					break;
				case LABORATORIO:
					laboratorio++;
					break;
			}
		}
		
		System.out.println("Numero de atividades do tipo 'aula tradicional': " + aula);
		System.out.println("Numero de atividades do tipo 'apresentacao': " + apresentacao);
		System.out.println("Numero de atividades do tipo 'laboratorio': " + laboratorio);
	}
	
}
