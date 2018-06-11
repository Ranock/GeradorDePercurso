package br.com.programa.model.enumerados;

public enum Cor {
	AZUL(0), VERMELHO(1), AMARELO(2), PRETO(3), VERDE(4), ROSA(5), ROXO(6);
	
	private int valor;

	private Cor(int valor) {
		this.valor = valor;
	}

	public int getValor() {
		return valor;
	}
	
	
}
