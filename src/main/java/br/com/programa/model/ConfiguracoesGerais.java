package br.com.programa.model;

import java.util.ArrayList;
import java.util.List;

import br.com.programa.enumerados.Cor;

public class ConfiguracoesGerais {
	private Cor corTabuleiro;
	private List<String> mensagensUltimaCasa;
	private List<Cor> coresAvatar;
	
	public Cor getCorTabuleiro() {
		return corTabuleiro;
	}
	public void setCoresTabuleiro(Cor corTabuleiro) {

		this.corTabuleiro = corTabuleiro;
	}
	public List<String> getMensagensUltimaCasa() {
		if (mensagensUltimaCasa == null)
			mensagensUltimaCasa = new ArrayList<String>();
		return mensagensUltimaCasa;
	}
	public void setMensagensUltimaCasa(List<String> mensagensUltimaCasa) {
	
		this.mensagensUltimaCasa = mensagensUltimaCasa;
	}
	public List<Cor> getCoresAvatar() {
		if (coresAvatar == null)
			coresAvatar = new ArrayList<Cor>();
		return coresAvatar;
	}
	public void setCoresAvatar(List<Cor> coresAvatar) {
		this.coresAvatar = coresAvatar;
	}
	
	
	
	
	

}
