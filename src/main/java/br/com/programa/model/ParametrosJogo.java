package br.com.programa.model;
public class ParametrosJogo {
	
	private int quantidadeCasas;
	private int quantidadeJogador;
	private Long tema;

	
	public int getQuantidadeCasas() {
		return quantidadeCasas;
	}
	public void setQuantidadeCasas(int quantidadeCasas) {
		this.quantidadeCasas = quantidadeCasas;
	}
	public int getQuantidadeJogador() {
		return quantidadeJogador;
	}
	public void setQuantidadeJogador(int quantidadeJogador) {
		this.quantidadeJogador = quantidadeJogador;
	}
	public Long getTema() {
		return tema;
	}
	public void setTema(Long tema) {
		this.tema = tema;
	}
	
}