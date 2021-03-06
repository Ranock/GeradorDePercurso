package br.com.programa.model.classes;

import java.util.ArrayList;
import java.util.List;

import br.com.programa.model.enumerados.NivelDeDificuldade;

public class Questao {
	private Long id;
	private NivelDeDificuldade dificuldade;
	private String enunciado;
	private List<OpcaoDaResposta> opcoes;
	private Tema tema;
	
	public NivelDeDificuldade getDificuldade() {
		return dificuldade;
	}
	public void setDificuldade(NivelDeDificuldade dificuldade) {
		this.dificuldade = dificuldade;
	}
	public String getEnunciado() {
		return enunciado;
	}
	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	public List<OpcaoDaResposta> getOpcoes() {
		if(opcoes == null )
			opcoes = new ArrayList<OpcaoDaResposta>();
		return opcoes;
	}
	public void setOpcoes(List<OpcaoDaResposta> opcoes) {
		this.opcoes = opcoes;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	
	public Tema getTema() {
		return tema;
	}
	public void setTema(Tema tema) {
		this.tema = tema;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Questao other = (Questao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	
}
