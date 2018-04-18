package com.karenngomes.sistema.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.karenngomes.sistema.implementacao.*;

public class Menus {
	
	static ArrayList<Usuario> usuariosSistema = new ArrayList<Usuario>();
	Scanner input = new Scanner(System.in);
	
	public void callMainMenu() {

		int flag = 1;
		
		do {
			//opcao = 1;
			//flag = 1;
			System.out.println("Sistema de Gestao");
			System.out.println("- Digite a opcao desejada -");
			System.out.println("[1] Entrar no sistema");
			System.out.println("[2] Cadastrar");
			System.out.println("[0] Sair");
			
			int opcao = Integer.parseInt(input.nextLine());
			//tratar excecao
			flag = opcao;
			
			
			switch(opcao) {
			case 1:
				
				break;
					
			case 2:
				
				//alocacao.menuAlocacao();
			case 3:

				break;
			default:
				break;
			}
		} while(flag != 0);
		
		//input.close();
	}
	
	public void callLoginMenu() {
		//AdmSistema admin = new AdmSistema();
		/*admin.checarAdm();
		System.out.println("[2] Consultar por usuario");
		System.out.println("[3] Consultar por recurso");
		System.out.println("[4] Relatorio das atividades da Unidade Academica");*/
		int flag = 1;
		
		do {
			//opcao = 1;
			//flag = 1;
			System.out.println("Tela de Login");
			System.out.println("- Digite a opcao desejada -");
			System.out.println("[1] Entrar como Admnistrador do Sistema");
			System.out.println("[2] Entrar como Aluno");
			System.out.println("[3] Entrar como Professor");
			System.out.println("[4] Entrar como Pesquisador");
			System.out.println("[0] Sair");
			
			int opcao = Integer.parseInt(input.nextLine());
			//tratar excecao
			flag = opcao;
			
			
			switch(opcao) {
			case 1:
				
				break;
					
			case 2:
				
				//alocacao.menuAlocacao();
			case 3:

				break;
			case 4:
	
				break;

			default:
				break;
			}
		} while(flag != 0);
	}
}
