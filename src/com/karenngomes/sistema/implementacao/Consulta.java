package com.karenngomes.sistema.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

public class Consulta {
	
	Scanner input = new Scanner(System.in);
	
	public void consultaPorUsuario(ArrayList<Usuario> usuarios) {
		int flag = 1, i = -1;
		int indiceUsuario = i;
		do {
			System.out.print("Digite o nome do usuario que deseja consultar: ");
			String nomeUsuario = input.next();
			for (@SuppressWarnings("unused") Usuario usuario : usuarios) {
				if (usuarios.get(i).getNome() == nomeUsuario)
					indiceUsuario = i;
			}
					
			if(indiceUsuario != -1){
				Usuario usuario = usuarios.get(indiceUsuario);
				usuario.dadosUsuario();
				if (usuario instanceof Professor) {
					//usuario.getClass().getSimpleName() teste = (usuario.getClass().getSimpleName())usuario;
					Professor professor = (Professor)usuario;
					System.out.println("Lista de recursos alocados:" + professor.getRecursosAlocados());
					System.out.println("Lista de atividades realizadas:" + professor.getAtividades());
				} else if (usuario instanceof Pesquisador) {
					Pesquisador pesquisador = (Pesquisador)usuario;
					System.out.println("Lista de recursos alocados:" + pesquisador.getRecursosAlocados());
					System.out.println("Lista de atividades realizadas:" + pesquisador.getAtividades());
				} /*else if ( (usuario instanceof AdmSistema)) {
					
				}*/
			} else {
				System.out.println("Usuario nao cadastrado no Sistema!");
				System.out.println("Digite [1] para tentar novamente ou [0] para voltar");
				flag = input.nextInt();
			}
		} while(flag == 1);
		
	}
	
	public void consultaPorRecurso(ArrayList<Recurso> recursos) {
		System.out.println("Digite a opcao do recurso que deseja consultar");
		System.out.println("[1] LABORATORIO"); 
		System.out.println("[2] AUDITORIO"); 
		System.out.println("[3] SALA"); 
		System.out.println("[4] PROJETOR");
		
		switch(input.nextInt()) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		default:
			break;
		}
	}
	
	
}
