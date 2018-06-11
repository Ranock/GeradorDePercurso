package br.com.programa.model.builder;

import java.util.List;

import br.com.programa.model.classes.Avatar;
import br.com.programa.model.classes.Casa;
import br.com.programa.model.classes.ConfiguracoesGerais;
import br.com.programa.model.classes.Jogo;
import br.com.programa.model.classes.Questao;
import br.com.programa.model.classes.Tema;

public class JogoBuilder implements IJogoBuilder {
	private List<Casa> casas;
	private List<Questao> questoes;
	private String nome;
	private Tema tema;
	private List<Avatar> avatares;

	@Override
	public IJogoBuilder casas(List<Casa> casas) {
		this.casas = casas;
		return this;
	}

	@Override
	public IJogoBuilder perguntas(List<Questao> questoes) {
		this.questoes = questoes;
		return this;
	}

	@Override
	public IJogoBuilder nome(String nome) {
		this.nome = nome;
		return this;
	}

	@Override
	public IJogoBuilder tema(Tema tema) {
		this.tema = tema;
		return this;
	}

	@Override
	public Jogo build() {
		Jogo jogo = new Jogo();
		jogo.setCasa(this.casas);
		jogo.setNome(this.nome);
		jogo.setQuestoes(this.questoes);
		jogo.setTema(this.tema);
		jogo.setAvatares(this.avatares);
		return jogo;
	}

	@Override
	public IJogoBuilder avatares(List<Avatar> avatares) {
		this.avatares = avatares;
		return this;
	}

}
