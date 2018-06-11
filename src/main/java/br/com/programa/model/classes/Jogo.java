package br.com.programa.model.classes;

import java.util.ArrayList;
import java.util.List;

public class Jogo {
	private String nome;
	private Tema tema;
	private List<Casa> casa;  
	private List<Questao> questoes;
	private List<Avatar> avatares;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	
	public List<Casa> getCasa() {
		if(casa == null) 
			casa = new ArrayList<Casa>();
		return casa;
	}

	public void setCasa(List<Casa> casa) {
		this.casa = casa;
	}
	

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public List<Avatar> getAvatares() {
		return avatares;
	}

	public void setAvatares(List<Avatar> avatares) {
		this.avatares = avatares;
	}




	
	
	
}
