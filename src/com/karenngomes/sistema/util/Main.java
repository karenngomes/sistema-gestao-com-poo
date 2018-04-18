package com.karenngomes.sistema.util;

import java.util.ArrayList;
import java.util.Scanner;
import com.karenngomes.sistema.implementacao.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sistema de Gestão");
		ArrayList<Usuario> usuariosSistema = new ArrayList<Usuario>();
		AdmSistema admin = new AdmSistema();
		
		Scanner entrada = new Scanner(System.in);
		int flag = 1;
		int opcao;
		
		
		do {
			System.out.println("Sistema de Gestao");
			System.out.println("- Digite a opcao desejada -");
			System.out.println("[1] Entrar como Administrador do Sistema");
			System.out.println("[2] Alocacao de Recursos");
			System.out.println("[3] Consulta por usuario");
			System.out.println("[4] Consulta por recurso");
			System.out.println("[5] Relatorio das atividades da Unidade Academica");
			System.out.println("[0] Sair");
			
			opcao = entrada.nextInt();
			//tratar excecao
			flag = opcao;
			
			
			
			
			switch(opcao) {
			case 1:
				admin.checarAdm();
				
				break;
					
			case 2:
				
				//alocacao.menuAlocacao();
			case 3:

				break;
			case 4:
	
				break;
			case 5:

				break;
			default:
				break;
			}
		} while(flag != 0);
		
		entrada.close();
	}
	

}
