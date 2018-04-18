package com.karenngomes.sistema.implementacao;

public class Usuario {
	protected String nome;
	protected String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void dadosUsuario() {
		System.out.print("Nome do usuario: " + this.getNome());
		System.out.print("Email do usuario: " + this.getEmail());
	}
	
}
