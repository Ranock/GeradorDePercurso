package br.com.programa.dto;

import java.util.List;

import br.com.programa.enumerados.Cor;

public class ConfiguracoesGeraisDto {

	private Integer coresTabuleiro;
	private List<String> mensagensUltimaCasa;
	private List<Integer> coresAvatar;
	
	public Integer getCoresTabuleiro() {
		return coresTabuleiro;
	}
	public void setCoresTabuleiro(Integer coresTabuleiro) {
		this.coresTabuleiro = coresTabuleiro;
	}
	public List<String> getMensagensUltimaCasa() {
		return mensagensUltimaCasa;
	}
	public void setMensagensUltimaCasa(List<String> mensagensUltimaCasa) {
		this.mensagensUltimaCasa = mensagensUltimaCasa;
	}
	public List<Integer> getCoresAvatar() {
		return coresAvatar;
	}
	public void setCoresAvatar(List<Integer> coresAvatar) {
		this.coresAvatar = coresAvatar;
	}
	
	
}
