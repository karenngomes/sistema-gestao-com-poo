package com.karenngomes.sistema.implementacao;

import java.util.ArrayList;
import java.util.Scanner;

public class AdmSistema extends Usuario {
	private String login = "admin";
	private String senha = "admin.123!";
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
	
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String nome) {
		this.login = nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void checarAdm() {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int flag = 1;
		
		System.out.println("Acesso do Administrador do Sistema");
		do {
			System.out.print("Digite seu login: ");
			String login = input.next();
			System.out.print("Digite a senha: ");
			String senha = input.next();
			if (login.equals(this.nome) && senha.equals(this.senha))
				return;
			else {
				System.out.println("Login ou senha incorretos!");
				System.out.println("Digite [1] para tentar novamente ou [0] para voltar");
				flag = input.nextInt();
			}
		} while(flag == 1);
		
		//input.close();
		
	}
}
