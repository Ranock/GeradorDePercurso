package br.com.programa.dto;

import java.util.List;

import br.com.programa.model.classes.OpcaoDaResposta;

public class QuestaoDto {
	private Integer dificuldade;
	private String enunciado;
	private List<OpcaoDaResposta> opcoes;
	private Long tema;
	
	public Integer getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(Integer dificuldade) {
		this.dificuldade = dificuldade;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public List<OpcaoDaResposta> getOpcoes() {
		return opcoes;
	}
	public void setOpcoes(List<OpcaoDaResposta> opcoes) {
		this.opcoes = opcoes;
	}
	public Long getTema() {
		return tema;
	}
	public void setTema(Long tema) {
		this.tema = tema;
	}
	
	
	
}
