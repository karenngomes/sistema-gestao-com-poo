package com.karenngomes.sistema.implementacao;

import java.util.Scanner;

public class AdmSistema extends Usuario {
	private String nome = "admin";
	private String senha = "admin.123!";
	
	
	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	
	
	public void checarAdm() {
		Scanner entrada = new Scanner(System.in);
		//int opcao;
		int flag = 1;
		
		AdmSistema verifica = new AdmSistema();
		String login = verifica.getNome();
		String senha = verifica.getSenha();
		do {
			System.out.println("Acesso do Administrador do Sistema");
			System.out.print("Digite seu login: ");
			String loginVer = entrada.next();
			System.out.print("Digite a senha: ");
			String senhaVer = entrada.next();
			if (login.equals(loginVer) && senha.equals(senhaVer))
				return;
			else {
				System.out.println("Login ou senha incorretos!");
				System.out.println("Digite [1] para tentar novamente ou [0] para voltar");
				flag = entrada.nextInt();
			}
		} while(flag == 1);
		
		entrada.close();
	
	}
}
